
fun main(){

    var edad = -1

    println("\n\t Debes tener entre 10 y 80 años.")
    while(edad<10 || edad>80){
        print("\n\t Escribe tu edad: ")
        edad = readln().toInt()
    }

    println("\n\t Edad válida...")

}