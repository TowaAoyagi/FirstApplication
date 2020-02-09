package com.example.janken

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import java.util.Random

class MainActivity : AppCompatActivity() {

    internal lateinit var cpu: ImageView
    internal lateinit var player: ImageView
    internal lateinit var result: TextView
    internal var r = Random()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cpu = findViewById(R.id.cpu)
        player = findViewById(R.id.player)
        result = findViewById(R.id.result)
    }

    fun goo(v: View) {
        player.setImageResource(R.drawable.goo)
        val random = r.nextInt(3)

        if (random == 0) {
            cpu.setImageResource(R.drawable.goo)
            result.text = "引き分け"
        } else if (random == 1) {
            cpu.setImageResource(R.drawable.choki)
            result.text = "勝ち"
        } else if (random == 2) {
            cpu.setImageResource(R.drawable.paa)
            result.text = "負け"
        }
    }

    fun choki(v: View) {
        player.setImageResource(R.drawable.choki)
        val random = r.nextInt(3)

        if (random == 0) {
            cpu.setImageResource(R.drawable.choki)
            result.text = "引き分け"
        } else if (random == 1) {
            cpu.setImageResource(R.drawable.paa)
            result.text = "勝ち"
        } else if (random == 2) {
            cpu.setImageResource(R.drawable.goo)
            result.text = "負け"
        }
    }

    fun paa(v: View) {
        player.setImageResource(R.drawable.paa)
        val random = r.nextInt(3)

        if (random == 0) {
            cpu.setImageResource(R.drawable.paa)
            result.text = "引き分け"
        } else if (random == 1) {
            cpu.setImageResource(R.drawable.goo)
            result.text = "勝ち"
        } else if (random == 2) {
            cpu.setImageResource(R.drawable.choki)
            result.text = "負け"
        }
    }
}
