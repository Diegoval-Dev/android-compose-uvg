package com.zezzi.eventzezziapp.navigation

sealed class NavigationState(val route: String) {
    object Categories: NavigationState("Categories")
    object RecipesScreen: NavigationState("RecipesScreen")
}