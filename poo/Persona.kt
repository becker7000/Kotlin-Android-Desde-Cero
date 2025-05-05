class Persona(
    val nombre: String,
    var edad : Int
) {
    fun saludar(){
        println("\n\t Hola, mi nombre es $nombre y tengo $edad años")
    }
}