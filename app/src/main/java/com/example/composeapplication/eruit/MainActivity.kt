import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChipDefaults.Height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.composeapplication.ui.theme.ComposeApplicationTheme
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.balltrajectory.Parabolic
import com.exyte.animatednavbar.animation.balltrajectory.Straight
import com.exyte.animatednavbar.animation.balltrajectory.Teleport
import com.exyte.animatednavbar.animation.indendshape.Height
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController= rememberNavController()
            ComposeApplicationTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    NavigationView(navController)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeApplicationTheme {
      //LoginScreen()
    }
}

enum class NavigationBarItems(val icon: ImageVector){
    Person(icon = Icons.Default.Person),
    Call(icon = Icons.Default.Call),
    Settings(icon = Icons.Default.Settings)
}

fun Modifier.noRippleClickable (onClick:()->Unit):Modifier=composed{
    clickable(indication = null,
        interactionSource = remember {
        MutableInteractionSource()
    }) {
        onClick()
    }
}

@Composable
fun CustomBottomNavParabolic(){
    var selectedIndex by remember { mutableStateOf(value = 0) }
    val navigationBarItems= remember {NavigationBarItems.values()}
    Scaffold(modifier = Modifier.padding(all=12.dp),
        bottomBar = {
            AnimatedNavigationBar(
                selectedIndex = selectedIndex,
                modifier = Modifier.height(64.dp),
                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
                ballAnimation = Parabolic(tween(300)),
                indentAnimation = Height(tween(300)),
                ballColor = MaterialTheme.colors.primary,
                barColor = MaterialTheme.colors.primary,
            ) {
                navigationBarItems.forEach { items->
                    Box(
                      modifier = Modifier
                          .fillMaxSize()
                          .noRippleClickable { selectedIndex = items.ordinal },
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            modifier = Modifier.size(26.dp),
                            imageVector = items.icon,
                            contentDescription = "",
                            tint = if(selectedIndex==items.ordinal)
                                Color.White
                            else
                                Color.Gray
                        )
                    }
                }
            }
        }
    ){padding->

    }

}
@SuppressLint("RememberReturnType", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterial3Api
@Composable
fun CustomBottomNavTeleport(){
    var selectedIndex by remember { mutableStateOf(value = 0) }
    val navigationBarItems= remember {NavigationBarItems.values()}
    Scaffold(modifier = Modifier.padding(all=12.dp),
        bottomBar = {
            AnimatedNavigationBar(
                selectedIndex = selectedIndex,
                modifier = Modifier.height(64.dp),
                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
                ballAnimation = Teleport(tween(300)),
                indentAnimation = Height(tween(300)),
                ballColor = MaterialTheme.colors.primary,
                barColor = MaterialTheme.colors.primary,
            ) {
                navigationBarItems.forEach { items->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .noRippleClickable { selectedIndex = items.ordinal },
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            modifier = Modifier.size(26.dp),
                            imageVector = items.icon,
                            contentDescription = "",
                            tint = if(selectedIndex==items.ordinal)
                                Color.White
                                    else
                                Color.Gray
                        )
                    }
                }
            }
        }
    ){padding->

    }

}

@SuppressLint("RememberReturnType", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterial3Api
@Composable
fun CustomBottomNavStraight(){
    var selectedIndex by remember { mutableStateOf(value = 0) }
    val navigationBarItems= remember {NavigationBarItems.values()}
    Scaffold(modifier = Modifier.padding(all=12.dp),
        bottomBar = {
            AnimatedNavigationBar(
                selectedIndex = selectedIndex,
                modifier = Modifier.height(64.dp),
                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
                ballAnimation = Straight(tween(300)),
                indentAnimation = Height(tween(300)),
                ballColor = MaterialTheme.colors.primary,
                barColor = MaterialTheme.colors.primary,
            ) {
                navigationBarItems.forEach { items->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .noRippleClickable { selectedIndex = items.ordinal },
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            modifier = Modifier.size(26.dp),
                            imageVector = items.icon,
                            contentDescription = "",
                            tint = if(selectedIndex==items.ordinal)
                                Color.White
                            else
                                Color.Gray
                        )
                    }
                }
            }
        }
    ){padding->

    }

}


