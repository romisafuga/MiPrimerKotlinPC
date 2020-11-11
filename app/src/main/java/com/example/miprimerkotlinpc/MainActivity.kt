package com.example.miprimerkotlinpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miprimerkotlinpc.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener { toast("Mensaje: ${input.text}")
                                boton.text = "Cambio"}
    }
}


