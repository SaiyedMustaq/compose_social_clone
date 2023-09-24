package com.example.composeapplication.postOfficeApp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Colors
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Shapes
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.ui.theme.whiteColor

@Composable
fun PostTextField(labelValue:String,leadingIcon:ImageVector){
    val textValue= remember {
        mutableStateOf("")
    }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.small)
            .background(whiteColor)
            .border(width = 1.dp, color = Color.Transparent, componentShapes.small),
        value = textValue.value, onValueChange ={ textValue.value=it },
        label = {
            Text(text = labelValue)
        },
        keyboardActions = KeyboardActions.Default, leadingIcon = {
            Icon(imageVector = leadingIcon, contentDescription = "")
        }
    )
}


@Composable
@Preview(name = "PostTextField", showSystemUi = false)
fun PreviewPostTextField(){
    Surface {
        PostTextField("Hello",Icons.Default.Person)
    }
}

var componentShapes= Shapes(
    small= RoundedCornerShape(4.dp),
    medium= RoundedCornerShape(4.dp),
    large= RoundedCornerShape(4.dp)
)