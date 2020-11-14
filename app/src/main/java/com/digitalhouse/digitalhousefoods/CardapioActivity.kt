package com.digitalhouse.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_cardapio.*

class CardapioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        val recyclerView = rvPrato

        recyclerView.adapter = PratoAdapter(Pratos(), this)


        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager

        recyclerView.setHasFixedSize(true)
    }

    private fun Pratos(): List<Prato> = listOf(
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        ),
        Prato(
            "Salada com molho Gengibre",
            R.drawable.image1
        )
    )
}