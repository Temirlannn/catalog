package com.itacademy.homework.adapters

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.itacademy.homework.R
import com.itacademy.homework.data.Models
import com.itacademy.homework.fragments.FragmentDetali

class LinearAdapter (private val array: ArrayList<Models>,
                     private val context: FragmentActivity
                     ):RecyclerView.Adapter<LinearAdapter.ViewHolder>() {
                         class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
                             val image: ImageView
                             val name: TextView
                             val description: TextView

                             init {
                                 image = itemView.findViewById(R.id.imageView)
                                 name = itemView.findViewById(R.id.linearName)
                                 description = itemView.findViewById(R.id.description)
                             }

                         }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.linear_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = array[position]
        Glide.with(holder.itemView).load(item.image).into(holder.image)
        holder.name.text = item.name
        holder.description.text = item.description

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("MAMA", item)

            context.supportFragmentManager.beginTransaction().replace(R.id.container, FragmentDetali::class.java, bundle)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }


}