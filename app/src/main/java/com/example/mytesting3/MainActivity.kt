package com.example.mytesting3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytesting3.ui.theme.MyTesting3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTesting3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(36.dp))
            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(20.dp))

            // Card 1: Wulandhika
            ProfileCard(
                name = stringResource(id = R.string.name_1),
                phone = stringResource(id = R.string.phone_1),
                address = stringResource(id = R.string.address_1),
                backgroundColor = colorResource(id = R.color.card_gray),
                textColor = colorResource(id = R.color.white),
                phoneColor = colorResource(id = R.color.phone_cyan)
            )
            Spacer(modifier = Modifier.height(12.dp))

            // Card 2: Sarwendah
            ProfileCard(
                name = stringResource(id = R.string.name_2),
                phone = stringResource(id = R.string.phone_2),
                address = stringResource(id = R.string.address_2),
                backgroundColor = colorResource(id = R.color.card_purple),
                textColor = colorResource(id = R.color.white),
                phoneColor = colorResource(id = R.color.phone_cyan)
            )
            Spacer(modifier = Modifier.height(12.dp))

            // Card 3: Ivan Gunawan
            ProfileCard(
                name = stringResource(id = R.string.name_3),
                phone = stringResource(id = R.string.phone_3),
                address = stringResource(id = R.string.address_3),
                backgroundColor = colorResource(id = R.color.card_blue),
                textColor = colorResource(id = R.color.white),
                phoneColor = colorResource(id = R.color.phone_cyan)
            )
            Spacer(modifier = Modifier.height(12.dp))

            // Card 4: Nikolas Saputra
            ProfileCard(
                name = stringResource(id = R.string.name_4),
                phone = stringResource(id = R.string.phone_4),
                address = stringResource(id = R.string.address_4),
                backgroundColor = colorResource(id = R.color.card_green),
                textColor = colorResource(id = R.color.white),
                phoneColor = colorResource(id = R.color.phone_cyan)
            )
        }

        // Footer Copyright
        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}