package example.chuckkotlin

/**
 * Created by marek on 12/11/2016.
 */
import retrofit2.Call
import retrofit2.http.GET

interface ChuckApi{

    @GET("/jokes/random")
    fun getRandomJoke(): Call<JokeResponse>
}
