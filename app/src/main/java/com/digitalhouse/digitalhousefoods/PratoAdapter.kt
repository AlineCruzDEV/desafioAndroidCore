package com.digitalhouse.digitalhousefoods

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView



class PratoAdapter(val listaPratos: List<Prato>, val context: Context) :
    RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PratoAdapter.PratoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.restaurante_item, parent, false)
        return PratoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PratoAdapter.PratoViewHolder, position: Int) {
        val currentItem = listaPratos[position]
        holder.tvNomeRestaurante.setText(currentItem.nome)
        holder.ivRestaurante.setImageResource(currentItem.imgRestaurante)

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "agora passar o Prato", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listaPratos.size
    }

    class PratoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNomeRestaurante: TextView = itemView.findViewById(R.id.tvNomeRestaurante)
        val ivRestaurante: ImageView = itemView.findViewById(R.id.ivRestaurante)

    }
}