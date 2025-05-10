package mx.ipn.cic.activitynavigationexample; // Define el paquete donde se encuentra esta clase

import java.io.Serializable; // Importa la interfaz Serializable para permitir enviar esta clase entre Activities

// Clase Java que representa un usuario, implementa Serializable para que pueda ser enviada a través de un Intent
public class UserDTO implements Serializable {

    // Atributos privados de la clase
    private String name;       // Nombre del usuario
    private String lastname;   // Apellido del usuario
    private int age;           // Edad del usuario

    // Constructor vacío: necesario para frameworks o cuando se necesita crear el objeto sin inicializarlo al principio
    public UserDTO() {
    }

    // Constructor con parámetros: permite crear un objeto UserDTO directamente con todos sus atributos
    public UserDTO(String name,
                   String lastname,
                   int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    // Métodos getter y setter para acceder y modificar los atributos de forma controlada

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Mé_todo personalizado que devuelve el nombre completo del usuario
    public String getFullName() {
        return String.format("%s %s", this.name, this.lastname);
    }

    // Sobrescribe el mé_todo toString() para proporcionar una representación legible del objeto
    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
