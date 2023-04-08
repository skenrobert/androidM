package com.curso.androidm.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.curso.androidm.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val editName = findViewById<AppCompatEditText>(R.id.editName)

        btnStart.setOnClickListener {
            val name = editName.text.toString()

            if (name.isNotEmpty()){
//                Log.i("btnapp", "Button Pulsado ${editName.text.toString()}")
                val intent  = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_Name", name)
                startActivity(intent)
            }
        }

    }
}