package com.dlamlt.b1rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.rxjava3.core.Observable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Observable.fromArray("Lam","Huy","Trung")
            .subscribe{onNext -> txtView.text}
        txtView.text="1223"
    }
}