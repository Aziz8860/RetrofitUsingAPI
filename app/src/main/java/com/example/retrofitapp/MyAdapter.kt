package com.example.retrofitapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, val userList: List<Article>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var description: TextView
        var source: TextView
        var image: ImageView

        init {
            title = itemView.title
            description = itemView.description
            source = itemView.source
            image = itemView.image_article
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = userList[position].title
        holder.description.text = userList[position].description
        holder.source.text = userList[position].source.name

        val url = userList[position].urlToImage
        Picasso.get().load(url).resize(500,400).into(holder.image)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
