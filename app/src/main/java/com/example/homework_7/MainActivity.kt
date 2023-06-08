package com.example.homework_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnDivide.setOnClickListener {
                resultTv.text = Math().divide(firstNumber.text.toString(),secondNumber.text.toString())
            }
            btnCalculate.setOnClickListener {
                resultTv.text = Math().add(firstNumber.text.toString(),secondNumber.text.toString())
            }
        }
    }
}