package com.example.kotlinjanken

import java.lang.IllegalArgumentException

enum class Janken(val message: String) {
    WIN("勝ち"),
    LOSE("負け"),
    EVEN("引き分け");

    companion object {
        fun from(seed: Int) : Janken{
            val result = when(seed){
                0 -> WIN
                1 -> LOSE
                2 -> EVEN
                else -> throw IllegalArgumentException()
            }
            return result
        }
    }
}