package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusbutton.setOnClickListener {
            num = num + 1
            numtext.setText(num.toString())


            val color = if (num % 3 == 0) Color.RED else Color.BLACK

            numtext.setTextColor(color)
        }

        minusbutton.setOnClickListener{
            num = num - 1
            numtext.setText(num.toString())

            val color = if (num % 3 == 0) Color.RED else Color.BLACK

            numtext.setTextColor(color)
        }

    }

}
