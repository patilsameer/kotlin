// Example 2: Multiple concurrent operations

import kotlinx.coroutines.*
import java.util.concurrent.CompletableFuture


uspend fun fetchData(): String {
    delay(1000)
    return "Data loaded"
}
suspend fun main() {
    coroutineScope {
        val deferred1 = async { fetchData() }
        val deferred2 = async { fetchData() }

        val results = awaitAll(deferred1, deferred2)
        println(results)
    }
}
