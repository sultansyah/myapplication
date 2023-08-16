package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTahun = findViewById<EditText>(R.id.edtTahun)
        val btnClick = findViewById<Button>(R.id.btnClick)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)
        val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);


        btnClick.setOnClickListener {
            val umurmu = tahunSekarang - edtTahun.text.toString().toInt()
            tvHasil.text = "Umur kamu $umurmu Tahun"
        }
    }
}