package example.chuckkotlin

/**
 * Created by marek on 12/11/2016.
 */

data class Joke (var id: Integer, var joke: String)
data class JokeResponse(var type: String, var value: Joke)

