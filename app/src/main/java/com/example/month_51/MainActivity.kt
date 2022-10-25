package com.example.month_51

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.month_51.databinding.ActivityMainBinding
import com.example.month_51.helper.Injector

import com.example.month_51.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding

    /* var counter = 0*/
    private val presenter = Injector.getPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClick()
    }

    private fun initClick() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }
    }
    override fun showToast() {
        Toast.makeText(this,"Поздравляем",Toast.LENGTH_SHORT).show()
    }

    override fun getColor() {
        binding.tvResult.setTextColor(Color.GREEN)

    }
    override fun showNewCount(count: Int) {
        binding.tvResult.text = count.toString()
    }






}