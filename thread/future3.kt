
// Example 3: Using CompletableFuture (Java interop)

import kotlinx.coroutines.*
import java.util.concurrent.CompletableFuture

suspend fun fetchData(): String {
    delay(1000)
    return "Data loaded"
}
fun example3() {
    val future = CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result"
    }

    val result = future.get()
    println(result)
}