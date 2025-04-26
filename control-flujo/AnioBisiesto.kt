
fun main() {

    println("\n\t Introduce un año:")
    val anio = readln().toInt()

    // Verificar si el año es bisiesto
    val esBisiesto = anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0

    // Imprimir si el año es bisiesto o no
    if (esBisiesto) {
        println("\n\t $anio es un año bisiesto.")
    } else {
        println("\n\t $anio no es un año bisiesto.")
    }
}
