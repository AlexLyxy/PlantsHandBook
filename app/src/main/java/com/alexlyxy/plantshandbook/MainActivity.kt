package com.alexlyxy.plantshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.alexlyxy.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var  binding: ActivityMainBinding
    private  val  adapter = PlantAdapter()
    private  val  imageIdList =  listOf(
        R.drawable.boy,
        R.drawable.abstpicture,
        R.drawable.candle,
        R.drawable.green,
        R.drawable.island,
        R.drawable.robot,
        R.drawable.salvador
    )
    private  var index  = 0

    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private  fun  init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                if(index > 6) index = 0
                val  plant = Plant(imageIdList[index], "Plant $index")
                adapter.addPlant(plant)
                index++
            }
        }
    }
}