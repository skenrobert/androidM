package com.curso.androidm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.curso.androidm.calculetorimc.ImcActivity
import com.curso.androidm.firstapp.FirstAppActivity
import com.curso.androidm.galleryapp.SuperHeroListActivity
import com.curso.androidm.layoutdesign.ConstraintLayoutActivity
import com.curso.androidm.layoutdesign.FrameLayoutActivity
import com.curso.androidm.layoutdesign.LinerLayoutActivity
import com.curso.androidm.settings.SettingsActivity
import com.curso.androidm.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // recommend used view bind here
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaluteApp = findViewById<Button>(R.id.btnSaludar)
        btnSaluteApp.setOnClickListener { navigateToSaluteApp() }

        val btnImcApp = findViewById<Button>(R.id.btnIMC)
        btnImcApp.setOnClickListener { navigateToImcApp() }

        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnTODO.setOnClickListener { navigateToTodoApp() }

        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener { navigateToSettings() }

        val btnFrameLayout = findViewById<Button>(R.id.btnFrameLayout)
        btnFrameLayout.setOnClickListener { navigateToFrameLayout() }

        val btnLinerLayout = findViewById<Button>(R.id.btnLinerLayout)
        btnLinerLayout.setOnClickListener { navigateToLinerLayout() }

        val btnConstraintLayout = findViewById<Button>(R.id.btnConstraintLayout)
        btnConstraintLayout.setOnClickListener { navigateToConstraintLayout() }

    }


    private fun navigateToSaluteApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToFrameLayout() {
        val intent = Intent(this, FrameLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLinerLayout() {
        val intent = Intent(this, LinerLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToConstraintLayout() {
        val intent = Intent(this, ConstraintLayoutActivity::class.java)
        startActivity(intent)
    }
}