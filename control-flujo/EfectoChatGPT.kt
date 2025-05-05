
fun main(){

    val mensaje = "Hola a todos con efecto chatGPT desde Kotlin"
    var i = 0
    var j = 0

    print("\n\t Mensaje: ")
    while(i<mensaje.length){
        j=0
        print("\n")
        while(j<=i){ // While anidado
            print(" ")
            j++
        }
        print("${mensaje[i]}")
        Thread.sleep(250)
        i++
    }

}

