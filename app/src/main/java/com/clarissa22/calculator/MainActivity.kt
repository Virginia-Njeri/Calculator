package com.clarissa22.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout
    lateinit var etNum1:TextInputEditText
    lateinit var etNum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnProduct:Button
    lateinit var btnMod:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        allFindViews()
        validateButtons()
    }
    fun allFindViews(){
        tilNum1=findViewById(R.id.tilNum1)
        tilNum2=findViewById(R.id.tilNum2)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSub=findViewById(R.id.btnSub)
        btnProduct=findViewById(R.id.btnProduct)
        btnMod=findViewById(R.id.btnMod)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1=etNum1.text.toString().toDouble()
            var num2=etNum2.text.toString().toDouble()
            getSum(num1, num2)
        }

        btnSub.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            getSub(num1, num2)
        }
        btnProduct.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            getProduct(num1, num2)
        }

        btnMod.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            getMod(num1, num2)
        }



    }
    fun validateButtons(){
        var error=false
        etNum1.error=null
        etNum2.error=null
        var input1=etNum1.text.toString()
        if (input1.isBlank()){
            tilNum1.error="number required"
            error=true


        }
        var input2=etNum1.text.toString()
        if (input2.isBlank()){
            tilNum2.error="number required"
            error=true

        }
        if (!error){


        }

    }

    fun getSum(num1:Double,num2:Double){
      var sum=num1+num2
        tvResult.text=sum.toString()
    }
    fun getSub(num1:Int,num2:Int){
        var sub=num1-num2
        tvResult.text=sub.toString()
    }

    fun getProduct(num1:Int,num2:Int){
        var product=num1*num2
        tvResult.text=product.toString()
    }
    fun getMod(num1:Int,num2:Int){
        var mod=num1%num2
        tvResult.text=mod.toString()
    }





}