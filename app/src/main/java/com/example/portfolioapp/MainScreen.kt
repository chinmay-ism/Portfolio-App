package com.example.portfolioapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    val navItemList = listOf(
        NavItem("About Me", Icons.Outlined.Person, Icons.Filled.Person),
        NavItem("Projects", Icons.Outlined.Home, Icons.Filled.Home),
        NavItem("Contact", Icons.Outlined.Home, Icons.Filled.Home),
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = {
                            Icon(
                                imageVector = if (selectedIndex == index) navItem.selectedIcon else navItem.icon,
                                contentDescription = navItem.label
                            )
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        when (selectedIndex) {
            0 -> AboutScreen(modifier = Modifier.padding(innerPadding))
            1 -> ProjectScreen(modifier = Modifier.padding(innerPadding))
            2 -> ContactScreen(modifier = Modifier.padding(innerPadding))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
