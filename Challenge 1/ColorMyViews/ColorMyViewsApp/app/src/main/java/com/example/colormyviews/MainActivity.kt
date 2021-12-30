package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.box1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.box222)

            R.id.box_three_text -> view.setBackgroundResource(R.drawable.purple1)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.greyel)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.blue1)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.drawable.red1)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.drawable.yellow1)
            R.id.green_button -> box_five_text.setBackgroundResource(R.drawable.green1)


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}