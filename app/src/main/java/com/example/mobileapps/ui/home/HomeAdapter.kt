package com.example.mobileapps.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mobileapps.R
import com.example.mobileapps.data.remote.response.Data

class HomeAdapter(private val list: List<Data>): RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.title)
        val artist: TextView = view.findViewById(R.id.artist)
        val time: TextView = view.findViewById(R.id.time)
        val image: ImageView = view.findViewById(R.id.poster)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.artist.text = list[position].artist.name
        holder.time.text = list[position].duration
        Glide.with(holder.itemView.context)
            .load("https://api.deezer.com/album/487933275/image/${list[position].album.coverSmall}")
            .into(holder.image)
    }
}