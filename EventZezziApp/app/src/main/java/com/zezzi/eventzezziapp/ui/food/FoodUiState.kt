package com.zezzi.eventzezziapp.ui.food

import com.zezzi.eventzezziapp.data.networking.response.FoodResponse

data class FoodUiState (
    val food: List<FoodResponse>,
    val loading: Boolean = false
)