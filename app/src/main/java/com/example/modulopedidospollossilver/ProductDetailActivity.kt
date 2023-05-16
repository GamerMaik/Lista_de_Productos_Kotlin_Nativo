package com.example.modulopedidospollossilver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modulopedidospollossilver.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding
    private var cantidad = 1;
    private var estado=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CargarDatos()
        binding.textCantidadProduct.text= "Cantidad: $cantidad"
        binding.BtnAgregar.setOnClickListener {
            Toast.makeText(this,"Producto Agregado",Toast.LENGTH_SHORT).show()
        }
        binding.BtnMenos.setOnClickListener {
            RestarCantidad()
        }
        binding.BtnMas.setOnClickListener {
            SumarCantidad()
        }

    }
    fun SumarCantidad(){
        if (cantidad<5){
            cantidad +=1
            binding.textCantidadProduct.text= "Cantidad: $cantidad"
        }else{
            Toast.makeText(this,"Maxima cantidad del Producto",Toast.LENGTH_SHORT).show()
        }
    }
    fun RestarCantidad(){
        if (cantidad >1){
            cantidad -=1
            binding.textCantidadProduct.text= "Cantidad: $cantidad"
        }else{
            Toast.makeText(this,"Minima cantidad del Producto",Toast.LENGTH_SHORT).show()
        }
    }
    fun CargarDatos(){
        val imgId = intent.getIntExtra("imgResID",0)
        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")

        binding.textNombreProducto.text=productName
        binding.textPriceProduct.text= productPrice
        binding.ImgProduct.setImageResource(imgId)
    }
}