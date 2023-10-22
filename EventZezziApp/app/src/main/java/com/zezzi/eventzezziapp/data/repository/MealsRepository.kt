package com.zezzi.eventzezziapp.data.repository
import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.FoodResponse
import com.zezzi.eventzezziapp.data.networking.response.FoodResponseComplete
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return withContext(Dispatchers.IO) {
            webService.getMeals()
        }
    }
    suspend fun getRecipes(category: String): RecipesResponse {
        return withContext(Dispatchers.IO){
            webService.getRecipes(category)
        }
    }
    suspend fun getFood(name: String): FoodResponseComplete {
        return withContext(Dispatchers.IO){
            webService.getFood(name)
        }
    }

}