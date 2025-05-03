import java.time.LocalDate
import java.time.DayOfWeek
// Kotlin no cuenta con sus propias librerías para fechas

fun main() {

    val hoy = LocalDate.now()
    val diaSemana = hoy.dayOfWeek

    println("Hoy es: $diaSemana")

    when (diaSemana) {
        DayOfWeek.MONDAY -> println("¡Ánimo! Es lunes.")
        DayOfWeek.TUESDAY -> println("Martes con energía.")
        DayOfWeek.WEDNESDAY -> println("Mitad de semana.")
        DayOfWeek.THURSDAY -> println("Jueves casi viernes.")
        DayOfWeek.FRIDAY -> println("¡Por fin viernes!")
        DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> println("Es fin de semana 🎉")
    } // con windows + . podemos insertar emojis

}
