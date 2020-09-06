package com.myweb.lab5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        val intent = Intent ( this,SecondActivity::class.java)
        var selectedId : Int = radioB.checkedRadioButtonId;
        var radioButton : RadioButton = findViewById(selectedId);
        intent.putExtra("stdData",
            Student(IdEDT.text.toString(),radioButton.text.toString(),nameEDT.text.toString(),ageEDT.text.toString().toInt())
        )
        startActivity(intent)
    }
}