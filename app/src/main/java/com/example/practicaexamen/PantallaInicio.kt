package com.example.practicaexamen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaInicio(
    onVerCatalogo: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.icono
            ),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(180.dp)
        )

        Spacer(
            modifier = Modifier.height(25.dp)
        )


        Text(
            text = "Catálogo de Productos",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Bienvenido a nuestro catálogo interactivo.",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(
            modifier = Modifier.height(32.dp)
        )

        Button(
            onClick = onVerCatalogo
        ) {
            Text(
                text = "Ver Catálogo"
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PantallaInicioPreview() {

    MaterialTheme {

        PantallaInicio(
            onVerCatalogo = {}
        )
    }
}