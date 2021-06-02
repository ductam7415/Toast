package com.example.toast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Chào mừng bạn đã trở lại", Toast.LENGTH_SHORT).show()
        fun viewNoteDetail() {
            val intent: Intent = Intent(this, SecondActivity::class.java)
        }
        val editText = findViewById<EditText>(R.id.ten)
        val button = findViewById<Button>(R.id.nextview)
        button.setOnClickListener(){
            val intent: Intent = Intent(this, SecondActivity::class.java)
            val name = editText.text.toString()
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
            intent.putExtra("tro lai", name)
            startActivity(intent)
        }
    }
}