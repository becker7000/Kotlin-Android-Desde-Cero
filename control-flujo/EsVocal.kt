
fun main() {

    // Hacer un apunte de los operadores lógicos...
    print("\n\t Ingresa una letra: ")
    val letra = readln().first()

    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        println("\n\t La letra '$letra' es una vocal.")
    } else {
        println("\n\t La letra '$letra' no es una vocal.")
    }

}
