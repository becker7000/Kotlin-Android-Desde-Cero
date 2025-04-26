
fun main(){

    print("\n\t Escribe tu calificación: ")
    val nota : Int = readln().toInt()

    if(nota>=90){
        println("\n\t Excelente!")
    }else if (nota>=80){
        println("\n\t Buena")
    }else if(nota>=70){
        println("\n\t Regular")
    }else if (nota>=60){
        println("\n\t Suficiente")
    }else{
        println("\n\t Reprobatoria")
    }

}