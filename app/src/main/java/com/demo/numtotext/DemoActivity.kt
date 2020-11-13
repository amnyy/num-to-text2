package com.demo.numtotext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.nums.numtext.NumText

class DemoActivity : AppCompatActivity() {

    private val converter = NumText()
    private lateinit var editor: EditText
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        editor = findViewById(R.id.nEdit)
        tv = findViewById(R.id.nTv)
    }

    fun btnClick(v: View){
        tv.text = converter.getNumInText(editor.text.toString().toIntOrNull() ?: 0)
    }
}