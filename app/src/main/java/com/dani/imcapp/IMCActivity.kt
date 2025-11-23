package com.dani.imcapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IMCActivity : AppCompatActivity() {
	
	private lateinit var txtNome: TextView
	private lateinit var txtPeso: TextView
	private lateinit var txtAltura: TextView
	private lateinit var txtIMC: TextView
	private lateinit var txtResultado: TextView
	private lateinit var imgClassificacao: ImageView
	private lateinit var btnVoltar: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_imc)
		
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		
		// RECEBENDO DADOS DA ACTIVITY ANTERIOR
		txtNome = findViewById(R.id.act2_nome)
		txtPeso = findViewById(R.id.act2_peso)
		txtAltura = findViewById(R.id.act2_altura)
		txtIMC = findViewById(R.id.act2_imc)
		txtResultado = findViewById(R.id.act2_resultado)
		imgClassificacao = findViewById(R.id.act2_img)
		btnVoltar = findViewById(R.id.act2_voltar_btn)
		
		// EVENTO DE CLICK PARA VOLTAR PARA ACTIVITY ANTERIOR
		btnVoltar.setOnClickListener { finish() }
		
		// LÓGICA PARA RECEBER OS DADOS E EXIBI-LOS NA TELA
		// BUNDLE - OBJETO QUE ARMAZENA PARES DE CHAVE-VALOR
		val bundle = intent.extras
		if (bundle != null) {
			val nome = bundle.getString("nome")?.uppercase()
			val peso = bundle.getDouble("peso")
			val altura = bundle.getDouble("altura")
			
			txtNome.text = "Nome: $nome"
			txtPeso.text = "Peso: $peso"
			txtAltura.text = "Altura: $altura"
			
			val imc = peso.toFloat() / (altura.toFloat() * altura.toFloat())
			txtIMC.text = "IMC: %.2f".format(imc)
			
			// EXIBIÇÃO DA CLASSIFICAÇÃO DE ACORDO COM O VALOR DO IMC
			if (imc < 20) {
				txtResultado.text = "Resultado: Magro"
				imgClassificacao.setImageResource(R.drawable.magro)
			} else if (imc <= 25) {
				txtResultado.text = "Resultado: Normal"
				imgClassificacao.setImageResource(R.drawable.normal)
			} else if (imc <= 30) {
				txtResultado.text = "Resultado: Sobrepeso"
				imgClassificacao.setImageResource(R.drawable.sobrepeso)
			} else {
				txtResultado.text = "Resultado: Obeso"
				imgClassificacao.setImageResource(R.drawable.obeso)
			}
		}
	}
}