package com.example.passwordstorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.TypedArrayUtils.getText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




}

    fun buttonOnClick(view: View) {
         val password:TextView=findViewById(R.id.textPassword)
        if (password.length()<=6){

            val eror:TextView=findViewById(R.id.texterror)
            eror.setText("Пароль короткий ")
        }

    }
}