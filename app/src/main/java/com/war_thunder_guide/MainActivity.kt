package com.war_thunder_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.war_thunder_guide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //바인딩 객체 획득
        val binding =ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        // 액티비티 화면 출력
        setContentView(R.layout.activity_main)

        binding.titleamerica.setOnClickListener{

        }
        binding.titlegermany.setOnClickListener{

        }
        binding.titlesoviet.setOnClickListener{

        }
        binding.titleenglad.setOnClickListener{

        }



    }
}