
fun main(){

    print("\n\t Sumar del 1 al: ")
    val maximo : Int = readln().toInt()

    var contador : Int = 1
    var suma :  Int = 0

    while( contador<=maximo ){
        suma+=contador
        contador++
    }

    println("\n\t La suma del 1 al $maximo es $suma")

}