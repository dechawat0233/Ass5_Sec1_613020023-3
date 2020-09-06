package com.myweb.lab5intent

import android.os.Parcelable
import android.widget.RadioButton
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student (val id:String,val G:String, val name : String, val age: Int):Parcelable{

}