package com.example.learningspace_mvvm

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun MemberGallery_UI(viewModel: UsersViewModel = viewModel(), navController: NavController){
    val user by viewModel.users.collectAsState()
    Box(modifier = Modifier.fillMaxSize()) {
        Column() {
            TopPart()
            MiddlePart(user)
            BottomPart()
        }
        BottomPart()
    }
}
@Composable
fun TopPart(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Icon(Icons.Default.List, contentDescription = "",
            modifier = Modifier.size(30.dp),
            tint = Color(0xFFB7410E)
        )

        Spacer(Modifier.width(14.dp))

        Text("Scholarly Gallery",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                Modifier
                    .background(Color.Black, CircleShape)
                    .size(30.dp),
                colorFilter = ColorFilter.tint(Color.White)
            )
        }

    }
}

@Composable
fun MiddlePart(user : List<Users>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(18.dp)
    )
    {

        Spacer(Modifier.height(10.dp))

        Text(
            "DIRECTORY",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00BFFF)
        )

        Spacer(Modifier.height(10.dp))

        Text(
            "Member Gallery",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(Modifier.height(20.dp))

        Text("Our community of scholars, researchers, and creative thinkers driving innovation across the gallery.",
            fontSize = 18.sp,
            fontStyle = FontStyle.Normal,
            color = Color(0xFF6F4E37)
        )

        Spacer(Modifier.height(30.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(50))
            .padding(6.dp),
            verticalAlignment = Alignment.CenterVertically) {
            OutlinedTextField(
                value = "", onValueChange = {},
                leadingIcon = {
                    Icon(Icons.Default.Search, contentDescription = "",
                        modifier = Modifier.size(30.dp),
                        tint = Color(0xFF6F4E37),)
                },
                placeholder = {
                    Text(
                        "Filter by name...",
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                },
                modifier = Modifier
                    .weight(1f),
                shape = RoundedCornerShape(50),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent,

                )
            )
            Button(onClick = {},
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd84315))
            )
            {
                Text("Find Scholar",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
        }

        LazyColumn() {
            items(user) {users ->
                UserList(users)
            }
        }


        Text("LOAD MORE MEMBERS",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = Color(0xFFB7410E),
            modifier = Modifier,
        )
    }
}

@Composable
fun UserList(users: Users){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    )
    {
        Icon(
            Icons.Default.AccountCircle, contentDescription = "",
            modifier = Modifier
                .size(40.dp)
                .background(Color.Black, RoundedCornerShape(6.dp)),
            tint = Color.White
        )

        Spacer(Modifier.width(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "${users.name}",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF57C00)
            )

            Text(
                "${users.email}",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color(0xFF6F4E37)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Icon(Icons.Default.MoreVert, contentDescription = "")
        }
    }
}

@Composable
fun BottomPart(){
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Bottom) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(Color.White)
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Column(Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Icon(
                    Icons.Default.Home, contentDescription = "",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF6F4E37)
                )
                Spacer(Modifier.height(2.dp))

                Text("Home",
                    fontSize = 14.sp,
                    color = Color(0xFF6F4E37))
            }

            Column(Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
            Icon(Icons.Default.Email, contentDescription = "",
                modifier = Modifier.size(25.dp),
                tint = Color(0xFF6F4E37))

                Spacer(Modifier.height(2.dp))

                Text("Home",
                    fontSize = 14.sp,
                    color = Color(0xFF6F4E37))
            }

            Column(Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
            Icon(Icons.Default.Search, contentDescription = "",
                modifier = Modifier.size(25.dp),
                tint = Color(0xFF6F4E37))

                Spacer(Modifier.height(2.dp))

                Text("Home",
                    fontSize = 14.sp,
                    color = Color(0xFF6F4E37))
            }

            Column(Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
            Icon(Icons.Default.Settings, contentDescription = "",
                modifier = Modifier.size(25.dp),
                tint = Color(0xFF6F4E37))

                Spacer(Modifier.height(2.dp))

                Text("Home",
                    fontSize = 14.sp,
                    color = Color(0xFF6F4E37))
            }
        }
    }
}