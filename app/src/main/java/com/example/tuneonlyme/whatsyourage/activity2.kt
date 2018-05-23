package com.example.tuneonlyme.whatsyourage

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.DatePicker
import com.example.tuneonlyme.whattowatch.R
import kotlinx.android.synthetic.main.activity_activity2.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

class activity2 : AppCompatActivity() {

    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    val month = c.get(Calendar.MONTH)
    val day = c.get(Calendar.DAY_OF_MONTH)
    val birth = Calendar.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)
    }


     // I don't know why but I can't name the function longer than one letter


    fun p(view: View) {
        val pickD = DatePickerDialog(this, android.R.style.Theme_Holo_Dialog, DatePickerDialog.OnDateSetListener { datePicker, mYear, mMonth, mDay ->
            birth.set(mYear,mMonth,mDay); selectedDatetxt.setText("DOB: "+mYear+"/"+mMonth+"/"+mDay) }, year, month, day)
        pickD.show()
    }
    fun s(view: View) {
        val today = Calendar.getInstance()
        var age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR))
            age--
        yourAgeTxt.setText("$age")
        descriptionTxt.setText("year(s) old")
    }


}
