class Outer(val outerVar: String = "outerValue") {
    // Nested class: behaves like a static class (cannot access Outer instance members)
    class Nested {
        val nestedVar = "nestedValue"
        fun nestedMethod(): String = "nestedMethod called"
    }

    // Inner class: holds a reference to the outer class instance and can access its members
    inner class Inner {
        val innerVar = "innerValue"
        fun innerMethod(): String = "innerMethod called, outerVar = $outerVar"
        fun accessOuterPrivate(): String = "accessing outer private via inner: $outerVar"
    }
}

fun main() {
    // Using nested class (no Outer instance needed)
    val nested = Outer.Nested()
    println("Nested var: ${nested.nestedVar}")
    println("Nested method: ${nested.nestedMethod()}")

    // Using inner class (requires an Outer instance)
    val outer = Outer("myOuter")
    // create an instance of Inner using the Outer instance
    //outer.Inner() creates an instance of Inner class that is associated with 
    //the outer instance, allowing it to access outerVar and other members of Outer.
    val inner = outer.Inner()
    println("Inner var: ${inner.innerVar}")
    println("Inner method: ${inner.innerMethod()}")
    println(inner.accessOuterPrivate())
}