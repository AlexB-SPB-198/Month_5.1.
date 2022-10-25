package com.example.month_51.helper

import android.view.View
import com.example.month_51.model.CounterModel
import com.example.month_51.presenter.Presenter

class Injector {
    companion object {
        fun getModel(): CounterModel {
            return CounterModel()
        }

        fun getPresenter(): Presenter {
            return Presenter()
        }

    }
}