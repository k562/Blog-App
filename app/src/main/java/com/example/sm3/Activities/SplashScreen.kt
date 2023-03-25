package com.example.sm3.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import com.airbnb.lottie.LottieAnimationView
import com.example.sm3.R

class SplashScreen : AppCompatActivity() {

    lateinit var lottieAnimationView : LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)


        lottieAnimationView = findViewById(R.id.animationView)



        Handler(Looper.getMainLooper()).postDelayed ({

         val intent = Intent(this@SplashScreen , MainActivity :: class.java)
         startActivity(intent)
            finish()
        },2000)

        lottieAnimationView.visibility = View.VISIBLE
        lottieAnimationView.playAnimation()
    }
}