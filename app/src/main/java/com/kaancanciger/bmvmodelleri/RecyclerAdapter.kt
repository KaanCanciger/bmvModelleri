package com.kaancanciger.bmvmodelleri

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val bmvListesi : ArrayList<String>, val bmvGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.ArabaModelleriVH>() {

    class ArabaModelleriVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArabaModelleriVH {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return ArabaModelleriVH(itemView)
    }

    override fun getItemCount(): Int {
        return bmvListesi.size
    }

    override fun onBindViewHolder(holder: ArabaModelleriVH, position: Int) {

        holder.itemView.recyclerViewTextView.text = bmvListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("bmvModeliIsmi",bmvListesi.get(position))
            intent.putExtra("bmvModeliGorseli",bmvGorselleri.get(position))



            holder.itemView.context.startActivity(intent)
        }

    }

}