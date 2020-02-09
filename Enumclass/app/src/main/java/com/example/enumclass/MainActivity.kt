package com.example.enumclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hoge(statusCode: StatusCode){
        System.out.print(statusCode.codeNumber)
    }

     enum class Direction{
            NORTH,
            SOUTH,
            EAST,
            WEST

    }

    enum class StatusCode(val codeNumber: Int){
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403),
        NOT_FOUND(404),
        CREATED(201),
        NOT_IMPLEMENTED(501),
        I_AM_A_TEAPOT(418)
    }


}
