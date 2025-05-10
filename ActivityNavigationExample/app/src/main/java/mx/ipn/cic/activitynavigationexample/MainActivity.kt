package mx.ipn.cic.activitynavigationexample // Define el paquete del proyecto, útil para la organización del código

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

// Clase principal que extiende de AppCompatActivity, lo que indica que es una Activity
class MainActivity : AppCompatActivity() {

    // Declaración de variables para el botón y los campos de texto (se inicializan más adelante)
    // variables que se inicializarán más adelante, pero que no pueden ser null
    lateinit var btnNavega: Button
    lateinit var etCampoTexto: EditText
    lateinit var etCampoNumerico: EditText

    // Mé_todo que se llama al crear la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asocia el archivo XML del layout con esta actividad

        // Asigna los elementos de la interfaz a las variables declaradas
        this.etCampoTexto = findViewById(R.id.etCampoTexto)
        this.etCampoNumerico = findViewById(R.id.etCampoNumerico)
        this.btnNavega = findViewById(R.id.btnNavega)

        // Define el comportamiento del botón cuando se hace clic en él
        this.btnNavega.setOnClickListener {

            Log.d("MPS", "Navegando a Activity 2") // Muestra un mensaje en el log de depuración

            val intent = Intent(this, Activity2::class.java) // Crea un Intent para ir a Activity2

            // Extrae el texto del campo de texto y lo añade al intent como un extra
            intent.putExtra("argumentoString", this.etCampoTexto.text.toString())

            // Convierte el texto numérico a Long, si es posible
            val numeroString = this.etCampoNumerico.text.toString()
            val numeroLong: Long? = numeroString.toLongOrNull() // Devuelve null si no es un número válido

            intent.putExtra("argumentoLong", numeroLong) // Añade el número (o null) al intent

            intent.putExtra("unBoolean", true) // Añade un valor booleano simple al intent

            // Crea una instancia de UserDTO con datos estáticos
            val persona = UserDTO("Manuel", "Pérez", 33)
            intent.putExtra("persona", persona) // Añade el objeto persona al intent

            // Crea una instancia de ProductDTO con todos los datos desde el constructor
            val producto1 = ProductDTO(
                "Producto1",
                100.00,
                20
            )

            // Crea un producto vacío y luego le asigna nombre manualmente
            val producto2 = ProductDTO()
            producto2.productName = "Chocolates"

            // Añade ambos productos al intent
            intent.putExtra("producto1", producto1)
            intent.putExtra("producto2", producto2)

            this.startActivity(intent) // Inicia la nueva actividad

            // this.finish() // (comentado) Esto cerraría la actividad actual para que no quede en el historial
        }
    }
}
