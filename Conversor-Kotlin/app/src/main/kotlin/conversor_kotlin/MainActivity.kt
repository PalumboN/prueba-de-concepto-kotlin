package com.utn.proyecto.conversor_kotlin

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View as View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import conversor_kotlin.MiToKmConverter
import java.lang.Double


public class MainActivity : ActionBarActivity() {

    var valueEdit: EditText? = null
    var convertButton: Button? = null
    var resultText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.bindView()
    }

    private fun bindView() {
        valueEdit = findViewById(R.id.value) as EditText
        resultText = findViewById(R.id.result) as TextView
        convertButton = findViewById(R.id.convert) as Button
    }

    public fun onConverterBtnClick(v : View){
        val value = Double.parseDouble(this.valueEdit!!.getText().toString())
        val converter = MiToKmConverter(value)
        converter.convert()
        this.resultText!!.setText(converter.result.toString())
    }

}