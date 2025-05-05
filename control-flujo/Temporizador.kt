
fun main(){

    print("\n\t Escribe los segundos: ")
    var segundos : Int = readln().toInt() // Variable de control

    while (segundos>0){ // segundos>=1  condición
        print("\n\t Faltan: $segundos segundos")
        Thread.sleep(1000)
        segundos-- // Decremento
    }

    print("\n\t FIN DEL CONTEO")

}