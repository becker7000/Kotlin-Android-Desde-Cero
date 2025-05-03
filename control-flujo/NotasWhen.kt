fun main() {

    print("\n\t Escribe tu calificación: ")
    val nota : Int = readln().toInt()

    when (nota) {
        100 -> println("\n\t Perfecta")
        in 90..99 -> println("\n\t Excelente")
        in 80..89 -> println("\n\t Buena")
        in 70..79 -> println("\n\t Regular")
        in 60..69 -> println("\n\t Suficiente")
        else -> println("\n\t Reprobatoria")
    }

}
