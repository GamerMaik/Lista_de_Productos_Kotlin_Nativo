package com.example.modulopedidospollossilver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulopedidospollossilver.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgId = intent.getIntExtra("imgResID",0)
        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")

        binding.textNombreProducto.text=productName
        binding.textPriceProduct.text= productPrice
        binding.ImgProduct.setImageResource(imgId)
    }
}