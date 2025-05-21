package com.example.myecommerceapp.data

import com.example.myecommerceapp.models.Product

interface ProductRepository {
    fun getProducts(): List<Product>
}