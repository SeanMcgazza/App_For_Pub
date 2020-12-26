package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val person_nam= arrayOf("Table 1", "Table 2" , "Table 3", "Table 4")
//        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,person_nam)
//        val spinner = this.findViewById<Spinner>(R.id.spinner_Table)
//
//        spinner.adapter = arrayAdapter

        var button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        var button1 = findViewById<Button>(R.id.btn3)
        button1.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        var button2 = findViewById<Button>(R.id.scroll_btn)
        button2.setOnClickListener {

            val intent = Intent(this, Nested_scroll::class.java)
            startActivity(intent)
        }

    }

//    fun openInventory(view: View) {
////        view.setEnabled(false)
//    }
}