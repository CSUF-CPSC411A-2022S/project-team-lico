package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var clearButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)

        val loginButton: Button = findViewById(R.id.login)
        clearButton = findViewById(R.id.clear)
        loginButton.setOnClickListener {
            val toast = Toast.makeText(this, "Adding ${username.text} @ ${password.text}.", Toast.LENGTH_SHORT)
            toast.show()
        }
        // clear username and password when clear button pressed
        clearButton.setOnClickListener {
            username.setText("")
            password.setText("")
        }
    }
}