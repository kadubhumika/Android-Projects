package com.example.jetpackcompose

import androidx.compose.ui.graphics.ColorFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
                    Greeting("BHUMIKA KADU")
                }
            }
        }
    }


}
@Composable
fun Greeting(name:String,modifier: Modifier = Modifier) {
    Text(
        text = "HELLOO $name!",
        modifier = Modifier
    )


}
@Preview( showBackground = true)
@Composable
fun GreetingPreview(){
    JetpackComposeTheme {
        Greeting("Android")
    }

}