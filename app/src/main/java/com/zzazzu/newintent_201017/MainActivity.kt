package com.zzazzu.newintent_201017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherActivityBtn.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        sendMessageBtn.setOnClickListener {

            val inputMessage = messageEdt.text.toString()

            val myIntent = Intent(this, MessageActivity::class.java)

            myIntent.putExtra("message", inputMessage)

            startActivity(myIntent)

        }

        changeNickNameBtn.setOnClickListener {

            val myIntent=Intent(this,EditNickNameActivity::class.java)

            startActivityforResult(myIntent, REQUEST_FOR_NICKNAME)

        }



    }
}