package mx.ipn.cic.activitynavigationexample // Define el paquete donde se encuentra esta clase

import java.io.Serializable // Importa la interfaz Serializable para permitir que objetos de esta clase se pasen entre Activities

// Clase de datos llamada ProductDTO que representa un producto
// El constructor primario define tres propiedades con valores por defecto
class ProductDTO(
    var productName: String = "",       // Nombre del producto (cadena vacía por defecto)
    var productPrice: Double = 0.0,     // Precio del producto (0.0 por defecto)
    var stock: Int = 0                  // Cantidad en stock (0 por defecto)
) : Serializable {                      // Implementa Serializable para permitir que se pase como extra en un Intent

    // Mé_todo que devuelve el nombre completo con precio (opcional, útil para mostrar en UI o logs)
    fun fullName(): String {
        return "$productName Price: $productPrice"
    }

    // Sobrescribe el mé_todo toString() para devolver una representación en texto del objeto
    override fun toString(): String {
        return "ProductDTO(productName='$productName', productPrice=$productPrice, stock=$stock)"
    }

    // Nota: Hay un constructor vacío comentado que no es necesario porque los valores por defecto ya lo permiten
    // constructor() : this("", 0.0, 0)
}
