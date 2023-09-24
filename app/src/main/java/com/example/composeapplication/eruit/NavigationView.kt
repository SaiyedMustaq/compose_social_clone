import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationView(controller: NavHostController){
    NavHost(navController = controller, startDestination = "splash",){
        composable("splash"){
            SplashScreen(controller)
        }
        composable("login"){
            LoginScreen(controller)
        }

    }

}