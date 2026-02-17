

/*parallel function takes two integers and a callback function as parameters.
the callback function is returning an integer and takes two integers as input.
the parallel function creates a new thread that sleeps for 1 second, 
then calls the callback function with the provided input values and prints the result.
the main function demonstrates how to use the parallel function
with both named functions (add, sub, div) and a lambda expression
lambda expression is used to multiply the two numbers, and it is passed directly as 
an argument to the parallel function.
the main function also prints a message immediately after calling the parallel function, 
showing that the calls to   parallel are non-blocking and the main thread 
continues its execution without waiting 
for the results from the parallel function.
*/
fun parallel(input1:Int,input2:Int,callback:(Int,Int)->Int){
    Thread{
        Thread.sleep(1000)
        val result=callback(input1,input2)
        println("Result: $result")
    }.start()

}


fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}
fun div(a: Int, b: Int): Int {
    return a / b
}


fun main() {
    parallel(10, 5, ::add) // Using a named function as a callback
    parallel(10, 5, ::sub) // Using a named function as a callback
    parallel(10, 5, ::div) // Using a named function as a callback

    // Using a lambda expression as a callback
    parallel(10, 5) { x, y -> x * y } // This will multiply the two numbers

    println("non blocking calls to parallel, main continue its execution")
}