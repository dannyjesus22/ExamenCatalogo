package com.example.practicaexamen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaCatalogo(
    items: List<ItemData>,
    onItemClick: (ItemData) -> Unit,
    onVolver: () -> Unit
) {

    Scaffold(

        topBar = {

            TopAppBar(
                title = {
                    Text("Catálogo")
                },

                navigationIcon = {

                    TextButton(
                        onClick = onVolver
                    ) {
                        Text("Inicio")
                    }
                }
            )
        }

    ) { paddingValues ->

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),

            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),

            contentPadding = PaddingValues(16.dp),

            horizontalArrangement = Arrangement.spacedBy(12.dp),

            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(items) { item ->

                ItemCard(
                    item = item,
                    onClick = {
                        onItemClick(item)
                    }
                )
            }
        }
    }
}