package com.war_thunder_guide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.war_thunder_guide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //바인딩 객체 획득
        val binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        // 액티비티 화면 출력


        binding.titleamerica.setOnClickListener{
            var intent = Intent(this, americamain::class.java)
            startActivity(intent)
        }
        binding.titlegermany.setOnClickListener{
            var intent = Intent(this, germanymain::class.java)
            startActivity(intent)
        }
        binding.titlesoviet.setOnClickListener{
            var intent = Intent(this, sovietmain::class.java)
            startActivity(intent)
        }
        binding.titleenglad.setOnClickListener{
            var intent = Intent(this, englandmain::class.java)
            startActivity(intent)
        }
    }
}