import kotlin.math.PI
import kotlin.math.pow

fun main(){

    print("\n\t Escribe el radio del círculo: ")
    val radio : Double = readln().toDouble()

    val area = PI*radio.pow(2)

    println("\n\t El área del círculo es: ${String.format("%.3f",area)}")

}