package com.example.benchat.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.benchat.R
import com.example.benchat.ui.components.UserInfoOverview

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen() {
    //states
    val scaffoldState = rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed));

    //Button states

    val isPressed = false;
    val color = if(isPressed) Color.DarkGray else Color.Gray;
    //end states
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = {Text("My Profile")}, backgroundColor = Color.White)  },
        //Drawer
        drawerContent = {
            Column() {
                Text(text = "Drawer Content!")
            }
        },
        content = { Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
            .padding(start = 10.dp, end = 10.dp, top = 15.dp)) {

            Column(modifier = Modifier.fillMaxSize()) {
                //Top Container
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F),
                    contentAlignment = Alignment.Center
                ){
                    Column(

                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Content Top", modifier = Modifier.padding(bottom = 20.dp))

                        Image(painter = painterResource(id = R.drawable.ic_launcher_background ) ,
                            contentDescription = "Image",
                            modifier = Modifier
                                .size(88.dp)
                                .clip(
                                    CircleShape
                                ) )
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "John Kendey", modifier = Modifier.padding(bottom = 10.dp, top = 10.dp), fontSize = 25.sp)
                            Text(text = "Active", modifier = Modifier.padding(bottom = 5.dp), fontSize = 17.sp)
                        }

                    }

                }
                //Bottom Container
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(2F)
                    .padding(top = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    //Bio!
                    Text(buildAnnotatedString {
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                    }, modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp , bottom = 30.dp))

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(top = 2.dp, bottom = 2.dp, start = 10.dp, end = 10.dp)
                        .border(BorderStroke(0.7.dp, SolidColor(Color.LightGray))),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Row(horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth(0.30F)
                                .padding(start = 10.dp)
                        ) {
                            Icon(
                                Icons.Default.SupervisorAccount,
                                contentDescription = "account"
                            )
                            Text(text = "About")
                        }

                        Icon(
                            Icons.Default.ArrowForwardIos, modifier = Modifier
                                .padding(end = 10.dp)
                                .size(15.dp),
                            contentDescription = "forward arrow"
                        )
                    }


                    UserInfoOverview(
                        InfoText = "Attachments",
                        InfoIcon = {
                            Icon(
                                Icons.Default.AttachFile,
                                contentDescription = "Add document"
                            )
                        },
                        modifier = Modifier,
                        onClick = { println("Add Attachment")}
                    )


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(top = 2.dp, bottom = 2.dp, start = 10.dp, end = 10.dp)
                        .border(BorderStroke(0.7.dp, SolidColor(Color.LightGray))),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                                .fillMaxWidth(0.33F)
                                .padding(start = 10.dp)
                            ) {
                            Icon(
                                Icons.Default.AttachFile,
                                contentDescription = "Add document"
                            )

                            Text(text = "Attachments")
                        }
                        Icon(
                            Icons.Default.ArrowForwardIos, modifier = Modifier
                                .padding(end = 10.dp)
                                .size(15.dp),
                            contentDescription = "arrow forward"
                        )
                    }
                }
            }


        }},
        //Make this reusable
        bottomBar = {
            BottomNavigation( backgroundColor = Color.LightGray) {

            }
        }
       


    )

};


@Preview
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}