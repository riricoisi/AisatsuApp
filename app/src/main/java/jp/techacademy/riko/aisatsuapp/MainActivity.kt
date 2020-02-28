package jp.techacademy.riko.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI-PARTS", "$hour:$minute")
            },
            2, 0, true
        )

        for (i in 2 until 10) {
            textView.text = "おはよう"
        }
        for (i in 10 until 18) {
            textView.text = "こんにちは"
        }
        for (i in 18 until 2) {
            textView.text = "こんばんは"
        }
        timePickerDialog.show()
    }
}