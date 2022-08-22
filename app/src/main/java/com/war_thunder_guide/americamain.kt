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

        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.add(R.id.americafragmentframe,americatank())
        transaction.commit()

        binding.americatankbtn.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.americafragmentframe,americatank())
            transaction.commit()
        }

        binding.americaplanebtn.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.americafragmentframe, americaplane())
            transaction.commit()
        }

        binding.americabookmarkbtn.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.americafragmentframe, americabookmark())
            transaction.commit()
        }

        binding.americamenubtn.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.americafragmentframe, americamenu())
            transaction.commit()
        }


    }

}

