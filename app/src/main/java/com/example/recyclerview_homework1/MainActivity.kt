package com.example.recyclerview_homework1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Horizontal
        var customH = CustomH(this, LanguageFactory.loadlanguage())
        var linearLayoutManagerH = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        binding.recyclerViewH.apply {
            layoutManager = linearLayoutManagerH
            adapter= customH
        }
        //=================

        var customV = CustomV(this, LanguageFactoryVertical.loadLanguages())
        var linearLayoutManagerV = LinearLayoutManager(this)

        binding.recyclerViewV.apply {
            layoutManager = linearLayoutManagerV
            adapter = customV
        }
        //https://github.com/Ranoscyber/RecyclerView1

    }
}