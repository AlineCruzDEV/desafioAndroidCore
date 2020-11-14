package com.digitalhouse.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val recyclerView = rvRestaurante

        recyclerView.adapter = RestauranteAdapter(Restaurantes(), this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.setHasFixedSize(true)
    }

    //function that returns the list of restaurants
    private fun Restaurantes(): List<Restaurante> = listOf(
        Restaurante(
            1,
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            R.drawable.image1
        ),
        Restaurante(
            2,
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            R.drawable.image3
        ),
        Restaurante(
            3,
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            R.drawable.image4
        ),
        Restaurante(
            4,
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            R.drawable.image5
        )
    )
}