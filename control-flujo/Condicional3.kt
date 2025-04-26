
fun main(){

    print("\n\t Escribe un número real: ")
    val x : Double = readln().toDouble()

    if(x>0.0){
        print("\n\t Es positivo!")
    }

    if(x<0.0){
        print("\n\t Es negativo!")
    }

    if( x == 0.0){
        print("\n\t Es exactamente cero!")
    }

}