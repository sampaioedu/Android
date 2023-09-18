package com.example.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextusuario: EditText
    private lateinit var editText1234: EditText
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextusuario = findViewById<EditText>(R.id.editTextusuario)
        editText1234 = findViewById<EditText>(R.id.editText1234)
        button = findViewById(R.id.button)

        button.setOnClickListener{

            formulario ()
        }
    }
    private fun formulario () : Boolean {

        var error = false

        if (editTextusuario.text.isEmpty()){

            editTextusuario.error = "Digite Seu Usuário"
            error = true
        }

        if (editText1234.text.isEmpty()){

            editText1234.error = "Digite sua Senha"
            error = true
        }

        return error
    }

}

