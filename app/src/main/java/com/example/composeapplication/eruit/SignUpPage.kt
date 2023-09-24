import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.PrimaryButton
import com.example.composeapp.addSpacer
import com.example.composeapplication.R


@Preview(name = "signup")
@Composable
fun SignUpPreview(){
    SignUpPage()
}
@Composable
fun SignUpPage(){
    val scrollState = rememberScrollState()
//    var offset by remember {
//        mutableStateOf(0f)
//    }
    val mainButtonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.primaryColor)
    )
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.white))
            .verticalScroll(rememberScrollState())
//            .scrollable(orientation = Orientation.Vertical,
//                state = rememberScrollableState { delta ->
//                   /// offset = offset + delta
//                    delta
//                })
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
        Text(text = "Registration", fontSize = 35.sp, modifier = Modifier
            .padding(start = 25.0.dp))
        addSpacer(vSpace = 10)
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {
            Text(text = "Already have an account?", color = colorResource(id = R.color.black),)
            addSpacer(hSpace = 10)
            Text(text = "Sign In",color = colorResource(id = R.color.primaryColor),textDecoration = TextDecoration.Underline, modifier=
            Modifier
                .clickable {  println("Forgot Password")})
        }
        addSpacer(vSpace = 20)
        SimpleEditText(hint = "Firm name")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "First name")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "User name")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "Email")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "Phone number")
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "Password", isPasswordField = true)
        addSpacer(vSpace = 10)
        SimpleEditText(hint = "Confirm Password", isPasswordField = true)
        addSpacer(vSpace = 20)
        PrimaryButton(
            "Register",
            mainButtonColor = mainButtonColor, onPress = {
                println("PRESS")
            }, bHeight = 100)
        addSpacer(vSpace = 20)

    }
}
