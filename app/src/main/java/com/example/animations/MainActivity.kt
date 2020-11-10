package com.example.animations

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ObjectAnimator.ofFloat(loading_text, View.ALPHA, 0f, 1f, 0f).apply {
            interpolator = AccelerateDecelerateInterpolator()
            repeatCount = Animation.INFINITE
            duration = 5000
            start()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {

        super.onRestoreInstanceState(savedInstanceState)
    }


}