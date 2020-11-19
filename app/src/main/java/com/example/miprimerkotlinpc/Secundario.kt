package com.example.miprimerkotlinpc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Secundario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secundario)

        /* al crear los atributos en el archivo attrbs no ahorramos
        la lineas siguientes ya que tdo se hace enel diseño
         */
       /* val cover = findViewById<AspectRatioImageView>(R.id.cover)
        cover.ratio = 1.5f */
    }

}