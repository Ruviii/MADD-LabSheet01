fun calculateCircle(radius: Double){
    val pi = 3.14
    val circumference = 2 * pi * radius
    val area = pi * radius * radius
    println("Circumference: $circumference")
    println("Area: $area")
}

fun main() {
    print("Enter the radius of the circle: ")
    val radius = readLine()?.toDoubleOrNull() ?: 0.0

    if (radius > 0) {
        calculateCircle(radius)
    } else {
        println("Please enter a valid radius greater than 0.")
    }
}