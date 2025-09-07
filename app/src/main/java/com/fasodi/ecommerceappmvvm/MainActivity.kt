package com.fasodi.ecommerceappmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fasodi.ecommerceappmvvm.ui.theme.KotlinEcommerceMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinEcommerceMVVMTheme {
                LoginContent()
            }
        }
    }
}

@Composable
fun LoginContent(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToScale(0.5f,0.5f,0.5f,1f) })
            )
        Column(
            modifier=Modifier.fillMaxWidth().padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier = Modifier.height(100.dp).width(100.dp),
                painter = painterResource(R.drawable.shopping_cart_blue),
                contentDescription = "Logo",

            )
            Text(
                modifier = Modifier.padding(top = 7.dp),
                text="ECOMMERCE APP",
                fontWeight = FontWeight.Bold,
                color=Color.White,
                fontSize=20.sp
                )
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    KotlinEcommerceMVVMTheme {
        Greeting("Android")
    }
}