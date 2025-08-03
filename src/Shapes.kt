interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() {
        println("Setting up Circle")
    }

    override fun draw() {
        println("Drawing Circle")
    }
}

class Rectangle : Shape {
    override fun setup() {
        println("Setting up Rectangle")
    }

    override fun draw() {
        println("Drawing Rectangle")
    }
}

fun main() {
    val circle = Circle()
    val rectangle = Rectangle()

    circle.setup()
    circle.draw()

    rectangle.setup()
    rectangle.draw()
}