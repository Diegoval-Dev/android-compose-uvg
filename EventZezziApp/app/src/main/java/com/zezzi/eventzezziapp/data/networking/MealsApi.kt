package com.zezzi.eventzezziapp.data.networking

import com.zezzi.eventzezziapp.data.networking.response.FoodResponse
import com.zezzi.eventzezziapp.data.networking.response.FoodResponseComplete
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {
    @GET("categories.php")
    suspend fun getMeals(): MealsCategoriesResponse
    @GET("filter.php")
    suspend fun getRecipes(@Query("c") category: String): RecipesResponse
    @GET("search.php")
    suspend fun getFood(@Query("s") name: String): FoodResponseComplete
}