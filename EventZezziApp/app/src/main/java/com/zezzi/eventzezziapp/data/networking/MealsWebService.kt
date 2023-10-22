package com.zezzi.eventzezziapp.data.networking

import android.util.Log
import com.zezzi.eventzezziapp.data.networking.response.FoodResponse
import com.zezzi.eventzezziapp.data.networking.response.FoodResponseComplete
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import com.zezzi.eventzezziapp.data.networking.response.RecipesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MealsWebService {

    private val api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(MealsApi::class.java)
    }
    suspend fun getMeals(): MealsCategoriesResponse {
        return api.getMeals()
    }
    suspend fun getRecipes(category: String): RecipesResponse {
        return api.getRecipes(category)
    }

    suspend fun getFood(name: String): FoodResponseComplete {
        val response = api.getFood(name)
        Log.d("A", "RESPONSEWENSERVOCEEEEEEEEEEEEEEEEEEE: $response")
        return api.getFood(name)
    }
}