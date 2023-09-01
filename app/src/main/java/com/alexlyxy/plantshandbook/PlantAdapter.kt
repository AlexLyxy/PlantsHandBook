package com.alexlyxy.plantshandbook

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexlyxy.plantshandbook.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

    class PlantHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = PlantItemBinding.bind(item)
        fun  bind(plant :Plant) = with(binding){
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent :ViewGroup,viewType :Int) :PlantHolder {

    }

    override fun getItemCount() :Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder :PlantHolder,position :Int) {
        TODO("Not yet implemented")
    }
}