package com.example.firstkotlin

import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

fun EditPasswordHandling(password: EditText, warn_password: TextView){
    password.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            if(password.length() == 0 ){
                warn_password.visibility = TextView.INVISIBLE
            }
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if(password.length() <= 7){
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
    })
}

fun EditEmailHandling (email: EditText, warn_email: TextView){
    email.addTextChangedListener(object : TextWatcher{
        override fun afterTextChanged(s: Editable?) {
            if(email.length() == 0) {
                warn_email.visibility = TextView.INVISIBLE
            }
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
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
    })
}