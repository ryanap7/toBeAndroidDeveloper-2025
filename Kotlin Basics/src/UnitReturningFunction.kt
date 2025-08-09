// === Function Returning Unit in Kotlin ===
// 'Unit' is the Kotlin equivalent of 'void' in other languages.
// It indicates the function does not return a meaningful value.

fun printHello(name: String): Unit {
    println("Hello $name") // Prints a greeting message
}

fun main() {
    // === Calling a function that returns Unit ===
    printHello("Ryan") // Output: Hello Ryan

    // === Notes & Tips ===
    // - Explicitly declaring ': Unit' is optional; it's the default return type.
    // - Use functions returning Unit for actions that produce side effects like printing.
}
