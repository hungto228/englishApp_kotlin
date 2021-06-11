package com.hungto.english_kotlin.IntroScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hungto.english_kotlin.R

class IntroScreenAdapter(private val screenItemModel: List<ScreenItemModel>) :
    RecyclerView.Adapter<IntroScreenAdapter.IntroScreenViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroScreenViewHolder {
        return IntroScreenViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_screen, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return screenItemModel.size
    }

    override fun onBindViewHolder(holder: IntroScreenViewHolder, position: Int) {
        holder.bind(screenItemModel[position])
    }

    inner class IntroScreenViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val mTile = view.findViewById<TextView>(R.id.tv_introTitle)
        private val mDesc = view.findViewById<TextView>(R.id.tv_introDesc)
        private val imgIcon = view.findViewById<ImageView>(R.id.img_intro)
        fun bind(screenItemModel: ScreenItemModel) {
            mTile.text = screenItemModel.title
            mDesc.text = screenItemModel.description
            Glide.with(itemView.context).load(screenItemModel.screenImage).into(imgIcon)
        }
    }
}
