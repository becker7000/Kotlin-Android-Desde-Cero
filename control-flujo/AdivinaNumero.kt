
fun main() {

    val numeroSecreto = (1..100).random() // El número aleatorio entre 1 y 100
    var intento = -1
    var intentosRealizados = 0

    print("\n\t ¡Bienvenido al juego de Adivina el número!")
    println("\n\t Estoy pensando en un número entre 1 y 100. ¡Intenta adivinarlo!")

    // El bucle seguirá hasta que el jugador adivine el número secreto
    while (intento != numeroSecreto) {
        print("\t Escribe tu intento: ")
        intento = readln().toInt()
        intentosRealizados++
        when {
            intento < numeroSecreto -> println("\t El número es mayor. ¡Intenta otra vez!")
            intento > numeroSecreto -> println("\t El número es menor. ¡Intenta otra vez!")
            else -> println("\n\t ¡Felicidades! Adivinaste el número en $intentosRealizados intentos.")
        }
    }

}
