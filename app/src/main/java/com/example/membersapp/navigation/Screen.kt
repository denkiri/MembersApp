package com.example.membersapp.navigation

sealed class Screen(val route: String) {
//    object Splash : Screen("splash_screen")
    object Welcome : Screen("welcome_screen")
    object Home : Screen("home_screen")
    object Details : Screen("details_screen/{receiptId}") {
        fun passReceiptId(receiptId: Int): String {
            return "details_screen/$receiptId"
        }
    }

    object Search : Screen("search_screen")
}
