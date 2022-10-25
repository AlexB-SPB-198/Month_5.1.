package com.example.month_51.presenter

import android.graphics.Color
import com.example.month_51.helper.Injector
import com.example.month_51.model.CounterModel
import com.example.month_51.view.CounterView

class Presenter {
     val number:String? = null
    private val model = Injector.getModel()
    lateinit var view: CounterView
    fun increment() {
        model.increment()
        view.showNewCount(model.count)
        if(model.count==10){
          view.showToast()
        }
        if(model.count==15){
            view.getColor()
        }
    }
    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
    }

    fun attachView(view:CounterView){
        this.view = view
    }
}