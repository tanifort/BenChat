package com.example.benchat.ui.navigations.bottonNavigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.benchat.ui.theme.Purple200

@Composable
fun AppBottomNavigation(navController: NavController) {
    val screens = listOf(
        BottomNavScreen.Home,
        BottomNavScreen.Settings,
        BottomNavScreen.Profile,
        BottomNavScreen.Message,
        BottomNavScreen.Accounts
    )

    val  navStackBackEntry by navController.currentBackStackEntryAsState();
    val currentDestination = navStackBackEntry?.destination;

    Row (
        modifier = Modifier
            .padding(8.dp)
            .background(Color.White)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        screens.forEach { screen ->
            AddItem(screen = screen, currentDestination = currentDestination , navController = navController )
        }

    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomNavScreen,
    currentDestination: NavDestination?,
    navController: NavController
) {
   val selected = currentDestination?.hierarchy?.any{ it.route == screen.route} == true;
    val contentColor = if(selected) Color.White else Color.Gray;
    val background = if(selected) Purple200.copy(alpha = 0.3f) else Color.Transparent;
    Box(
        modifier = Modifier
            .height(40.dp)
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = {
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.findStartDestination().id)
                    launchSingleTop = true;
                }
            })
    ){
        Row(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment =  Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(painter = painterResource(id = if(selected) screen.icon else screen.icon ), contentDescription = "icon", tint = contentColor)
            AnimatedVisibility(visible = selected) {
                Text(text = screen.title, color = contentColor)
            }
        }
    }
}

@Preview
@Composable
fun BottomNavigationPreview() {
    //AppBottomNavigation()
}