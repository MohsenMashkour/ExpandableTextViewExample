package com.mkrdeveloper.expandabletextviewexample

import android.os.Bundle
import android.view.animation.OvershootInterpolator
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import at.blogc.android.views.ExpandableTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init

        val expandableTextView = findViewById<ExpandableTextView>(R.id.expandableTextView)
        val txt_toggle = findViewById<TextView>(R.id.txt_toggle)


        // setting animation

        expandableTextView.setAnimationDuration(750L)

        // setting the interpolator

        expandableTextView.setInterpolator(OvershootInterpolator())

        // checking the status of the expandable txt and setting the new status
        // setting the text on the txt_toggle

        txt_toggle.setOnClickListener {
            if (expandableTextView.isExpanded){
                expandableTextView.collapse()
                txt_toggle.setText(R.string.see_more)
            }else{
                expandableTextView.expand()
                txt_toggle.setText(R.string.see_less)
            }
        }

    }
}