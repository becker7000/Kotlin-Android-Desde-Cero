
fun main(){

    var opcion = 0

    do{
        print("""
            +---------MENÚ--------+
            | 1. Primera opción   |
            | 2. Segunda opción   |
            | 3. Tercera opción   |
            | 4. Cuarta opción    |
            | 5. Salir            |
            +---------------------+
        """.trimIndent())

        print("\n\t Opción: ")
        opcion = readln().toInt()

    }while(opcion<1 || opcion>5)

    println("\n\t Opción válida...")

}