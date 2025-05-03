
fun main(){

    val passCorrecta = "kotlin123"
    var passEntrada = ""

    while(passEntrada!=passCorrecta){
        print("\n\t Escribe la contraseña: ")
        passEntrada = readln()
    }

    println("\n\t La contraseña es correcta...")

}