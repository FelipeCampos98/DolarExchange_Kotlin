package com.example.dolarexchange

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import com.example.dolarexchange.R

class MainActivity : AppCompatActivity() {
    var editTextRate: EditText? = null
    var editTextAmount: EditText? = null
    var textResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextRate = findViewById(R.id.editTextRate)
        editTextAmount = findViewById(R.id.editTextAmount)
        textResult = findViewById(R.id.textResult)
    }

    fun convert(view: View?) {
        val quantDolar = editTextAmount!!.text.toString().toDouble()
        val dolarValue = editTextRate!!.text.toString().toDouble()
        val valueconvert = dolarValue * quantDolar
        textResult!!.text = "R$$valueconvert"
    }
}