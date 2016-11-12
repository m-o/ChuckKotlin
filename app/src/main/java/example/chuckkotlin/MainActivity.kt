package example.chuckkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.os.StrictMode



class MainActivity : AppCompatActivity() {

    var jokeManager = JokesManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is not a good idea - rewrite when I know how to deal with retrofit async in Kotlin
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        getJokeButton.setOnClickListener {
            var joke = jokeManager.getRandomJoke()
            quote.text = joke.value.joke
        }

    }

}
