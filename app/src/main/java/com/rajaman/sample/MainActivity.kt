package com.rajaman.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            if (editText.text.toString() != "") {
                var valueA = editText.text.toString().toInt()
                var valueB = editText2.text.toString().toInt()
                var sum = valueA + valueB
                textView.text = sum.toString()
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
            }

        }
        button2.setOnClickListener {
            if (editText.text.toString() != "") {
                var valueA = editText.text.toString().toInt()
                var valueB = editText2.text.toString().toInt()
                var sub = valueA - valueB
                textView.text = sub.toString()
                Toast.makeText(this, "Subtracted", Toast.LENGTH_LONG).show()
            }
        }
//        button3.setOnClickListener {
//            if (editText.text.toString() != "") {
//                var valueA = editText.text.toString().toInt()
//                var valueB = editText2.text.toString().toInt()
//                var div = valueA / valueB
//                textView.text = div.toString()
//            }
//        }

        button3.setOnClickListener {
            editText.text.clear()
            editText2.text.clear()
            textView.text = "0"
        }
    }

}
