package com.example.practicaexamen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppMainScreen()
                }
            }
        }
    }
}

/*
 * Componente principal de la aplicación.
 *
 * Aquí se encuentra el estado de la navegación y el elemento
 * seleccionado. Esto permite aplicar State Hoisting.
 */
@Composable
fun AppMainScreen() {

    var pantallaActual by remember {
        mutableStateOf(Pantalla.INICIO)
    }

    var itemSeleccionado by remember {
        mutableStateOf<ItemData?>(null)
    }

    when (pantallaActual) {

        Pantalla.INICIO -> {
            PantallaInicio(
                onVerCatalogo = {
                    pantallaActual = Pantalla.CATALOGO
                }
            )
        }

        Pantalla.CATALOGO -> {
            PantallaCatalogo(
                items = listaItems,
                onItemClick = { item ->
                    itemSeleccionado = item
                    pantallaActual = Pantalla.DETALLE
                },
                onVolver = {
                    pantallaActual = Pantalla.INICIO
                }
            )
        }

        Pantalla.DETALLE -> {
            PantallaDetalle(
                item = itemSeleccionado,
                onVolver = {
                    pantallaActual = Pantalla.CATALOGO
                }
            )
        }
    }
}