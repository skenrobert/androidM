package com.curso.androidm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.curso.androidm.calculetorimc.ImcActivity
import com.curso.androidm.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaluteApp = findViewById<Button>(R.id.btnSaludar)
        btnSaluteApp.setOnClickListener { navigateToSaluteApp() }

        val btnImcApp = findViewById<Button>(R.id.btnIMC)
        btnImcApp.setOnClickListener { navigateToImcApp() }


    }



    private fun navigateToSaluteApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcActivity::class.java)
        startActivity(intent)
    }
}