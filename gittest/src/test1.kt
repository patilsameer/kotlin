/*This code is demonstration of calling a simple kotlin function with parameter from
main method
* */


//accept two Int numbers, and return addition
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main(){
    var result=add(2,3)
    println(result)
}