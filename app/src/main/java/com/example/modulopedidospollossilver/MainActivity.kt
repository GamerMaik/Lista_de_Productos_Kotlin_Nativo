package com.example.modulopedidospollossilver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modulopedidospollossilver.databinding.ActivityMainBinding

import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productList= listOf(
            Product("Ala pecho","18Bs.",R.drawable.alapecho),
            Product("Pecho","18Bs.",R.drawable.pecho),
            Product("Pierna Entrepierna","18Bs.",R.drawable.piernaentrepierna),
            Product("Coca Cola","10Bs.",R.drawable.bebida1),
            Product("Fanta Guaraná","10Bs.",R.drawable.bebida2),
            Product("Sprite","11Bs.",R.drawable.bebida3),
            Product("Fanta Papaya","11Bs.",R.drawable.bebida4),
        )
        recyclerView = binding.recyclerView
        recyclerView.layoutManager= LinearLayoutManager(this)
        productAdapter = ProductAdapter(productList,this)
        recyclerView.adapter = productAdapter
    }
}