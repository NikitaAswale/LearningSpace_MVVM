package com.example.learningspace_mvvm

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LearningSpace_UI(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize())
    {
        Top()
        Middle(navController)
    }
}

@Composable
fun Top(){
    Row(modifier = Modifier
        .fillMaxWidth()
       .padding(18.dp)
    )
    {
        Icon(
            Icons.Default.ArrowBack, contentDescription = "",
            modifier = Modifier.size(25.dp),
            tint = Color(0xFFB7410E)
        )

        Spacer(Modifier.width(14.dp))

        Text("Settings",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}

@Composable
fun Middle(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(18.dp)
    )
    {

        Spacer(Modifier.height(30.dp))

        Text(
            "PREFERENCES",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00BFFF)
        )

        Spacer(Modifier.height(10.dp))

        Text(
            "Configure your learning space.",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(Modifier.height(40.dp))

        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            shape = RoundedCornerShape(12.dp)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFF5F7))
                    .padding(12.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column()
                {
                    Text(
                        "Enable Notifications",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        "Receive updates about your progress",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF6F4E37)
                    )
                }
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.End
                )
                {
                    Switch(
                        checked = true, onCheckedChange = {},
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            uncheckedThumbColor = Color.Gray,
                            checkedTrackColor = Color(0xFFB7410E),
                            uncheckedIconColor = Color.Gray
                        )
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFF5F7))
                    .padding(12.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column()
                {
                    Text(
                        "Dark Mode Preference",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        "Adjust the interface for night reading",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF6F4E37)
                    )
                }
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.End
                )
                {
                    Switch(
                        checked = false, onCheckedChange = {},
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            uncheckedThumbColor = Color.White,
                            checkedTrackColor = Color(0xFFFFC0CB),
                            uncheckedTrackColor = Color(0xFFFFC0CB)
                        )
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "",
            modifier = Modifier.
            size(500.dp, 200.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .align(Alignment.CenterHorizontally),
            colorFilter = ColorFilter.tint(Color.Black)
        )

        Spacer(Modifier.height(20.dp))

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom)
        {

        Button(
            onClick = {navController.navigate("Screen2")},
            Modifier, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB7410E))
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    "Next Screen",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(12.dp))
                Icon(Icons.Default.ArrowForward, contentDescription = "")
            }
        }

        Spacer(Modifier.height(15.dp))

            Button(
                onClick = {},
                Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                border = BorderStroke(2.dp, Color(0xFFB7410E)),
            )
            {
                Text(
                    "Cancel",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6F4E37),
                    modifier = Modifier.padding(8.dp)
                )
            }

            Spacer(Modifier.height(30.dp))
        }
    }
}