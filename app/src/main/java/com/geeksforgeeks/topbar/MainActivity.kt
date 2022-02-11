package com.geeksforgeeks.topbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.geeksforgeeks.topbar.ui.theme.TopBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetScaffold()
        }
    }
}

@Composable
fun GetScaffold(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "GFG | TopBarImplementation",
                color = Color.White)},
            backgroundColor = Color(0xff0f9d58)) },
        content = { MainContent()}
    )
}

@Composable
fun MainContent(){
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        Text(text = "Hello Geek!")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GetScaffold()
}