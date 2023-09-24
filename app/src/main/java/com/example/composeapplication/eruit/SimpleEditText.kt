import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R


@Composable
fun SimpleEditText(label:String="",hint:String,isPasswordField:Boolean=false){
    var text by remember { mutableStateOf("") }
    var observeText by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 20.dp,
                vertical = 8.dp
            ),
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            maxLines = 1,
            singleLine = true,
            placeholder = { Text(text = hint) },
            colors = TextFieldDefaults.textFieldColors(
                disabledTextColor = colorResource(R.color.white),
                focusedIndicatorColor = colorResource(R.color.white),
                unfocusedIndicatorColor = colorResource(R.color.white),
                disabledIndicatorColor = colorResource(R.color.white),
            ),
            visualTransformation = VisualTransformation.None,
            trailingIcon ={
                if (isPasswordField)
                    IconButton(onClick = {  }) {
                        if(observeText)
                        Image(
                            painterResource( R.drawable.show_password),
                            contentDescription = "Clear",
                            modifier = Modifier
                                .size(20.dp)
                        )else
                            Image(
                                painterResource( R.drawable.hide_password),
                                contentDescription = "Clear",
                                modifier = Modifier
                                    .size(20.dp)
                            )
                    }
        } ,
            modifier = Modifier
                .height(55.dp)
                .fillMaxWidth()
                .border(width = 0.1.dp, color = colorResource(R.color.black ), shape = RoundedCornerShape(5.dp))

        )
    }

}

@Composable
@Preview(name = "AppField")
fun AppField(){
    SimpleEditText(hint = "HELLO")
}