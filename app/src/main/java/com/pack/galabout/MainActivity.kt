package com.pack.galabout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acommodations)

        val checkInButton = findViewById<TextView>(R.id.checkInButton)
        val checkOutButton = findViewById<TextView>(R.id.checkOutButton)

        checkInButton.setOnClickListener {
            showDatePickerDialog()
        }

        checkOutButton.setOnClickListener {
            showDatePickerDialog()
        }
    }

    private fun showDatePickerDialog() {
        val newFragment = DatePickerFragment()
        newFragment.show(supportFragmentManager, "datePicker")
    }
}
