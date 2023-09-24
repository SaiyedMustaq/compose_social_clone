import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R

@Composable
fun CallType(isVideo: Boolean) {
    if (isVideo)
    {
        Image(
            painter = painterResource(R.drawable.video_call),
            contentDescription = "Person Icon",
            modifier = Modifier
                .size(20.dp)
        )
    }
    else {
        Image(
            painter = painterResource(R.drawable.phone_call),
            contentDescription = "Person Icon",
            modifier = Modifier
                .size(20.dp)
        )
    }
}