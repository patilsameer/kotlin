/*introducing coroutines
Coroutines are a powerful feature in Kotlin that allow you to write asynchronous, 
non-blocking code in a sequential manner. 
They are lightweight threads that can be suspended and resumed without 
blocking the underlying thread. 
This makes them ideal for tasks that involve waiting, 
such as network requests or long-running computations.

the code below demonstrates a simple example of using coroutines in Kotlin.
In this example, we use the runBlocking function to create a coroutine scope.
Inside the coroutine, we print "Start", then call delay(500) to suspend the coroutine for 500 milliseconds, and finally print "End". 
The delay function is a suspending function
that simulates a non-blocking delay, allowing other coroutines to run while waiting. 
When you run this code, you will see "Start" printed immediately, followed by 
"End" after a short delay.
*/

import kotlinx.coroutines.*

fun main() =runBlocking {
    println("Start")
    delay(500)
    println("End")
}
