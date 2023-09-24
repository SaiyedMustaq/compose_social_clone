

import android.content.res.Resources.Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeapp.PrimaryButton
import com.example.composeapp.addSpacer
import com.example.composeapplication.R


@Composable
fun LoginScreen(navController: NavController) {
    val mainButtonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.primaryColor)
    )
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Image(
            painterResource(R.drawable.us),
            contentDescription = "",
            modifier = Modifier
                .size(50.dp)
                .align(alignment = Alignment.End)
                .padding(top = 20.dp, end = 20.dp)
        )
        Image(
            painterResource(R.drawable.small_logo),
            contentDescription = "",
            modifier = Modifier
                .size(110.dp)
                .padding(start = 30.dp)
        )
        addSpacer(vSpace = 30)
        Row(
            modifier = Modifier
                .padding(start = 20.dp)
        ) {
            Text(text = "Welcome to", color = Color.Black, fontSize = 35.sp)
            Text(text = "Eruit", color = colorResource(id = R.color.primaryColor), fontSize = 35.sp)
        }
        Text(text = "Login", fontSize = 35.sp, modifier = Modifier
            .padding(start = 25.0.dp))
        addSpacer(vSpace = 30)
        SimpleEditText(hint = "Firm name")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "User name")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "Password", isPasswordField = true)
        addSpacer(vSpace = 20)
        PrimaryButton(
            "Login",
            mainButtonColor = mainButtonColor, onPress = {
            println("PRESS")
        }, bHeight = 100)
        addSpacer(vSpace = 20)
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "SignUp", color = colorResource(id = R.color.primaryColor),textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        println("SIGN UP")
                    })
            Text(text = "Forgot Password",textDecoration = TextDecoration.Underline, modifier=
            Modifier
                .clickable {  println("Forgot Password")})
        }

    }
}

@Preview(
    showBackground = true,
    name = "loginScreen",
    showSystemUi = true,
    uiMode =0,
)
@Composable()
fun loginPreview(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
       // LoginScreen(navController = NavController)
    }
}