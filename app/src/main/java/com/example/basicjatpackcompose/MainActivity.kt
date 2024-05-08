package com.example.basicjatpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicjatpackcompose.ui.theme.BasicJatpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


    }
}


@Preview(showBackground = true, heightDp = 100, widthDp = 100)
@Composable
fun GreetingPreview() {
    Text(text = "hello rakib")
}


@Preview(showBackground = true)
@Composable
fun Second() {
    Text(text = "hello", fontStyle =FontStyle.Italic, color = Color.Red, textAlign = TextAlign.Center )
}