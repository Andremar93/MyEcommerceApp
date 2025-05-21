package com.example.myecommerceapp.data

import com.example.myecommerceapp.models.Product

class FakeProductRepository : ProductRepository {
    override fun getProducts(): List<Product> {
        return listOf(
            Product(1, "Product 1", 100.0),
            Product(2, "Product 2", 150.0)
        )
    }
}