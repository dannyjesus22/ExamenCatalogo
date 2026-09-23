package com.example.practicaexamen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun PantallaDetalle(
    item: ItemData?,
    onVolver: () -> Unit
) {

    Scaffold(

        topBar = {

            TopAppBar(

                title = {
                    Text("Información del producto")
                },

                navigationIcon = {

                    TextButton(
                        onClick = onVolver
                    ) {
                        Text("Catálogo")
                    }
                }
            )
        }

    ) { paddingValues ->

        if (item != null) {

            DetalleCard(
                item = item,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp)
            )

        } else {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),

                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "No se ha seleccionado ningún producto."
                )
            }
        }
    }
}