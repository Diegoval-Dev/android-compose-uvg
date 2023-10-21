package com.zezzi.eventzezziapp.data.networking

import android.util.Log
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RecipeWebService {

    private val api: RecipeAPI

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(RecipeAPI::class.java)
    }

    suspend fun getRecipes(category: String): RecipesResponse {
        Log.d("MEALS", "ID: $category")
        val response = api.getRecipes(category)
        Log.d("MealsCategoriesViewModel", "ResponeWEEEEEEBSEEEERVICE: $response")
        return response
    }
}