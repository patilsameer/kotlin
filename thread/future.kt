import kotlinx.coroutines.*
import java.util.concurrent.CompletableFuture

// Example 1: Using async/await
suspend fun fetchData(): String {
    delay(1000)
    return "Data loaded"
}

suspend fun main() {
    // Create a future-like task
    val future = GlobalScope.async {
        fetchData()
    }

    // Wait for result
    val result = future.await()
    println(result)
}

