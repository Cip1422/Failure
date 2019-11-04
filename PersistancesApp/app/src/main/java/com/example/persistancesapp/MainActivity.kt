package com.example.persistancesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger.global

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        reg_btn.setOnClickListener { it: View? ->
            val name = name_text.text.toString()
            val phone = phone_text.text.toString()

            val user = User(name, phone)

            val userIntent = Intent(this, User_Info::class.java)
            userIntent.putExtra("name_key", user)
            startActivity(userIntent)

        }


    }
}
