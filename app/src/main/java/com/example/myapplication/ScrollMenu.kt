package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class ScrollMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_menu)

        val img1 = findViewById<ImageView>(R.id.Image1)
        val img2 = findViewById<ImageView>(R.id.Image2)
        val img3 = findViewById<ImageView>(R.id.Image3)

        val img4 = findViewById<ImageView>(R.id.imageButton6)
        val img5 = findViewById<ImageView>(R.id.imageButton7)
        val img6 = findViewById<ImageView>(R.id.imageButton8)
        val img7 = findViewById<ImageView>(R.id.imageButton9)


        val main_img = findViewById<ImageView>(R.id.imageView)
        img1.setOnClickListener {
            main_img.setImageResource(R.drawable.burger)
        }

        img2.setOnClickListener {
            main_img.setImageResource(R.drawable.chips)
        }

        img3.setOnClickListener {
            main_img.setImageResource(R.drawable.pizza)
        }

        img4.setOnClickListener {
            main_img.setImageResource(R.drawable.guni)
        }

        img5.setOnClickListener {
            main_img.setImageResource(R.drawable.heineken)
        }

        img6.setOnClickListener {
            main_img.setImageResource(R.drawable.carlsburg)
        }

        img7.setOnClickListener {
            main_img.setImageResource(R.drawable.rockshore)
        }




    }


}