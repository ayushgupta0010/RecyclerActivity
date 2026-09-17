package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {
    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {}
    // TODO Step 3b: Complete function definitions for adapter

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = NumberViewHolder(TextView(parent.context).apply {
        setPadding(15, 15, 15, 15)
        textSize = 32f
    })

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount() = numbers.size
}