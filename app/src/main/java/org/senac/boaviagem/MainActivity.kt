package org.senac.boaviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var logoComponent : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoComponent = findViewById<ImageView>(R.id.iv_logo_app)
        logoComponent.setImageResource(R.drawable.logo)
    }
}
