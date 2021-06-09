package com.example.toast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.toast.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("tro lai")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        val ten = findViewById<TextView>(R.id.newview)
        val button = findViewById<Button>(R.id.back)

        ten.text = "hello " + msg
        button.setOnClickListener() {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}