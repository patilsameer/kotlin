// /Users/sameerpatil/Documents/my_projects/kotlin/third.kt

fun main() {
    val nums = arrayOf(1, 2, 3, 10, 15)

    // for: iterate array
    for (n in nums) {
        println("num: $n -> ${describeNumber(n)}")
    }

    // for with indices and step
    for (i in 0..10 step 2) println("index: $i")

    // for with withIndex()
    for ((index, value) in nums.withIndex()) {
        println("nums[$index] = $value")
    }

    // for over a map with destructuring
    val map = mapOf("a" to 1, "b" to 2)
    for ((k, v) in map) println("$k -> $v")

    // when as expression and type-checking
    val items: List<Any?> = listOf(42, "hello", 3.14, null)
    for (it in items) {
        println(processAny(it))
    }

    // when with conditions
    val x = 7
    val result = when {
        x % 2 == 0 -> "even"
        x in 1..10 -> "odd in 1..10"
        else -> "other"
    }
    println("x=$x is $result")
}

fun describeNumber(n: Int): String = when (n) {
    1 -> "one"
    2 -> "two"
    in 3..10 -> "between 3 and 10"
    else -> "unknown"
}

fun processAny(x: Any?): String = when (x) {
    null -> "null value"
    is String -> "string of length ${x.length}"
    is Int -> "int doubled: ${x * 2}"
    is Double -> "double: $x"
    else -> "other type"
}