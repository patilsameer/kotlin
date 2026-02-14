/**
 * This code demonstrates the use of interfaces and abstract classes in Kotlin.
 * It defines a Drawable interface, an abstract Shape class, and two concrete classes Circle and Rectangle that implement the Drawable interface and extend the Shape class.
 * The main function creates a list of shapes, describes their area, and draws them if they are drawable.
 */

import kotlin.math.PI
// Drawable interface with a draw method - any class that implements this interface must provide an implementation for the draw() method.
// the difference between an interface and an abstract class is that an 
//interface cannot hold state (no properties with backing fields) and cannot have constructors
//while an abstract class can have both properties and constructors. 
//Additionally, a class can implement multiple interfaces but can only inherit from one abstract class.
interface Drawable {
    fun draw()
}

abstract class Shape(val name: String) {
    abstract fun area(): Double
    open fun describe() {
        println("$name area = ${area()}")
    }
}

//circle and rectangle are concrete classes that extend the abstract Shape class and 
//implement the Drawable interface.
// note that they provide their own implementations of the area() method from Shape 
//and the draw() method from Drawable.
//but the describe() method is inherited from Shape and used without any change
//describe can be overridden if needed.
class Circle(name: String, val radius: Double) : Shape(name), Drawable {
    override fun area(): Double = PI * radius * radius
    override fun draw() = println("Drawing $name with radius $radius")
}

class Rectangle(name: String, val width: Double, val height: Double) : Shape(name), Drawable {
    override fun area(): Double = width * height
    override fun draw() = println("Drawing $name with width $width and height $height")
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle("Circle1", 2.0),
        Rectangle("Rect1", 3.0, 4.0)
    )

    for (s in shapes) {
        s.describe()
        if (s is Drawable) s.draw()
    }
}