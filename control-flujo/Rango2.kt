
fun main() {

    // Solicitar al usuario un número entero
    print("\n\t Introduce un número entero:")
    val numero = readln().toInt()

    // Verificar si el número está dentro de los rangos 5, 6, 7 o 10, 11, 12
    if (numero in 5..7 || numero in 10..12) {
        println("\n\t Dentro del rango")
    } else {
        println("\n\t Fuera de rango")
    }
}
