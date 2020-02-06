package com.example.firstkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import java.time.format.TextStyle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        EditEmailHandling(email,warn_email) // funkcja, ktora sprawdza poprawnosc maila
        EditPasswordHandling(password,warn_password) // funkcja, ktora sprawdza poprawnosc hasla


        setSEX_RG.setOnCheckedChangeListener { group, checkedId ->
            run {
            val activatingIntention: Intent = Intent(applicationContext,MainActivity::class.java)
            var RB: RadioButton = findViewById(checkedId)
            activatingIntention.putExtra("sex", RB.text)
                startActivity(activatingIntention)
                }
        }
    }


    /*
    override fun onUserInteraction() {
        super.onUserInteraction()
        if(password.isFocused){
                if(password.length() < 6){
                    warn_password.setText("Password is too short")
                    warn_password.visibility = TextView.VISIBLE
                    warn_password.setTextColor(Color.RED)
                }
                else{
                    warn_password.setText("Password is secure")
                    warn_password.visibility = TextView.VISIBLE
                    warn_password.setTextColor(Color.GREEN)
                }

        }
        else{
            warn_password.visibility = TextView.INVISIBLE
        }

        if(email.isFocused){
            warn_email.setText("Email is incorrect")
            warn_email.setTextColor(Color.RED)
            for (i in email.text)
            {
                if(i == '@')
                {
                    warn_email.setText("Email is correct")
                    warn_email.setTextColor(Color.GREEN)
                    warn_email.visibility = TextView.VISIBLE
                }
                else
                {
                    warn_email.visibility = TextView.VISIBLE
                }
            }
        }
        else{
            warn_email.visibility = TextView.INVISIBLE
        }
    }

     */
}