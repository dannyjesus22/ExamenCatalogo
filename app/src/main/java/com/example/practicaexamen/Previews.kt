package com.example.practicaexamen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ItemCardPreview() {

    MaterialTheme {

        ItemCard(
            item = listaItems[0],
            onClick = {}
        )
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DetalleCardPreview() {

    MaterialTheme {

        DetalleCard(
            item = listaItems[0]
        )
    }
}

