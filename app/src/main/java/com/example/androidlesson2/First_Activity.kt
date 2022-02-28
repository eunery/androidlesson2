package com.example.androidlesson2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class First_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val value = "Some Text"
        val button = findViewById<Button>(R.id.button)
        val textFromEditText = findViewById<EditText>(R.id.EditText)
        button.setOnClickListener {
            val value = textFromEditText.text.toString()
            val dataIntent = Intent(this, Second_Activity::class.java).apply{
                putExtra(KEY_FIRST_ACTIVITY, value)
            }
            startActivity(dataIntent)
        }
    }
    companion object{
        const val KEY_FIRST_ACTIVITY = "keyFA"
    }
}