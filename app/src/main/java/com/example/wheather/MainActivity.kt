package com.example.wheather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.clickingBt)

        val requester = Requester()

        button.setOnClickListener {
            textView.text = requester.getData()
        }


    }

}




    //"https://api.openweathermap.org/data/2.5/weather?q=London&appid=1dccebe5d8cf123057347590b7e1e1c6")
//    fun run() {
//        val request = Request.Builder()
//            .url("http://publicobject.com/helloworld.txt")
//            .build()
//
//        client.newCall(request).enqueue(object : Callback {
//            override fun onFailure(call: Call, e: IOException) {
//                e.printStackTrace()
//            }
//
//            override fun onResponse(call: Call, response: Response) {
//                response.use {
//                    if (!response.isSuccessful) throw IOException("Unexpected code $response")
//
//                    for ((name, value) in response.headers) {
//                        println("$name: $value")
//                    }
//
//                    println(response.body!!.string())
//                }
//            }
//        })

