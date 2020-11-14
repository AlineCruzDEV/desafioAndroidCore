package com.digitalhouse.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Click in LOG IN Button
        btLogin.setOnClickListener {
            callMain()
        }

        //Click in REGISTER Button
        btRegister.setOnClickListener {
            callRegister()
        }

    }

    //Function that through the intent will start the HomePageActivity
    private fun callMain() {
        finishAffinity()
        var intent = Intent(this, HomePageActivity::class.java)
        startActivity(intent)
    }

    //Function that through the intent will start the RegisterActivity
    private fun callRegister() {
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}