
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.composeapplication.whatsapp_clone.model.UserChat
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.CallScreen
import com.example.composeapplication.whatsapp_clone.ChatScreen
import com.example.composeapplication.whatsapp_clone.StatusScreen
import com.example.composeapplication.whatsapp_clone.model.CallModel
import com.example.composeapplication.whatsapp_clone.scaled.TabItem
import com.example.composeapplication.whatsapp_clone.widgets.WhatsAppAppBar
import com.example.composeapplication.whatsapp_clone.widgets.WhatsAppTile
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

val userList= listOf(
    CallModel(0,"User1",false,),
    CallModel(1,"User2",true,),
    CallModel(2,"User3",false,),
    CallModel(3,"User4",true,),
    CallModel(4,"User5",false,),
    CallModel(5,"User6",true,),
    CallModel(6,"User7",false,),
    CallModel(7,"User8",false,),
    CallModel(8,"User9",true,)
    )
val userChatList= listOf(
    UserChat(0,"","User1","Hi", unreadMessage = 2,"01:00 am"),
    UserChat(1,"","User2","Where are you ", unreadMessage = 1,"01:20 am"),
    UserChat(2,"","User3","Can you come today", unreadMessage = 3,"11:00 am"),
    UserChat(3,"","User4","Hello", unreadMessage = 0,"12:00 am"),
    UserChat(4,"","User5","So much", unreadMessage = 2,"09:00 pm"),
    UserChat(5,"","User6","No one care", unreadMessage = 2,"05:00 am"),
    UserChat(6,"","User7","Yes i come", unreadMessage = 1,"02:00 pm"),
    UserChat(7,"","User8","Are you sure", unreadMessage = 8,"06:00 pm"),
    UserChat(8,"","User9","No", unreadMessage = 2,"12:00 am"),
    UserChat(9,"","User10","Send him", unreadMessage = 2,"01:00 am"),
    UserChat(10,"","User11","Send him", unreadMessage = 0,"01:00 am"),
    UserChat(11,"","User12","Send him", unreadMessage = 5,"01:00 am"),
    UserChat(12,"","User13","Send him", unreadMessage = 3,"01:00 am"),
)

@Preview(name = "WhatsAppMainPreview", showSystemUi = true)
@Composable
fun WhatsAppMainPReview(){
    WhatsAppMain()
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)
@Composable
fun WhatsAppMain(){
    val tabs = listOf(TabItem.Chat, TabItem.Status, TabItem.Call)
    val pagerState = rememberPagerState()
    Scaffold(topBar = { WhatsAppAppBar()}
    ){ padding->
        Column(modifier = Modifier.padding(padding)) {
            Tabs(tabs = tabs, pagerState = pagerState)
            TabsContent(tabs = tabs, pagerState = pagerState)
        }
    }
}

//
//@Composable
//fun ScrollableTabRow(
//    selectedTabIndex: Int,
//    modifier: Modifier = Modifier,
//    backgroundColor: Color = MaterialTheme.colors.primarySurface,
//    contentColor: Color = contentColorFor(backgroundColor),
//    edgePadding: Dp = TabRowDefaults.ScrollableTabRowPadding,
//    indicator: @Composable @UiComposable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
//        TabRowDefaults.Indicator(
//            Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex])
//        )
//    },
//    divider: @Composable @UiComposable () -> Unit = @Composable {
//        TabRowDefaults.Divider()
//    },
//    tabs: @Composable @UiComposable () -> Unit
//){
//
//}
//
//@Preview(name = "TabBarScreen", showSystemUi = true)
//@Composable
//fun TabScreen() {
//    var tabIndex by remember { mutableStateOf(0) }
//    val tabs = listOf("Home", "About", "Settings")
//    Column(modifier = Modifier.fillMaxWidth()) {
//        ScrollableTabRow(selectedTabIndex = tabIndex) {
//            tabs.forEachIndexed { index, title ->
//                Tab(text = { Text(title) },
//                    selected = tabIndex == index,
//                    onClick = { tabIndex = index },
//                    icon = {
//                        when (index) {
//                            0 -> Icon(imageVector = Icons.Default.Home, contentDescription = null)
//                            1 -> Icon(imageVector = Icons.Default.Info, contentDescription = null)
//                            2 -> Icon(imageVector = Icons.Default.Settings, contentDescription = null)
//                        }
//                    }
//                )
//            }
//        }
//        when (tabIndex) {
//            0 ->  ChatScreen()
//            1 ->  StatusScreen()
//            2 ->  CallScreen()
//        }
//    }
//}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsContent(tabs: List<TabItem>, pagerState: PagerState) {
    HorizontalPager(state = pagerState, count = tabs.size) { page ->
        tabs[page].screen()
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun TabsContentPreview() {
    val tabs = listOf(
        TabItem.Chat,
        TabItem.Status,
        TabItem.Call
    )
    val pagerState = rememberPagerState()
    TabsContent(tabs = tabs, pagerState = pagerState)
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs: List<TabItem>, pagerState: PagerState) {
    val scope = rememberCoroutineScope()
    // OR ScrollableTabRow()
    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = colorResource(id = R.color.teal_Dark_Green),
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )
        }) {
        tabs.forEachIndexed { index, tab ->
            // OR Tab()
            Tab(
                text = { Text(tab.title) },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun TabsPreview() {
    val tabs = listOf(
        TabItem.Chat,
        TabItem.Status,
        TabItem.Call
    )
    val pagerState = rememberPagerState()
    Tabs(tabs = tabs, pagerState = pagerState)
}




