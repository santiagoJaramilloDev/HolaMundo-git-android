package com.example.holamundogithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.holamundogithub.ui.theme.HolaMundoGitHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundoGitHubTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HolaMundoScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HolaMundoScreen(modifier: Modifier = Modifier) {
    // Un degradado de colores agradables (Azul profundo a Morado oscuro)
    val backgroundGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF2B5876),
            Color(0xFF4E4376)
        )
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hola mundo",
            style = TextStyle(
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFFFFD700), // Color dorado (Gold) que contrasta perfecto
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.6f),
                    offset = Offset(6f, 6f),
                    blurRadius = 10f
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HolaMundoPreview() {
    HolaMundoGitHubTheme {
        HolaMundoScreen()
    }
}