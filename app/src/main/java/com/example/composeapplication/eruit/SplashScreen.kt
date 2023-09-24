
import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.composeapplication.R

@Composable
fun SplashScreen(navigation:NavController) {
    val handler = Handler()
    handler.postDelayed(Runnable { // Do something after 5s = 5000ms
        navigation.navigate("login")
    }, 5000)
    Column {
        Image(
            painterResource(R.drawable.splash),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}