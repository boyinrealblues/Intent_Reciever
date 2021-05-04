package com.example.intent_reciever

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent=getIntent()
        val uri=intent.data
        val text=findViewById<TextView>(R.id.reciever)
        if(uri!=null){
            var word="URI:"+uri.toString()
            text.text=word
        }
    }
}