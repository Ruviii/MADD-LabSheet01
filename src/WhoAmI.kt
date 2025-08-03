fun whoAmI(param: Any): String {
    return param::class.simpleName ?: "Unknown"
}

fun main() {
    println(whoAmI(42))           // Int
    println(whoAmI("Hello"))      // String
    println(whoAmI(3.14))         // Double
}