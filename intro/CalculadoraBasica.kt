fun main() {

    print("Ingresa el primer número: ")
    val numero1 = readln().toDouble()

    print("Ingresa el segundo número: ")
    val numero2 = readln().toDouble()

    val suma = numero1 + numero2
    val resta = numero1 - numero2
    val multiplicacion = numero1 * numero2
    val division = numero1 / numero2

    print("\n\t $numero1 + $numero2 = $suma")
    print("\n\t $numero1 - $numero2 = $resta")
    print("\n\t $numero1 * $numero2 = $multiplicacion")
    print("\n\t $numero1 / $numero2 = ${String.format("%.2f",division)}")

}
