import com.zezzi.eventzezziapp.data.networking.MealsApi
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


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
}