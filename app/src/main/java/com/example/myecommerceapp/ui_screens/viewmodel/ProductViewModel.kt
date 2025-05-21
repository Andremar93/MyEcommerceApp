package com.example.myecommerceapp.ui_screens.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myecommerceapp.data.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel(){
    fun getProducts() = repository.getProducts()
}