package com.example.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    var hairetu = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var hairetu2: IntArray= IntArray(4)
    var mondai: String = ""
        set(value){
            textView.text =value
            field = value
        }
    private var seikai: Int = 0
    private var difficult: Int = 0
//    val r = Random()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start()

        one.setOnClickListener {
            if (hairetu2[seikai] != 1) return@setOnClickListener
            collect()
        }
        two.setOnClickListener {
            if (hairetu2[seikai] != 2) return@setOnClickListener
            collect()
        }
        three.setOnClickListener {
            if (hairetu2[seikai] != 3) return@setOnClickListener
            collect()
        }
        four.setOnClickListener {
            if (hairetu2[seikai] != 4) return@setOnClickListener
            collect()
        }

    }

    fun start() {
        hairetu2 = hairetu2.map { Random.nextInt(4) + 1 }.toIntArray()
        mondai = hairetu2.map { it?.toString() }.joinToString("")
        seikai = 0

//        hairetu[4] = r.nextInt(4) + 1
//        hairetu[5] = r.nextInt(4) + 1
//        hairetu[6] = r.nextInt(4) + 1

//        if (difficult <= 10) {
//        mondai =
//            hairetu2[0].toString() +
//                    hairetu2[1].toString() +
//                    hairetu2[2].toString() +
//                    hairetu2[3].toString()
//        } else if (difficult <= 20) {
//            mondai =
//                Integer.toString(hairetu[0]) +
//                        Integer.toString(hairetu[1]) +
//                        Integer.toString(hairetu[2]) +
//                        Integer.toString(hairetu[3]) +
//                        Integer.toString(hairetu[4])
//        } else {
//            mondai =
//                Integer.toString(hairetu[0]) +
//                        Integer.toString(hairetu[1]) +
//                        Integer.toString(hairetu[2]) +
//                        Integer.toString(hairetu[3]) +
//                        Integer.toString(hairetu[4]) +
//                        Integer.toString(hairetu[5])
//        }

    }

    fun collect() {
        mondai = mondai.substring(1)
        textView.text = this.mondai
        seikai += 1
        if (seikai == 4) {
            start()

//            if (difficult < 10) {
//                difficult = difficult + 1
//            } else if (seikai == 5) {
//                if (difficult < 20) {
//                    difficult = difficult + 1
//                }
//            }
        }
    }
}


