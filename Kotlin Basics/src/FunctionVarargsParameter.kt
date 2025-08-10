// === Function with Varargs Parameter in Kotlin ===
// - The `vararg` keyword allows a function to accept a variable number of arguments of the same type.
// - Inside the function, `values` behaves like an array and can be iterated.
// - Useful for cases where the number of inputs is not fixed.

fun finalValue(name: String, vararg values: Int): Unit {
    var total = 0.0 // Variable to store the sum of values

    // Loop through each value passed in the varargs parameter
    for (value in values) {
        total += value
    }

    total /= values.size // Calculate the average value

    println("Final Value $name = $total") // Display the result
}

fun main() {
    // === Calling a function with varargs ===
    // Multiple integers are passed without creating an array explicitly
    finalValue("Ryan", 10, 10, 10) // Output: Final Value Ryan = 10.0

    // === Notes & Tips ===
    // - You can pass any number of arguments (including zero) to a vararg parameter.
    // - Use the spread operator (*) to pass an existing array to a vararg.
}
