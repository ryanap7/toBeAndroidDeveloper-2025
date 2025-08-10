// === Single Expression Function in Kotlin ===
// A function that consists of only one expression can be written in a shorter form using '='
// The return type can be explicitly stated or inferred by Kotlin.

fun multiply(a: Int, b: Int): Int = a * b // Returns the product of two integers

fun main() {
    // === Calling a single expression function ===
    val result = multiply(5, 5) // Store the returned value in a variable

    println(result) // Output: 25

    // === Notes & Tips ===
    // - Single expression functions improve readability for simple logic.
    // - Keep them concise; use block functions for complex operations.
}
