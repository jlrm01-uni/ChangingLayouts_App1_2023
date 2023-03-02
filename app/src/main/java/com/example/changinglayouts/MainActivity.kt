package com.example.changinglayouts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showMainScreen()


    }

    fun showMainScreen() {
        setContentView(R.layout.activity_main)

        val firstLayoutButton = findViewById<Button>(R.id.firstLayoutButton)

        firstLayoutButton.setOnClickListener {
            showLayout1()
        }

    }

    fun showLayout1() {
        setContentView(R.layout.layout1)

        val backToMainMenuButton = findViewById<Button>(R.id.backToMainMenuButton)
        val changeColor = findViewById<Button>(R.id.changeColorButton)
        val layout1 = findViewById<ConstraintLayout>(R.id.layout1)

        backToMainMenuButton.setOnClickListener {
            showMainScreen()
        }

        changeColor.setOnClickListener {
            layout1.setBackgroundColor(Color.rgb(255, 0, 0))
        }
    }
}