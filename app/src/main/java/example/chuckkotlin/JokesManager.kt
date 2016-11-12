package example.chuckkotlin

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

/**
 * Created by marek on 12/11/2016.
 */
class JokesManager(private val api: RestApi = RestApi()) {

    fun getRandomJoke(): JokeResponse {
        return api.getRandomJoke().execute().body()
    }

}