import kotlin.math.PI
import kotlin.math.pow

fun main() {

    // Usamos textblock para imprimir el menú de opciones
    val menu = """
            +------------ Menú ------------------------+
            | Seleccione una opción:                   |
            | 1. Saludar                               |
            | 2. Calcular el área de un círculo        |
            | 3. Verificar si un número es par o impar |
            | 4. Salir                                 |
            +------------------------------------------+
    """.trimMargin()

    println(menu)

    // Solicitar al usuario que ingrese su opción
    println("\n\t > Opción:")
    val opcion : Int = readln().toInt()

    // Usamos when para manejar las opciones seleccionadas
    when (opcion) {
        1 -> {
            println("\n\t ¡Hola! ¿Cómo estás?")
        }
        2 -> {
            println("\n\t Escribe el radio del círculo:")
            val radio : Double = readln().toDouble()
            val area : Double = PI * radio.pow(2)
            println("\n\t El área del círculo es: ${String.format("%.3f",area)}")
        }
        3 -> {
            println("\n\t Escribe un número:")
            val numero : Int = readln().toInt()
            if (numero % 2 == 0) {
                println("\n\t El número $numero es par.")
            } else {
                println("\n\t El número $numero es impar.")
            }
        }
        4 -> {
            println("\n\t Saliendo del programa. ¡Vuelva pronto!")
        }
        else -> {
            println("\n\t Opción no válida. Por favor, elija una opción entre 1 y 4.")
        }
    }

}