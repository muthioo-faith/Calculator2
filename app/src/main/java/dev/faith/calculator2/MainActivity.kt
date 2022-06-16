package dev.faith.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber1: TextInputLayout
    lateinit var etNumber1: TextInputEditText
    lateinit var tilNumber2: TextInputLayout
    lateinit var etNumber2: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnsubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var btnResults: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumber1=findViewById(R.id.tilNumber1)
        tilNumber2=findViewById(R.id.tilNumber2)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2= findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnsubtract= findViewById(R.id.btnSubtract)
        btnModulus= findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        btnResults=findViewById(R.id.btnResults)

        btnAdd.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            Add(Number1,Number2)
        }
        btnsubtract.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            subtraction(Number1,Number2)
        }
        btnModulus.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            Modulus(Number1, Number2)
        }
        btnDivision.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            Modulus(Number1,Number2)
        }
    }

    fun Add(Number1: Int, Number2: Int) {
        var plus= Number1+Number2
        btnResults.text =plus.toString()

    }

    fun subtraction(Number1: Int,Number2: Int) {
        var minus = Number1 - Number2
        btnResults.text =minus.toString()
    }
    fun Divide(Number1: Int,Number2: Int){
        var Divide=Number1/Number2
        btnResults.text=Divide.toString()
    }
    fun Modulus(Number1: Int,Number2: Int){
        var modulus=Number1%Number2
        btnResults.text= modulus.toString()
    }

}

