package com.example.modulopedidospollossilver

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modulopedidospollossilver.databinding.ActivityMainBinding
import com.example.modulopedidospollossilver.databinding.ItemProductBinding

class ProductAdapter(private val producList: List<Product>):
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

        inner class ProductViewHolder(private val binding: ItemProductBinding):
                RecyclerView.ViewHolder(binding.root){
                    fun bind(product:Product){
                        binding.imageView.setImageResource(product.imageResId)
                        binding.nameTextView.text= product.name
                        binding.priceTextView.text= product.price
                    }
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding= ItemProductBinding.inflate(inflater,parent,false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product= producList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int= producList.size
}