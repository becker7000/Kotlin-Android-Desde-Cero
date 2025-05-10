package mx.ipn.cic.activitynavigationexample // Paquete al que pertenece esta clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

// Segunda Activity que muestra los datos enviados desde MainActivity
class Activity2 : AppCompatActivity() {

    // Declaración de variables para el botón flotante y los TextViews
    lateinit var fabBack: FloatingActionButton
    lateinit var tvTexto: TextView
    lateinit var tvNumero: TextView

    // Método que se ejecuta cuando se crea la Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2) // Asocia el layout XML correspondiente

        // Inicialización de los TextViews con los elementos del layout
        this.tvTexto = findViewById(R.id.tvTexto)
        this.tvNumero = findViewById(R.id.tvNumero)

        // Inicialización del botón flotante y su listener para cerrar la actividad
        this.fabBack = findViewById(R.id.fabBack)
        this.fabBack.setOnClickListener {
            this.finish() // Finaliza la Activity y vuelve a la anterior
        }

        // Recupera los extras enviados desde MainActivity
        val cadena = this.intent.getStringExtra("argumentoString") // Recupera el string
        val valorLong = this.intent.getLongExtra("argumentoLong", -1) // Recupera el número long (si no existe, devuelve -1)
        val unBoolean = this.intent.getBooleanExtra("unBoolean", false) // Recupera el booleano

        // Imprime los valores en el Logcat para depuración
        Log.d("EAB", "Valor String: $cadena")
        Log.d("EAB", "Valor Long: $valorLong")
        Log.d("EAB", "Valor Boolean: $unBoolean")

        // Muestra los valores en los TextViews
        tvTexto.text = cadena
        tvNumero.text = "$valorLong"

        // Recupera el objeto persona (UserDTO), lo convierte y muestra su nombre completo en log
        val persona = intent.getSerializableExtra("persona") as UserDTO
        Log.d("EAB", persona.fullName)

        // Recupera los objetos producto y muestra su nombre completo en el log
        val prod1 = intent.getSerializableExtra("producto1") as ProductDTO
        Log.d("EAB", prod1.fullName())

        val prod2 = intent.getSerializableExtra("producto2") as ProductDTO
        Log.d("EAB", prod2.fullName())
    }

    // Sobrescribe el comportamiento del botón de retroceso del sistema
    override fun onBackPressed() {
        Log.d("EAB", "Evitando el back") // No hace nada más que registrar un mensaje (bloquea el botón back)
        // Si quisieras permitir el comportamiento por defecto, deberías llamar a: super.onBackPressed()
    }
}
