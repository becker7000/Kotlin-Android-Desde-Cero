import kotlin.math.pow

fun main() {

    // Definir dos valores enteros
    print("\n\t Escribe un entero: ")
    val num1 : Int = readln().toInt()

    print("\n\t Escribe otro entero: ")
    val num2 : Int = readln().toInt()

    // Variable para almacenar el resultado de las comparaciones
    // Comparar si la suma de num1 y num2 es mayor que 15
    var resultado: Boolean = (num1 + num2) > 15
    println("\n\t($num1 + $num2) > 15: $resultado")

    // Comparar si el producto de num1 y num2 es igual a 88
    resultado = (num1 * num2) == 88
    println("\n\t($num1 * $num2) == 88: $resultado")

    // Comparar si la resta de num1 y num2 es negativa
    resultado = (num1 - num2) < 0
    println("\n\t($num1 - $num2) < 0: $resultado")

    // Comparar si el cuadrado de num1 es mayor que el doble de num2
    resultado = (num1.toDouble().pow(2)) > (num2 * 2)
    println("\n\t(${num1}^2) > (${num2} * 2): $resultado")

    // Comparar si el módulo de la división de num2 entre num1 es igual a 3
    resultado = (num2 % num1) == 3
    println("\n\t($num2 % $num1) == 3: $resultado")

}
