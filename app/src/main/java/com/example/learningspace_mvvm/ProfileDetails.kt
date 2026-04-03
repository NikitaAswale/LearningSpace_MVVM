package com.example.learningspace_mvvm

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileDetailsUI(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column() {
            Top_Part()
            LazyColumn() {
                item {
                    Middle_Part()
                }
            }
        }
        Bottom_Part()
    }
}

@Composable
fun Top_Part(){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {

        Icon(Icons.Default.ArrowBack, contentDescription = "",
            modifier = Modifier.size(25.dp),
            tint = Color(0xFFB7410E)
        )

        Spacer(Modifier.width(20.dp))

        Text("Profile Details",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.MoreVert, contentDescription = "",
                tint = Color(0xFFB7410E)
            )
        }

    }
}

@Composable
fun Middle_Part() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(18.dp)
    )
    {

        Spacer(Modifier.height(30.dp))

        Text(
            "EDITORIAL MEMBER",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00BFFF)
        )

        Spacer(Modifier.height(10.dp))

        Text(
            "Leona Harriet Sterling",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            "@leona_editorial_99",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6F4E37)
        )

        Spacer(Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {}, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB7410E))
            ) {
                Icon(
                    Icons.Default.Email, contentDescription = "",
                    Modifier.padding(5.dp)
                        .size(25.dp),
                    tint = Color.White
                )

                Spacer(Modifier.width(8.dp))

                Text(
                    "Message",
                    modifier = Modifier.padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {

                Icon(
                    Icons.Default.Settings, contentDescription = "",
                    modifier = Modifier.size(30.dp),
                    tint = Color(0xFFB7410E)
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Card(
            elevation = CardDefaults.cardElevation(3.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    "@ PRIMARY EMAIL",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF00BFFF)
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    "I.sterling@scholarly.gallery",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            shape = RoundedCornerShape(12.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFF5F7))
                    .padding(16.dp)
            ) {
                Row() {
                    Icon(
                        Icons.Default.Home, contentDescription = "",
                        modifier = Modifier.size(20.dp),
                        tint = Color(0xFF6F4E37)
                    )

                    Spacer(Modifier.width(12.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            "AFFILIATION",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier, color = Color(0xFF6F4E37)
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))

                Text(
                    "Prestige Arts & Media Group",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(Modifier.height(6.dp))

                Text(
                    "Senior Editorial Director",
                    fontSize = 18.sp,
                    color = Color(0xFF6F4E37)
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            shape = RoundedCornerShape(12.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFF5F7))
                    .padding(16.dp)
            ) {
                Row() {
                    Icon(
                        Icons.Default.AccountCircle, contentDescription = "",
                        modifier = Modifier.size(20.dp),
                        tint = Color(0xFFB7410E)
                    )

                    Spacer(Modifier.width(12.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            "STATUS",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier, color = Color(0xFFB7410E)
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))

                Text(
                    "VERIFIED CONTRIBUTOR",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(Modifier.height(8.dp))

                Icon(
                    Icons.Default.CheckCircle, contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            shape = RoundedCornerShape(12.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFF5F7))
                    .padding(16.dp)
            ) {

                Row() {
                    Icon(
                        Icons.Default.Place, contentDescription = "",
                        modifier = Modifier.size(20.dp),
                        tint = Color(0xFF6F4E37)
                    )

                    Spacer(Modifier.width(12.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            "REGISTERED ADDRESS",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier, color = Color(0xFF6F4E37)
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))

                Text(
                    "VERIFIED CONTRIBUTOR",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }

        Spacer(Modifier.height(40.dp))

        Text(
            "ACCOUNT CONTROLS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6F4E37)
        )

        Spacer(Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Edit, contentDescription = "",
                modifier = Modifier
                    .background(
                        Color(0xFFFFF5F7),
                        shape = (CircleShape)
                    ).padding(6.dp).size(30.dp)
            )

            Spacer(Modifier.width(10.dp))

            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Edit Professional Profile",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    "Update credentials and bio",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6F4E37)
                )
            }
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Notifications, contentDescription = "",
                modifier = Modifier
                    .background(
                        Color(0xFFFFF5F7),
                        shape = (CircleShape)
                    ).padding(6.dp).size(30.dp)
            )

            Spacer(Modifier.width(10.dp))

            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center

                    ) {
                Text(
                    "Privacy & Security",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Text(
                    "Manage 2FA and sessions",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6F4E37)
                )
            }
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}

@Composable
fun Bottom_Part(){
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Bottom) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Icon(Icons.Default.Home, contentDescription = "",
                    Modifier.size(30.dp)
                )
                Text("Explore",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Icon(Icons.Default.Email, contentDescription = "",
                    Modifier.size(30.dp)
                )
                Text("Learning",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Icon(
                    Icons.Default.CheckCircle, contentDescription = "",
                    Modifier.size(30.dp)
                )
                Text(
                    "Certificates",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.LightGray, RoundedCornerShape(12.dp))
                    .padding(6.dp)) {
                Icon(Icons.Default.Person, contentDescription = "",
                    Modifier.size(30.dp),
                    tint = Color(0xFFB7410E)
                )
                Text("Person",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFB7410E)
                )
            }
        }
    }

}
