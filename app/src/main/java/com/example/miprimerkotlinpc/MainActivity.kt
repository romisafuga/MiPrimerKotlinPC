package com.example.miprimerkotlinpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val inputText = findViewById<TextView>(R.id.editTextMessage)
         inputText.text = "Hola Android"
        /* editTextMessage.text = "Hola Android" */


        boton.setOnClickListener { toast("Mensaje: ${editTextMessage.text}")
                                boton.text = "Cambio"}
    }
}


