package com.example.challenge2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {

        when (view.id) {

            R.id.textView1 -> view.setBackgroundColor(Color.argb(255, Random.nextInt(256), Random.nextInt(256)
                ,Random.nextInt(256)))

            R.id.textView2 -> view.setBackgroundColor(Color.argb(255, Random.nextInt(256), Random.nextInt(256)
                ,Random.nextInt(256)))

            R.id.textView3 -> view.setBackgroundColor(Color.argb(255, Random.nextInt(256), Random.nextInt(256)
                ,Random.nextInt(256)))

        }
    }

    private fun setListeners() {

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)

        val rootConstraintLayout = findViewById<View>(R.id.textView1)

        val clickableViews: List<View> =
            listOf(
                textView1,textView2,textView3, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }




}