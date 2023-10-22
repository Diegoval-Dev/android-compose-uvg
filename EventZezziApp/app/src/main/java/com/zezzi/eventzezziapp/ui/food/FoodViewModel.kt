package com.zezzi.eventzezziapp.ui.food

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import com.zezzi.eventzezziapp.ui.meals.view.MealsCategoryUiState
import kotlinx.coroutines.launch

class FoodViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel()  {
    var foodUiState by mutableStateOf(FoodUiState(emptyList()))
        private set
    fun getFood(name: String){
        foodUiState = FoodUiState(food = emptyList(),loading = true)
        viewModelScope.launch{
            val response = repository.getFood(name)
            Log.d("A","REEEEEEEEEEEEEEEEEEEEEEEEE $response")
            foodUiState = FoodUiState(
                food = repository.getFood(name).foodInstruction
            )
        }
    }




}