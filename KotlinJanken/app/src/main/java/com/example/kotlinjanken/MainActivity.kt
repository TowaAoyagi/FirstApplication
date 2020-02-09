package com.example.kotlinjanken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var cpu: ImageView
    private lateinit var player: ImageView
    private lateinit var result: TextView
    var r = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cpu = findViewById(R.id.cpu)
        player = findViewById(R.id.player)
        result = findViewById(R.id.result)
        val goo: ImageView = findViewById(R.id.goo)
        val choki: ImageView = findViewById(R.id.choki)
        val paa: ImageView = findViewById(R.id.paa)

        goo.setOnClickListener {
            player.setImageResource(R.drawable.goo)
            val random = r.nextInt(3)
            val janken = Janken.from(random)
            result.text = janken.message

            val drawable = when (janken) {
                Janken.EVEN -> R.drawable.goo

                Janken.WIN -> R.drawable.choki

                Janken.LOSE -> R.drawable.paa
            }
            cpu.setImageResource(drawable)

//            if(random == 0){
//                cpu.setImageResource(R.drawable.goo)
//                result.text = "引き分け"
//            } else if (random == 1){
//                cpu.setImageResource(R.drawable.choki)
//                result.text = "勝ち"
//            } else if (random == 2){
//                cpu.setImageResource(R.drawable.paa)
//                result.text = "負け"
//            }
        }

        choki.setOnClickListener {
            player.setImageResource(R.drawable.choki)
            val random = r.nextInt(3)
            val janken = Janken.from(random)
            result.text = janken.message



            val drawable = when (janken) {
                Janken.EVEN -> R.drawable.choki

                Janken.WIN -> R.drawable.paa

                Janken.LOSE -> R.drawable.goo
            }
            cpu.setImageResource(drawable)
        }


//            if(random == 0){
//                cpu.setImageResource(R.drawable.choki)
//                result.text = "引き分け"
//            } else if (random == 1){
//                cpu.setImageResource(R.drawable.paa)
//                result.text = "勝ち"
//            } else if (random == 2){
//                cpu.setImageResource(R.drawable.goo)
//                result.text = "負け"
//            }


        paa.setOnClickListener {
            player.setImageResource(R.drawable.paa)
            val random = r.nextInt(3)
            val janken = Janken.from(random)
            result.text = janken.message

            val drawable = when (janken) {
                Janken.EVEN -> R.drawable.paa

                Janken.WIN -> R.drawable.goo

                Janken.LOSE -> R.drawable.choki
            }
            cpu.setImageResource(drawable)

        }

//            if(random == 0){
//                cpu.setImageResource(R.drawable.paa)
//                result.text = "引き分け"
//            } else if (random == 1){
//                cpu.setImageResource(R.drawable.goo)
//                result.text = "勝ち"
//            } else if (random == 2){
//                cpu.setImageResource(R.drawable.choki)
//                result.text = "負け"
//            }
    }
}





