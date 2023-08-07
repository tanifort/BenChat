package com.example.benchat.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserInfoOverview(
    modifier: Modifier = Modifier,
    InfoIcon: @Composable()()-> Unit = {},
    InfoText: String,
    onClick: () -> Unit
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .height(50.dp)
        .padding(top = 2.dp, bottom = 2.dp, start = 10.dp, end = 10.dp)
        .border(BorderStroke(0.7.dp, SolidColor(Color.LightGray))).clip(RoundedCornerShape(1.dp)) ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth(0.33F)
                .padding(start = 10.dp)
        ) {
            InfoIcon()
            Text(text = InfoText)
        }
        Icon(
            Icons.Default.ArrowForwardIos, modifier = Modifier
                .padding(end = 10.dp)
                .size(15.dp)
                .clickable { onClick() },
            contentDescription = "arrow forward",
        )
    }
}

@Preview
@Composable
fun PreviewUserInfoOverview() {
 UserInfoOverview(
     InfoText = "Telmo",
         InfoIcon = {
             Icon(
                 Icons.Default.AttachFile,
                 contentDescription = "Add document"
             )
     },
     onClick = { println("hello") },
     modifier = Modifier
 )
}