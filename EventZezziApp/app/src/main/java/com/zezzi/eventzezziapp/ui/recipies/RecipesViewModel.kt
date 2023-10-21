package com.zezzi.eventzezziapp.ui.recipies

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse
import com.zezzi.eventzezziapp.data.repository.RecipeRepository
import kotlinx.coroutines.launch
import android.util.Log
class RecipesViewModel(private val repository: RecipeRepository = RecipeRepository()): ViewModel() {
    var recipesUiState by mutableStateOf(RecipesUiState(emptyList()))
        private set

    fun getRecipes(category: String) {
        recipesUiState = RecipesUiState(emptyList(), loading = true)
        viewModelScope.launch {
            val recipesResponse = repository.getRecipes(category)
            recipesUiState = RecipesUiState(
                recipes = repository.getRecipes(category).categories
            )
        }
    }
}