package com.example.navapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenC (
    GobackToScreenB: () -> Unit,
    GobackToScreenA : ()-> Unit
) {

    Scaffold (

        topBar = {
            TopAppBar(
                title = { Text(text = "Screen C") }
            )
        }
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Button(
                onClick = { GobackToScreenB() }
            ) {
                Text(text = "Go to Screen B")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = { GobackToScreenA() }
            ) {
                Text(text = "Go back to A")
            }

        }
    }

}