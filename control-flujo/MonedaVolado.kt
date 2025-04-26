import kotlin.random.Random

fun main() {

    val resultado = if (Random.nextBoolean()) "Sool!" else "Aguila!"
    println("\n\t Resultado del volado: $resultado")

}
