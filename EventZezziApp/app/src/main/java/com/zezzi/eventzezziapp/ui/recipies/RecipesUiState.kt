package com.zezzi.eventzezziapp.ui.recipies

import com.zezzi.eventzezziapp.data.networking.response.RecipeResponse
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse

data class RecipesUiState(
    val recipes: List<RecipeResponse>,
    val loading: Boolean = false
)