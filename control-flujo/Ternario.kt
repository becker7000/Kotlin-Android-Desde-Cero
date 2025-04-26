
fun main() {

    print("\n\t Escribe tu edad: ")
    val edad = readln().toInt()

    val resultado = if (edad >= 18) "Mayor de edad" else "Menor de edad"

    println("\n\t Resultado: $resultado")

}
