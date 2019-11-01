package com.example.persistancesapp

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user__info2.*
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File


class User_Info : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var spEditor: SharedPreferences.Editor
    var  key_for_key = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user__info2)
       var key_for_key = 0
        val key_array = arrayOf("user_data_3000","user_data_3001", "user_data_3002","user_data_3003","user_data_3004","user_data_3005","user_data_3006",
            "user_data_3007","user_data_3008","user_data_3009")


       val index = File("thekeyfile.txt").bufferedReader().readLine()
        key_for_key = index.toInt()

        sharedPreferences = this.getSharedPreferences("saved_Users", 0)
        spEditor = sharedPreferences.edit()




        key_id.setOnClickListener{

            key_for_key += 2

            if (key_for_key >= 10 ){ key_for_key = 0}

            saved_txt.text = key_for_key.toString()


            File("thekeyfile.txt").bufferedWriter().use{
                out ->
                out.write(key_for_key)
            }


        }



            val userMade: User = intent?.getParcelableExtra("name_key") as User

            userMade.let { user ->
                val string = "${user.name}  ${user.phone}   "
                infotxt.text = string


                spEditor.putString(key_array[key_for_key], user.name)
                spEditor.putString(key_array[key_for_key + 1], user.phone)
                spEditor.commit()




        }

        val value  = sharedPreferences.getString("user_data_3000", "")
        val value1 = sharedPreferences.getString("user_data_3001", "")
        val value2 = sharedPreferences.getString("user_data_3002", "")
        val value3 = sharedPreferences.getString("user_data_3003", "")
        val value4 = sharedPreferences.getString("user_data_3004", "")
        val value5 = sharedPreferences.getString("user_data_3005", "")
        val value6 = sharedPreferences.getString("user_data_3006", "")
        val value7 = sharedPreferences.getString("user_data_3007", "")
        val value8 = sharedPreferences.getString("user_data_3008", "")
        val value9 = sharedPreferences.getString("user_data_3009", "")



            saved_txt.text = value + " " + value1 + " "+ value2 + " " + value3 + " " + value4 + " " +value5 + " " +value6 + " " +value7 + " " +value8 + " " +value9






    }



}