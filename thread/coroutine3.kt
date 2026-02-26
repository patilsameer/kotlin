/*please read and understand the coroutine2.kt file before looking at this code,
 as this code is a continuation of that file.*/
import kotlinx.coroutines.*


suspend fun mydata() {
    println("I m inside coroutine")
    println("I will wait for 2 seconds")
    // delay is a non-blocking pause
   // delay(2000)
    println("routine is ending here")
}

fun main() = runBlocking {
    // launch starts a new coroutine without blocking the main thread
    launch {
        mydata()
        println("my data is paused ")
    }

    println("This is main")
}