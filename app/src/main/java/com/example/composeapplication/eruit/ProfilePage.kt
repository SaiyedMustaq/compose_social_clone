
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.addSpacer
import com.example.composeapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(name = "ProfilePage", showSystemUi = true)
@Composable
fun ProfilePage() {
    val mainButtonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.primaryColor)
    )

    Scaffold{ paddingValues ->
       Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
           modifier =
           Modifier
               .padding(paddingValues)
               .fillMaxWidth()
               .fillMaxHeight()

    ) {
        Image(
            modifier = Modifier
                .size(height = 80.dp, width = 100.dp),
            painter = painterResource(R.drawable.order_image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(text = "Mustaq")
        Text(text = "mustaq.saiyed@zobiwebsolutions.com")
        Button(
            colors = mainButtonColor,
            shape = RoundedCornerShape(12.dp),

            onClick = {
            }, modifier = Modifier
                .height(80.dp)
                .width(200.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 20.dp)
        ) {
            Text(text = "Edit Profile", color = colorResource(R.color.white))
        }
        Text("User Content")
           TextField(value = "Hello", onValueChange = {},
           modifier = Modifier
               .fillMaxWidth()
               .padding(vertical = 10.dp)
               .background(colorResource(id = R.color.white)))
           addSpacer(hSpace = 10)
           TextField(value = "Hello", onValueChange = {},
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 10.dp)
                   .background(colorResource(id = R.color.white)))
           addSpacer(hSpace = 10)
           TextField(value = "Hello", onValueChange = {},
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 10.dp)
                   .background(colorResource(id = R.color.white)))
           addSpacer(hSpace = 10)
       }
    }

}