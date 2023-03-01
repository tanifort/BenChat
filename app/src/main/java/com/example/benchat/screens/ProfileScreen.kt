package com.example.benchat.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.benchat.R

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
                    .weight(1F)
                    .background(Color.Blue),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = "Content Top", modifier = Modifier.padding(bottom = 30.dp))

                        Image(painter = painterResource(id = R.drawable.ic_launcher_background ) ,
                            contentDescription = "Image",
                            modifier = Modifier
                                .size(88.dp)
                                .clip(
                                    CircleShape
                                ) )
                    }

                }
                //Bottom Container
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(2F)
                    .background(Color.Green)
                    .padding(top = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Text(text = "Content Bottom")
                    Text(buildAnnotatedString {
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                        append("Lorem ipsum, bla bla FM!")
                    }, modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp , bottom = 30.dp))

                    Column(modifier = Modifier
                        .fillMaxSize()
                    ) {
                        //Custom buttons
                       Box(

                           modifier = Modifier
                               .height(60.dp)
                               .background(Color.Blue)
                               .clip(RoundedCornerShape(30))
                               .padding(horizontal = 10.dp, vertical = 10.dp)
                               .fillMaxWidth() ,

                       ) {
                          Row( modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                              Text(text = "Icon")
                              Text(text = "About")
                          }
                           
                       }



                    }
                }
            }


        }},
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