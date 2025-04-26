
fun main() {

    print("\n\t Escribe tu nombre completo: ")
    val nombreCompleto = readln()

    val longitud = nombreCompleto.length
    val enMayusculas = nombreCompleto.uppercase()
    val enMinusculas = nombreCompleto.lowercase()
    val primerCaracter = nombreCompleto[0]
    val contieneEspacio = nombreCompleto.contains(" ")
    val reemplazo = nombreCompleto.replace("a", "@", ignoreCase = true)
    val palabras = nombreCompleto.split(" ")

    print("\n\t Nombre completo: $nombreCompleto")
    print("\n\t Número de caracteres: $longitud")
    print("\n\t En mayúsculas: $enMayusculas")
    print("\n\t En minúsculas: $enMinusculas")
    print("\n\t Primer carácter: $primerCaracter")
    print("\n\t ¿Contiene espacio?: $contieneEspacio")
    print("\n\t Reemplazando 'a' por '@': $reemplazo")
    print("\n\t Primera palabra del nombre: ${palabras[0]}")

}
