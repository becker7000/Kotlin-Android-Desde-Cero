
fun main(){

    // Cuando solicitamos un dato de la consola usar print
    print("\n\t Escribe la hora del día en formato 24hr: ")
    val hora : Int = readln().toInt()

    if(hora<12){
        print("\n\t Buenos días! ")
    }else{ // Toma en cuenta el complemento
        print("\n\t Buenas tardes! ")
    }

}