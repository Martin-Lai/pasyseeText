package com.example.playseetest

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.playseetest.databinding.VideoItemBinding

class ListAdapter(private val data: List<P>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(private val itemBinding: VideoItemBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(itemData: P) {
            Log.d("TAG", "bind: ${(itemData.source[2]) as ArrayList<Any>}")
            Log.d("TAG", "bind: ${((itemData.source[2]) as ArrayList<Any>)[0]}")
            Glide.with(itemBinding.imageView).load("http://storage.googleapis.com/pst-framy/stk/${itemData.id}.jpg").into(itemBinding.imageView)
            Glide.with(itemBinding.imgUser).load("http://storage.googleapis.com/usr-framy/headshot/${((itemData.source[2]) as ArrayList<Any>)[0]}.jpg").into(itemBinding.imgUser)
//            itemBinding.tvName.text = ((itemData.source[2]) as ArrayList<Any>)[2] as String
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(VideoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false));
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}