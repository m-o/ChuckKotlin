package example.chuckkotlin

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by marek on 12/11/2016.
 */
class RestApi() {
    private val redditApi: ChuckApi
    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://api.icndb.com/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        redditApi = retrofit.create(ChuckApi::class.java)
    }

    fun getRandomJoke(): Call<JokeResponse> {
        return redditApi.getRandomJoke()
    }
}
