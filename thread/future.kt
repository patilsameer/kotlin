import kotlinx.coroutines.*

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

// Example 2: Multiple concurrent operations
suspend fun example2() {
    coroutineScope {
        val deferred1 = async { fetchData() }
        val deferred2 = async { fetchData() }
        
        val results = awaitAll(deferred1, deferred2)
        println(results)
    }
}

// Example 3: Using CompletableFuture (Java interop)
fun example3() {
    val future = CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result"
    }
    
    val result = future.get()
    println(result)
}