package com.prestosa.gmailrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prestosa.gmailrecyclerview.databinding.RowLayoutBinding

class RecyclerAdapter(private val itemList: List<MyDataModel>, private val onItemClick: (MyDataModel) -> Unit) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    data class MyDataModel(val name: String, val subject: String, val body: String)

    inner class MyViewHolder(private val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyDataModel) {
            with(binding) {
                nameTV.text = item.name
                subjectTV.text = item.subject
                bodyTV.text = item.body
            }

            // Set a click listener for the entire row
            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}