package com.example.benchat.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreen(navController: NavController) {
    // local States
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    val isChecked = remember { mutableStateOf(false) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        //Top
        Box(modifier = Modifier
            .background(Color.Transparent)
            .weight(1F)){

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 45.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "TheConnectorChat",
                    color = Color.DarkGray,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(horizontal = 2.dp, vertical = 20.dp)
                )
                Text(
                    text = "Sign In",
                    color = Color.DarkGray,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 2.dp)
                )
                Text(
                    "Sign in to the connector chat.",
                    color = Color.DarkGray,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Thin, modifier = Modifier.padding(vertical = 10.dp)
                )
            }

        }


        //Middle
        Box(modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .weight(2F)
            .padding(horizontal = 10.dp)
            .clip(shape = RoundedCornerShape(5))
        )
        {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //email field
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Email",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 55.dp),
                        fontSize = 18.sp, textAlign = TextAlign.Justify
                    )
                    OutlinedTextField(
                        value = email,
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "Email icon"
                            )
                        },
                        placeholder = { Text(text = "test@gmail.com") },
                        onValueChange = { newEmail ->
                            email = newEmail
                        }, modifier = Modifier
                            .padding(top = 10.dp)
                    )
                }
                //password field
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(top = 10.dp)) {
                    Text(
                        text = "Password",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 55.dp),
                        fontSize = 18.sp, textAlign = TextAlign.Justify
                    )
                    OutlinedTextField(
                        value = password,
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "Padlock icon"
                            )
                        },
                        placeholder = { Text(text = "....") },
                        onValueChange = { newPassword ->
                            password = newPassword
                        },
                        modifier = Modifier.padding(top = 10.dp),
                    )
                }
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Checkbox(
                        checked = isChecked.value,
                        onCheckedChange = { isChecked.value = it },
                        modifier = Modifier.padding(start = 50.dp)
                    )
                    Text(
                        "Remember Me",
                        color = Color.DarkGray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Thin
                    )

                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20),
                    modifier = Modifier.width(300.dp)

                ) {
                    Text(
                        "Sign In",
                        color = Color.White,
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

        }
        //Bottom
        Box(modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .weight(1F)
            .padding(start = 10.dp, end = 10.dp, top = 15.dp)
        )
        {

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                ) {

                Text(
                    buildAnnotatedString {
                    append("Don't you have an account ? ")
                    withStyle(
                        style = SpanStyle(
                            color = MaterialTheme.colors.primary,
                            fontSize = MaterialTheme.typography.body1.fontSize,
                            fontWeight = FontWeight.SemiBold,
                        )
                    ) {
                        append(" Signup now")
                    }
                }, modifier = Modifier.align(Alignment.CenterHorizontally),
                )
                Text("Crafted by Belmo Ltd", modifier = Modifier.align(Alignment.CenterHorizontally))

            }

        }



    }



}

@Preview
@Composable
fun PreviewLoginScreen() {
    val navController= rememberNavController()
 LoginScreen(navController = navController)
}
