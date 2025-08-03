fun main() {
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Eve")
    for ((index, name) in names.withIndex()) {
        println("Index $index: $name")
    }
}