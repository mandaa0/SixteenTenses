package com.example.sixteentenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimple.setOnClickListener { tampilSimple() }

        btnPresent.setOnClickListener { tampilPresent() }

        btnPast.setOnClickListener { tampilPast() }

        btnFuture.setOnClickListener { tampilFuture() }

        btnAbout.setOnClickListener { tampilAbout () }
    }

    private fun tampilAbout() {
        val intent = Intent(this, AboutActivity::class.java)

        startActivity(intent)
    }

    private fun tampilFuture() {
        val intent = Intent(this, FutureActivity::class.java)

        startActivity(intent)
    }

    private fun tampilPast() {
        val intent = Intent(this, PastActivity::class.java)

        startActivity(intent)
    }

    private fun tampilPresent() {
        val intent = Intent(this, PresentActivity::class.java)

        startActivity(intent)
    }

    private fun tampilSimple() {
        val intent = Intent(this, SimpleActivity::class.java)

        startActivity(intent)
    }
}
