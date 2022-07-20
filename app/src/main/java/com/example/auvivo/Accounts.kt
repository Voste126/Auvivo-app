package com.example.auvivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Accounts : AppCompatActivity() {
    lateinit var butadd: Button
    lateinit var butsub: Button
    lateinit var butmulti: Button
    lateinit var butdiv: Button
    lateinit var edt_Fnum: EditText
    lateinit var edt_Snum: EditText
    lateinit var txt_answer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accounts)
        butadd = findViewById(R.id.btn_sum)
        butdiv = findViewById(R.id.btn_div)
        butsub = findViewById(R.id.btn_sub)
        butmulti = findViewById(R.id.btn_multi)
        edt_Fnum = findViewById(R.id.edt_Fnum)
        edt_Snum = findViewById(R.id.edt_Snum)
        txt_answer = findViewById(R.id.txt_answer)

        butadd.setOnClickListener {
            var firstnum = edt_Fnum.text.toString()
            var secondnum = edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()) {
                txt_answer.text = "please fill both values"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        butdiv.setOnClickListener {
            var firstnum = edt_Fnum.text.toString()
            var secondnum = edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                txt_answer.text="please fill both values"
            }else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                txt_answer.text=answer.toString()
            }


        }
        butsub.setOnClickListener {
            var firstnum=edt_Fnum.text.toString()
            var secondnum=edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                txt_answer.text="please fill both values"

            }else{
                var answer=firstnum.toDouble()- secondnum.toDouble()
                txt_answer.text=answer.toString()
            }
        }
        butmulti.setOnClickListener {
            var firstnum=edt_Fnum.text.toString()
            var secondnum=edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                txt_answer.text="please fill both values"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                txt_answer.text=answer.toString()
                }
            }
        }
    }
