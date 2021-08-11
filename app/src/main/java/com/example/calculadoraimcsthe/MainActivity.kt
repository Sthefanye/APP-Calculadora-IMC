package com.example.calculadoraimcsthe

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    Variáveis que recebem os valores altura e peso, e para mostrar resultado
    private var altura: EditText? = null
    private var peso: EditText? = null
    private var txt_resultado: TextView? = null
//    Variáveis pra mudar cor linha 1

    private var button: Button? = null
    private var menor: TextView? = null
    private var magreza: TextView? = null
    private var zero: TextView? = null

//    Variáveis pra mudar cor linha 2
    private var entre: TextView? = null
    private var normal: TextView? = null
    private var zero2: TextView? = null

//    Variáveis pra mudar cor linha 3
    private var entre2: TextView? = null
    private var sobrepeso: TextView? = null
    private var grauI: TextView? = null

    //    Variáveis pra mudar cor linha 4
    private var entre3: TextView? = null
    private var obesidade: TextView? = null
    private var grauII: TextView? = null

    //    Variáveis pra mudar cor linha 5
    private var entre4: TextView? = null
    private var obesidade_grave: TextView? = null
    private var grauIII: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    Procura as variáveis para input
        altura = findViewById<View>(R.id.altura) as EditText
        peso = findViewById<View>(R.id.peso) as EditText
        txt_resultado = findViewById<View>(R.id.resultado) as TextView

//    Procura  as variáveis da linha 1
        menor = findViewById<View>(R.id.menor) as TextView
        magreza = findViewById<View>(R.id.magreza) as TextView
        zero = findViewById<View>(R.id.zero) as TextView

//    Procura as variáveis da linha 2
        entre = findViewById<View>(R.id.entre) as TextView
        normal = findViewById<View>(R.id.normal) as TextView
        zero2 = findViewById<View>(R.id.zero2) as TextView

//    Procura as variáveis da linha 3
        entre2 = findViewById<View>(R.id.entre2) as TextView
        sobrepeso = findViewById<View>(R.id.sobrepeso) as TextView
        grauI = findViewById<View>(R.id.grauI) as TextView

//    Procura as variáveis da linha 3
        entre3 = findViewById<View>(R.id.entre3) as TextView
        obesidade = findViewById<View>(R.id.obesidade) as TextView
        grauII = findViewById<View>(R.id.grauII) as TextView

//    Procura as variáveis da linha 3
        entre4 = findViewById<View>(R.id.entre4) as TextView
        obesidade_grave = findViewById<View>(R.id.obesidade_grave) as TextView
        grauIII = findViewById<View>(R.id.grauIII) as TextView


//    Botão
        button = findViewById<View>(R.id.btn_calcular) as Button
        btn_calcular?.setOnClickListener(View.OnClickListener {
            clear()
            calcular()
        })

    }

    fun calcular() {

        val ed_altura: Float
        val ed_peso: Float

        ed_altura = altura!!.text.toString().toFloat()
        ed_peso = peso!!.text.toString().toFloat()
        var imc = ed_peso/(ed_altura*ed_altura)
        txt_resultado?.setText("Seu IMC: " + imc )

        if (imc <= 18.5){
            menor?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            magreza?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            zero?.setBackgroundColor(Color.parseColor("#E0FFFF"))
        }
        else if (imc >= 18.6 && imc <= 24.9){
            entre?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            normal?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            zero2?.setBackgroundColor(Color.parseColor("#E0FFFF"))
        }

        else if (imc >= 25.0 && imc <= 29.9){
            entre2?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            sobrepeso?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            grauI?.setBackgroundColor(Color.parseColor("#E0FFFF"))
        }

        else if (imc >= 30.0 && imc <= 39.9){
            entre3?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            obesidade?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            grauII?.setBackgroundColor(Color.parseColor("#E0FFFF"))
        }

        else if (imc >= 40.0){
            entre4?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            obesidade_grave?.setBackgroundColor(Color.parseColor("#E0FFFF"))
            grauIII?.setBackgroundColor(Color.parseColor("#E0FFFF"))
        }
    }

    fun clear(){
        menor?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        magreza?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        zero?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        entre?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        normal?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        zero2?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        entre2?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        sobrepeso?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        grauI?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        entre3?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        obesidade?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        grauII?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        entre4?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        obesidade_grave?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        grauIII?.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
    }

}
