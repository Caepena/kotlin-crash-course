import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 5f,
        height = 7f
    )

    val circle = Circle(radius = 5f)

    println(FixSizeSquare)
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle -> println("Yo that's a circle")
            is Rectangle -> println("Yo that's a rectangle")
            is FixSizeSquare -> println("Yo that's a fix size square")
        }
        println(output)
    }
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

object FixSizeSquare: Shape {
    override val area = 16f
    override val circumference = 16f
}

enum class Country {
    GERMANY,
    FRENCH,
    USA
}

fun greetMe(country: Country): String {
    return when (country) {
        Country.GERMANY -> "Guten Tag!"
        Country.FRENCH -> "Bonjour!"
        Country.USA -> "Hello!"
    }
}

sealed interface Shape {
    val area: Float
    val circumference: Float
}

data class Rectangle(val width: Float, val height: Float): Shape {

    val diagonal = sqrt(width * width + height * height)

    override val area = width * height

    override val circumference = 2 * width + 2 * height
}

data class Circle(val radius: Float): Shape {
    override val area = radius * radius * PI.toFloat()

    override val circumference = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}