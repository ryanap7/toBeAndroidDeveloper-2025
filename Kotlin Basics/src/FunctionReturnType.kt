// === Function with Return Type in Kotlin ===
// Functions can return a value by specifying the return type after the parameter list.

fun sum(a: Int, b: Int): Int {
    return a + b // Returns the sum of two integers
}

fun main() {
    // === Calling a function with return type ===
    val result = sum(a = 10, b = 20) // Store the returned value in a variable

    println(result) // Output: 30

    // === Notes & Tips ===
    // - Always specify the return type explicitly for better readability.
    // - Kotlin can infer the return type, but explicit declaration is recommended for public APIs.
}
