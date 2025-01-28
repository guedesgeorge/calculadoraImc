package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesoStr: String = edtPeso.text.toString().toString()
            val alturaStr: String = edtAltura.text.toString().toString()

            // Aqui valida se um texto é vazio ou não
            if (pesoStr == "" || alturaStr == "") {

                //  A função abaixo mostra ao usuario uma mensagem caso ela não preencha os campos
                Snackbar
                    .make(
                        edtPeso,
                        "Prencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()

            }else{

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2
                println("Acão do bottom " + resultado)
            }

        }
    }
}