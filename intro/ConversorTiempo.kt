
fun main() {

    print("\n\t Ingresa una cantidad de segundos: ")
    val totalSegundos = readln().toInt()

    val minutos = totalSegundos / 60
    val segundosRestantes = totalSegundos % 60

    println("\n\t $totalSegundos segundos son equivalentes a $minutos minutos con $segundosRestantes segundos.")

}
