
fun main() {

    // Solicitar al usuario un número entero
    print("\n\t Introduce un número entero:")
    val numero = readln().toInt()

    // Verificar si el número está dentro del rango 2, 3, 4 o 5
    if (numero in 2..5) {
        println("\n\t Dentro del rango")
    } else {
        println("\n\t Fuera de rango")
    }

}
