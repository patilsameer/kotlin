/*here we will see how to use join and cancel functions of coroutine,
join is used to wait for a coroutine to complete before proceeding with the next line of code.
cancel is used to stop a coroutine before it completes its execution.
In this code, we launch a coroutine that simulates a long-running task by using delay(5000). 
The main function continues to execute and prints "in main".
comment out the job.join() line to see the effect of canceling the coroutine before it finishes.
When job.join() is called, the main function will wait for the launched coroutine to complete before printing "job is cancelled". 
If you comment out job.join() and uncomment job.cancel(), the main function will 
cancel the coroutine immediately after launching it, and "job is cancelled" will be printed
 */

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//import kotlinx.coroutines.*
//import kotlin.coroutines.*


fun main()=runBlocking{
    println("the program begins")
    var job=launch{
        println("launch function coroutine")
        delay(5000)
        println("launch function finished")
    }

    println("in main")
    job.join()
    //job.cancel()
    println("job is cancelled")
}