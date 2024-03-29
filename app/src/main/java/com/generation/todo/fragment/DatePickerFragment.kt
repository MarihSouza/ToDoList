package com.generation.todo.fragment

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DatePickerFragment (
    private val timePickerListener: timePickerListener) : DialogFragment(),DatePickerDialog.OnDateSetListener{
    val calendar = Calendar.getInstance()
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        return DatePickerDialog(requireContext(), this, year, month, day)
    }


    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        calendar.set(Calendar.YEAR,p1)
        calendar.set(Calendar.MONTH,p2)
        calendar.set(Calendar.DAY_OF_MONTH,p3)
        timePickerListener.onTimeSelected(calendar.time.toInstant().atZone(
            ZoneId.systemDefault()).toLocalDate())



    }

}

interface  timePickerListener{

 fun onTimeSelected(date: LocalDate)

}