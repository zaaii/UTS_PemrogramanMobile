package com.zai.pekerjaan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zai.pekerjaan.R
import com.zai.pekerjaan.model.Jobs
import android.widget.ImageView

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Jobs>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView2: TextView = view.findViewById(R.id.item_subtitle)
        val textView3: TextView = view.findViewById(R.id.item_subtitle2)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceId2)
        holder.textView3.text = context.resources.getString(item.stringResourceId3)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}