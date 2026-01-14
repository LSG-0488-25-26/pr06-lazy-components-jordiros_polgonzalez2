package com.example.lazycomponents.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lazycomponents.viewmodel.DogItem
import com.example.lazycomponents.viewmodel.getDogsList

@Composable
fun MainView(modifier: Modifier) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .padding(vertical = 30.dp)
            .fillMaxHeight()
    ) {
        items(getDogsList()){
            DogItem(dog = it)
        }
    }
}
