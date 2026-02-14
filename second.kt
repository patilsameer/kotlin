/**
 * the code demonstrates the use of if as an expression in Kotlin, 
 * which allows you to assign the result of an if statement to a variable 
 * or return it from a function.
 */
fun main() {
    val a = 5
    val b = 10

    // if as expression (single-line)
    val max = if (a > b) a else b
    println("max = $max")

    // if as expression with blocks (last expression is returned)
    val n = -3
    val sign = if (n > 0) {
        println("n is positive")
        "POSITIVE"
    } else if (n < 0) {
        println("n is negative")
        "NEGATIVE"
    } else {
        println("n is zero")
        "ZERO"
    }
    println("sign = $sign")

    // using if as expression to return from function
    println("abs(-7) = ${abs(-7)}")
}

fun abs(x: Int): Int = if (x >= 0) x else -x