package com.ivandriancode.aikterjun.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.model.Waterfall

class CardViewAdapter(val waterfalls: ArrayList<Waterfall>) : RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLoc: TextView = itemView.findViewById(R.id.tv_item_loc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, index: Int) {
        val waterfall = waterfalls[index]
        Glide.with(holder.itemView.context)
            .load(waterfall.foto)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = waterfall.nama
        holder.tvLoc.text = waterfall.lokasi
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(waterfall) }
    }

    override fun getItemCount(): Int {
        return waterfalls.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Waterfall)
    }
}