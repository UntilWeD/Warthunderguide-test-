package com.war_thunder_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.war_thunder_guide.databinding.ActivityAmericamainBinding

class americamain : AppCompatActivity() {

    private lateinit var binding: ActivityAmericamainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityAmericamainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.americatankbtn.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment = americatank()
            transaction.add(R.id.americafragmentframe, fragment)
            transaction.commit()
        }
    }

}

