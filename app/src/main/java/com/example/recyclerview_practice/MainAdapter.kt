package com.example.recyclerview_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val context: Context, val nameList: ArrayList<Name>) :
    RecyclerView.Adapter<MainAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_cardview, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(nameList[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val username = itemView?.findViewById<TextView>(R.id.card_item_username)
        val userphote = itemView?.findViewById<ImageView>(R.id.imageView)

        fun bind(name: Name, context: Context) {
            if (name.photo != "") {
                val resourceId =
                    context.resources.getIdentifier(name.photo, "drawable", context.packageName)
                userphote?.setImageResource(resourceId)
            } else {
                userphote?.setImageResource(R.mipmap.ic_launcher)
            }
            username?.text = name.name
        }


    }
}