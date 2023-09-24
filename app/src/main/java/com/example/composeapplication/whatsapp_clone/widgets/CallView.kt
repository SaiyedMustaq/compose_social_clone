import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.addSpacer
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.widgets.IncommingType
import com.example.composeapplication.whatsapp_clone.widgets.StatusSubTitle
import com.example.composeapplication.whatsapp_clone.widgets.StatusTitle


@Preview(name = "CallVIew")
@Composable
fun CallView(){
    userList.forEach {user->
        Row(modifier = Modifier
            .padding(10.dp,10.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            addSpacer(0,8)
            Box {
                Image(painter = painterResource(R.drawable.image), contentDescription = "Artist image",
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, Color.Transparent, CircleShape))
            }
            addSpacer(0,15)
            Column {
                StatusTitle(user.name)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                ) {
                    IncommingType(user.cllType)
                    StatusSubTitle("Today 8:45 AM")
                }
            }
            Spacer(Modifier.weight(1f))
            CallType(user.cllType)
            addSpacer(0,8)
        }
    }
}