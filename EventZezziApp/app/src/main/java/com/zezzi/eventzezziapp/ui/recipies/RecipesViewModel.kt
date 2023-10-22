package com.zezzi.eventzezziapp.ui.recipies

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch

class RecipesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    var recipesUiState by mutableStateOf(RecipesUiState(emptyList()))
        private set

    fun getRecipes(category: String) {
        recipesUiState = RecipesUiState(emptyList(), loading = true)
        viewModelScope.launch {
            recipesUiState = RecipesUiState(
                recipes = repository.getRecipes(category).recipes
            )
        }
    }
}