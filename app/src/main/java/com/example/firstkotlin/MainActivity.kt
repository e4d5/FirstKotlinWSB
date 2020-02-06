package com.example.firstkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LK_button.setOnClickListener {
            var message = Toast.makeText(applicationContext,"PRZECHODZE DO REJESTRACJI",Toast.LENGTH_LONG)
            message.show()

            //Tworzyy nowa aktywnosc ktora bedzie uruchamiac okno SecondActivity
            var gotoSecondActivity: Intent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(gotoSecondActivity)
            message.show()
        }
        SUB_button.setOnClickListener {
            var message = Toast.makeText(applicationContext,"Przechodze do GOOGLE.COM!",Toast.LENGTH_SHORT)
            message.show()
            var address = "https://google.com/"
            var channelGoogle = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(channelGoogle)
        }

    }

    override fun onResume() {
        super.onResume()
        if(intent.hasExtra("sex")) {
            sex_textView.setText(intent.getCharSequenceExtra("sex"))
        }
    }
}
