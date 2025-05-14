package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard("Jennifer Doe","Android Developer Extraordinaire")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name:String,title:String,modifier: Modifier= Modifier) {
    val image= painterResource(R.drawable.android_logo)
    Column (
        modifier= Modifier
            .background(color = Color(0xFF3ddc84))
            ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(color = Color(0xFF082F3E))
            )
            Text(
                text = name,
                lineHeight = 20.sp,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,

                )
            Text(
                text = title
            )


        }
    }

    Column(
            verticalArrangement = Arrangement.Bottom,
            modifier= Modifier
                .fillMaxSize()
                .padding(start=100.dp,bottom=70.dp)
        ) {
            Column(

            ) {
                Row(

                ) {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = "Call icon")
                    Spacer(modifier= Modifier.width(20.dp))
                Text(
                    text = stringResource(R.string.phoneno)
                )
                }

            }
            Spacer(modifier = modifier.height(10.dp))
            Column(

            ) {
                Row {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "Share icon"
                    )
                    Spacer(modifier= Modifier.width(20.dp))
                    Text(
                        text= stringResource(R.string.android_dev)
                    )
                }
            }
        Spacer(modifier=modifier.height(10.dp))
            Column() {
                Row {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                    Spacer(modifier= Modifier.width(20.dp))
                    Text(
                        text= stringResource(R.string.joe_doe_android_com)
                    )
                }
            }
        }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard("Jennifer Doe","Android Developer Extraordinaire")
    }
}