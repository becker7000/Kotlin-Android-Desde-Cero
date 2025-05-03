
fun main(){

    var suma = 0
    var valor = -1

    println("\n\t Escribe valores enterps para sumarlos y 0 para terminar")
    while(valor!=0){
        print("\t Sumar: ")
        valor = readln().toInt()
        suma+=valor
    }

    println("\n\t La suma final es: $suma")

}