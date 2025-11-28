package com.dani.imcapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
	
	private lateinit var btnCalcular: Button
	private lateinit var txtNome: EditText
	private lateinit var txtPeso: EditText
	private lateinit var txtAltura: EditText
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		
		// INICIALIZAÇÃO DAS VARIÁVEIS
		txtNome = findViewById(R.id.hint_nome)
		txtPeso = findViewById(R.id.hint_peso)
		txtAltura = findViewById(R.id.hint_altura)
		btnCalcular = findViewById(R.id.calculo_btn)
		
		// EVENTO DE CLICK DO BOTÃO
		btnCalcular.setOnClickListener {
			val intent = Intent(this, IMCActivity::class.java)
			val nome = txtNome.text.toString()
			val peso = txtPeso.text.toString()
			val altura = txtAltura.text.toString()
			
			if (nome.isNotEmpty() && peso.isNotEmpty() && altura.isNotEmpty()) {
				intent.putExtra("nome", nome)
				intent.putExtra("peso", peso.toDoubleOrNull())
				intent.putExtra("altura", altura.toDoubleOrNull())
			}
			startActivity(intent)
		}
	}
	
	override fun onResume() {
		super.onResume()
		try {
			com.mobile.mobiledu.DUSettingsApplier.applyToActivity(this)
			com.mobile.mobiledu.EnvironmentApplier.applyToActivity(this)
			com.mobile.mobiledu.SoundApplier.applyToActivity(this)
		} catch (e: Exception) {
			e.printStackTrace()
		}
		if (::txtNome.isInitialized) txtNome.text.clear()
		if (::txtPeso.isInitialized) txtPeso.text.clear()
		if (::txtAltura.isInitialized) txtAltura.text.clear()
		txtNome.requestFocus()
	}
}