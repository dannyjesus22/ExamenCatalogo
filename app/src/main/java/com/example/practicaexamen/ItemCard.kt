package com.example.practicaexamen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemCard(
    item: ItemData,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clickable {
                onClick()
            },

        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = item.titulo,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = item.descripcion,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = "$${item.precio}",
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = "Cantidad: ${item.cantidad}",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}