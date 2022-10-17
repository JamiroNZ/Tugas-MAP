package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnMad: ImageButton
    lateinit var etName: EditText
    lateinit var btnHappy: ImageButton
    lateinit var btnSad: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMad = findViewById(R.id.btn_mad)
        etName = findViewById(R.id.et_name)
        btnHappy = findViewById(R.id.btn_happy)
        btnSad = findViewById(R.id.btn_sad)


        btnMad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "isi nama dulu oi",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                Toast.makeText(
                    applicationContext,
                    "hallo " + etName.text + " you are mad today",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnHappy.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "isi nama dulu oi",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                Toast.makeText(
                    applicationContext,
                    "hallo " + etName.text + " you are happy today",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnSad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "isi nama dulu oi",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                Toast.makeText(
                    applicationContext,
                    "hallo " + etName.text + " you are sad today",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}