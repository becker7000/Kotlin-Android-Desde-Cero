
fun main(){

    val planetas = listOf("Mercurio","Venus","Tierra","Marte")

    for((indice,planeta) in planetas.withIndex()){
        print("\n\t ${indice+1}. $planeta ")
    }

}