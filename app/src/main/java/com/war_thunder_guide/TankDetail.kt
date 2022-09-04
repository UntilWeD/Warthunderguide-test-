package com.war_thunder_guide

import america.americatankdata
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class TankDetail : AppCompatActivity() {
    lateinit var tankdata : americatankdata
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tank_detail)

        tankdata = intent.getSerializableExtra("tankdata") as americatankdata


        Glide.with(this).load(tankdata.img).into(findViewById(R.id.tank_image))
    }
}