package com.example.practicaexamen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetalleCard(
    item: ItemData,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),

            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = item.titulo,
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "ID: ${item.id}",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Descripción:",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = item.descripcion,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Precio: $${item.precio}",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Cantidad disponible: ${item.cantidad}",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Imagen URL:",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = item.imagenUrl,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}