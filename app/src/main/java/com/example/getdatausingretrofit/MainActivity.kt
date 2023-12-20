package com.example.getdatausingretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val QuotesApi = RetrofitBuilder.getInstance().create(myInterface::class.java)

        GlobalScope.launch {
            val result = QuotesApi.getQuotes()
            if(result!=null)
            {
                Log.d("Result",result.body().toString())
            }
        }
    }
}