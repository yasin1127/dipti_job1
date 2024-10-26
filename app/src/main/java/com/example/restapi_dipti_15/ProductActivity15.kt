package com.example.restapi_dipti_15

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.job01.viewmodel.ProductViewModel15
import com.example.restapi_dipti_15.Adapter15.ProductAdapter15
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity15 : AppCompatActivity() {

    private lateinit var productViewModel: ProductViewModel15
    private lateinit var productAdapter: ProductAdapter15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product15)

        productViewModel = ViewModelProvider(this).get(ProductViewModel15::class.java)
        productAdapter = ProductAdapter15(emptyList())

        val refreshBtn:FloatingActionButton = findViewById(R.id.refreshBtn)

        refreshBtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity15,ProductActivity15::class.java))
            finish()
        }

        val recyclerView:RecyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer { product->
            productAdapter = ProductAdapter15(product)
            recyclerView.adapter = productAdapter
        })

    }
}