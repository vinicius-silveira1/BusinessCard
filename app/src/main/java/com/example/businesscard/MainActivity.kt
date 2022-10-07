package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()

                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    val image = painterResource(R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,

    ){
        Column() {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .width(100.dp)
                    .height(100.dp)
            )
            Text(
                text = "Vinicius Silveira",
                fontSize = 40.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally),
                color = Color.White
            )
            Text(
                text = "Android Developer",
                fontSize = 24 .sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally),
                color = Color(0xFF3ddc84)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(top = 120.dp)
        ) {
            Row {
                Icon(
                    Icons.Filled.Phone,
                    contentDescription = "Phone icon",
                    tint = Color(0xFF3ddc84)
                )
                Text(
                    text = "(11) 99890-4227",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 120.dp),
                    color = Color.White


        )

            }

        }
    }
}


@Preview(showBackground = true, widthDp = 390, heightDp = 800,
)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()

    }
}