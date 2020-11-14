package com.digitalhouse.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Click in REGISTER Button
        btRegister2.setOnClickListener{
            callMain()
        }
    }

    //Function that through the intent will start the HomePageActivity
    private fun callMain() {
        finishAffinity()
        var intent = Intent(this, HomePageActivity::class.java)
        startActivity(intent)
    }
}