package com.example.lazycomponents.model

import androidx.annotation.DrawableRes

data class Dog (
    var name: String,
    var age: Int,
    @DrawableRes var image: Int
)