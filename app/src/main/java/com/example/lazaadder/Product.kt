package com.example.lazaadder

data class Product(
    val id: String,
    val name: String,
    val lowercaseName: String,
    val brand: String,
    val price: Float,
    val offerPercentage: Float? = null,
    val description: String? = null,
    val colors: List<Int>? = null,
    val sizes: List<String>? = null,
    val images: List<String>
)