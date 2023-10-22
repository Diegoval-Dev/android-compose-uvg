package com.zezzi.eventzezziapp.data.networking.response

import com.google.gson.annotations.SerializedName

data class FoodResponseComplete(@SerializedName("meals") val foodInstruction: List<FoodResponse>)


data class FoodResponse(
    @SerializedName("idMeal") val id: String,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strInstructions") val instrucciones: String?,
    @SerializedName("strMealThumb") val imagenUrl: String?,
    @SerializedName("strYoutube") val video: String?,


    @SerializedName("strIngredient1") val ingrediente1: String?,
    @SerializedName("strIngredient2") val ingrediente2: String?,
    @SerializedName("strIngredient3") val ingrediente3: String?,
    @SerializedName("strIngredient4") val ingrediente4: String?,
    @SerializedName("strIngredient5") val ingrediente5: String?,
    @SerializedName("strIngredient6") val ingrediente6: String?,
    @SerializedName("strIngredient7") val ingrediente7: String?,
    @SerializedName("strIngredient8") val ingrediente8: String?,
    @SerializedName("strIngredient9") val ingrediente9: String?,
    @SerializedName("strIngredient10") val ingrediente10: String?,
    @SerializedName("strIngredient11") val ingrediente11: String?,
    @SerializedName("strIngredient12") val ingrediente12: String?,
    @SerializedName("strIngredient13") val ingrediente13: String?,
    @SerializedName("strIngredient14") val ingrediente14: String?,
    @SerializedName("strIngredient15") val ingrediente15: String?,
    @SerializedName("strIngredient16") val ingrediente16: String?,
    @SerializedName("strIngredient17") val ingrediente17: String?,
    @SerializedName("strIngredient18") val ingrediente18: String?,
    @SerializedName("strIngredient19") val ingrediente19: String?,
    @SerializedName("strIngredient20") val ingrediente20: String?,

    @SerializedName("strMeasure1") val medida1: String?,
    @SerializedName("strMeasure2") val medida2: String?,
    @SerializedName("strMeasure3") val medida3: String?,
    @SerializedName("strMeasure4") val medida4: String?,
    @SerializedName("strMeasure5") val medida5: String?,
    @SerializedName("strMeasure6") val medida6: String?,
    @SerializedName("strMeasure7") val medida7: String?,
    @SerializedName("strMeasure8") val medida8: String?,
    @SerializedName("strMeasure9") val medida9: String?,
    @SerializedName("strMeasure10") val medida10: String?,
    @SerializedName("strMeasure11") val medida11: String?,
    @SerializedName("strMeasure12") val medida12: String?,
    @SerializedName("strMeasure13") val medida13: String?,
    @SerializedName("strMeasure14") val medida14: String?,
    @SerializedName("strMeasure15") val medida15: String?,
    @SerializedName("strMeasure16") val medida16: String?,
    @SerializedName("strMeasure17") val medida17: String?,
    @SerializedName("strMeasure18") val medida18: String?,
    @SerializedName("strMeasure19") val medida19: String?,
    @SerializedName("strMeasure20") val medida20: String?,


    )