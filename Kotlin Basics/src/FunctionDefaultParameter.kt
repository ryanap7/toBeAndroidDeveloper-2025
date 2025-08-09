// === Function with Default Parameters in Kotlin ===
// Functions can have default values for parameters.
// If no argument is passed, the default value is used.

fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    // === Calling function with only one argument ===
    // 'lastName' uses its default value of empty string
    hello("Ryan") // Output: Hello Ryan 

    // === Notes & Tips ===
    // - Default parameters simplify function calls when some arguments are optional.
    // - You can override default values by providing arguments.
    // - Use default parameters to avoid method overloads.
}
