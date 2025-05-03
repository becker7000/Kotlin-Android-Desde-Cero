
fun main(){

    print("\n\t Mostrar la tabla de multiplicar del: ")
    val num : Int = readln().toInt()
    var i = 1

    while(i<=10){
        print("\n\t $num x $i = ${num*i}")
        i++
    }

}