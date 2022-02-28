package com.example.androidlesson2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent?.getStringExtra(First_Activity.KEY_FIRST_ACTIVITY)
        val textView = findViewById<TextView>(R.id.secondActivityTextViewForFirstActivityData)
        textView.text = data ?: "Hello?"

        val buttonSec = findViewById<Button>(R.id.buttonSec)
        val someText = "hui"
        buttonSec.setOnClickListener{
            val dataIntent = Intent(this, First_Activity::class.java).apply{
                putExtra(KEY_SECOND_ACTIVITY, someText)
            }
            startActivity(dataIntent)
        }

    }
    companion object{
        const val KEY_SECOND_ACTIVITY = "KeySA"
    }
}