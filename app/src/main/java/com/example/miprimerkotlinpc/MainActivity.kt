package com.example.miprimerkotlinpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val inputText = findViewById<TextView>(R.id.editTextMessage)
         inputText.text = "Hola Android"
        /* editTextMessage.text = "Hola Android" */

        val email = findViewById<EditText>(R.id.editTextMail)
        val phone = findViewById<EditText>(R.id.editTextPhone)

        Log.d(tag,"OnCreate")

        boton.setOnClickListener { Log.d(tag,"ejecutar boton")
                                 toast("Mensaje: ${editTextMessage.text} Email: ${editTextMail.text} " +
                                         "Phone: ${editTextPhone.text}" )
                                boton.text = "Cambio"}
    }

    override fun onStart() {
        Log.d(tag,"OnStart")
        super.onStart()

    }

    override fun onResume() {
        Log.d(tag,"OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag,"OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag,"OnStop")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d(tag,"OnDestroy")
        super.onDestroy()
    }


}


