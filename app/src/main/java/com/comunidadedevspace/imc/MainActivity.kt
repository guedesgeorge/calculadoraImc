package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Recuperar os componetes EditText
        // Criar uma variavel e associar um componente de UI<EditText>
        // Recuperar o botão da tela
        // Colocar ação no botão que é setOnClickListener
        // recuperar o botão da tela


        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{
            val peso = edtPeso.text
            val altura = edtAltura.text

            println("Acão do bottom " + peso + "a altura " + altura)
        }
    }
}