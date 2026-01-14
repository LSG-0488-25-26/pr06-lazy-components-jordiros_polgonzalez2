package com.example.lazycomponents.viewmodel

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.lazycomponents.R
import com.example.lazycomponents.model.Dog

fun getDogsList(): MutableList<Dog> {
    val listDogs: MutableList<Dog> = mutableListOf()

    listDogs.add(Dog("Kenya", 3, R.drawable.perro1))
    listDogs.add(Dog("Lasy", 5, R.drawable.perro2))
    listDogs.add(Dog("Mantequilla", 2, R.drawable.perro3))
    listDogs.add(Dog("Rocky", 7, R.drawable.perro4))
    listDogs.add(Dog("Sabueso", 4, R.drawable.perro5))
    listDogs.add(Dog("Aceituna", 6, R.drawable.perro6))
    listDogs.add(Dog("Wisky", 5, R.drawable.perro7))
    listDogs.add(Dog("Kanela", 4, R.drawable.perro8))

    return listDogs
}

@Composable
fun DogItem(dog: Dog) {
    Card(border = BorderStroke(2.dp, Color.LightGray),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row {
            Image(
                painter = painterResource(id = dog.image),
                contentDescription = dog.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(220.dp)
                    .padding(8.dp)
            )
            Column{
                Text(
                    text = "Nombre: " + dog.name,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "Edad: " + dog.age.toString() + " años")
            }
        }
    }
}