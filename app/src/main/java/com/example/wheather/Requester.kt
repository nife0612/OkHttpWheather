package com.example.wheather

import okhttp3.*
import java.io.IOException

class Requester() {

    private val client = OkHttpClient()
    private var url = "https://api.openweathermap.org/data/2.5/weather?q=London&appid=1dccebe5d8cf123057347590b7e1e1c6"
    private var data = ""

    private fun response(url: String = this.url){

        val request = Request.Builder()
            .url(url = url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                response.use {
                    if (!response.isSuccessful) throw IOException("Unexpected code $response")

                    setData(response.body!!.string())

                }
            }
        })

    }

    private fun setData(update: String){
        data = update
    }

    fun getData(): String{
        response()
        return data
    }

}