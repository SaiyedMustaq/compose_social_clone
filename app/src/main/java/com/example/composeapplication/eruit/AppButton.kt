package com.example.composeapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R


@Composable
fun PrimaryButton(
    text:String,
    bHeight:Int=60,
    mainButtonColor: ButtonColors,
    sP:Int=20,
    eP:Int=20,
    tP:Int=20,
    bP:Int=20,
    corner:Int=12,
    onPress: (Int) -> Unit
) {
    Button(
        colors = mainButtonColor,
        shape = RoundedCornerShape(corner.dp),
        onClick = {
            onPress
        }, modifier = Modifier
            .fillMaxWidth()
            .height(bHeight.dp)
            .padding(start = sP.dp, end = eP.dp, top = tP.dp, bottom = bP.dp)) {
        Text(text = text, color = colorResource(R.color.white))
    }
}

@Composable
fun addSpacer(vSpace: Int=0,hSpace:Int=0){
    Spacer(modifier = Modifier
        .height(vSpace.dp)
        .width(hSpace.dp)
    )
}

@Preview(name = "PrimaryButton")
@Composable
fun buttonPreview(){
    val mainButtonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id =R.color.primaryColor),
        contentColor = MaterialTheme.colorScheme.surface
    )
    PrimaryButton(text = "Login", mainButtonColor = mainButtonColor, onPress = {}, bHeight = 100)
}