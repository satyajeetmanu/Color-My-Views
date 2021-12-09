package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setClickListeners()
    }
    private fun setClickListeners(){
        val clickableViews : List<View> = listOf(binding.boxOneText,binding.boxTwoText,binding.boxThreeText
            ,binding.boxFourText,binding.boxFiveText,binding.parent,binding.buttonRed,binding.buttonYellow,binding.buttonGreen)

        for(item in clickableViews){
            item.setOnClickListener{
                buttonClicked(it)
            }
        }
    }


    private fun buttonClicked(view: View){
        when(view.id){
            R.id.box_one_text -> binding.boxOneText.setBackgroundColor(Color.BLACK)
            R.id.box_two_text -> binding.boxTwoText.setBackgroundColor(Color.BLUE)
            R.id.box_three_text -> binding.boxThreeText.setBackgroundColor(resources.getColor(android.R.color.holo_orange_light))
            R.id.box_four_text -> binding.boxFourText.setBackgroundColor(resources.getColor(android.R.color.holo_orange_light))
            R.id.box_five_text -> binding.boxFiveText.setBackgroundColor(resources.getColor(android.R.color.holo_orange_light))
            R.id.button_red -> binding.boxThreeText.setBackgroundColor(resources.getColor(R.color.my_red))
            R.id.button_yellow -> binding.boxFourText.setBackgroundColor(resources.getColor(R.color.my_yellow))
            R.id.button_green -> binding.boxFiveText.setBackgroundColor(resources.getColor(R.color.my_green))
            R.id.parent -> binding.parent.setBackgroundColor(Color.GRAY)

        }
    }
}
