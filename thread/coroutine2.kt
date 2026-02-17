/**
 * Observe the behavior of first two lanunches, they will execute 
 * without any delay and print their finished message immediately after starting.
 * The last two launches will have a delay before printing their finished message, 
 * demonstrating the non-blocking behavior of coroutines.
 * The main function will print "Main: Both tasks launched!" immediately after launching the coroutines, 
 * showing that the main thread is not blocked and continues its execution while the coroutines are   
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        println("Task 1: Starting")
        // No delay here
        println("Task 1: Finished instantly")
    }

    launch {
        println("Task 2: Starting")
        //no delay here
        println("Task 2: Finished instantly")
    }

    launch {
        println("Task 1: Starting")
        delay(1000)
        println("Task 1: Finished instantly")
    }

    launch {
        println("Task 2: Starting")
        delay(500)
        println("Task 2: Finished instantly")
    }
   

    println("Main: Both tasks launched!")
}