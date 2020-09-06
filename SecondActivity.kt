package com.myweb.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    var data = intent.extras
    var newStudent = data?.getParcelable<Student>("stdData")
    idText.text = "Name: ${newStudent?.id}"
        GText.text = "G: ${newStudent?.G}"
    nameText.text = "Email: ${newStudent?.name}"
    ageText.text = "Salary: ${newStudent?.age}"

    }
    fun onClickClose(view: View){
        finish()
    }
}