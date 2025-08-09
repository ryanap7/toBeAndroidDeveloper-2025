fun main() {
    // === Basic Mathematical Operations in Kotlin (+, -, *, /, %) ===
    // Example: Division of two Double numbers
    var math = 10.0 / 3.0

    // Here we calculate: 10 + (10 * 2)
    // Operator precedence applies: multiplication happens before addition
    val result = 10 + (10 * 2)

    println(math)   // Output: 3.3333333333333335
    println(result) // Output: 30

    // === Augmented Assignments (+=, -=, *=, /=, %=) ===
    // Example: math += 10 is equivalent to math = math + 10
    math += 10
    println(math)   // Output: 13.333333333333334

    // === Unary Operators ===
    // ++ (increment), -- (decrement)
    // - (negation), + (positive sign), ! (logical NOT)
    // Example: math++ increases math by 1
    math++
    println(math)   // Output: 14.333333333333334

    // === Notes & Tips ===
    // - Use parentheses to explicitly specify operation order when needed.
    // - Augmented assignments simplify modifying variables.
    // - Unary operators are shorthand for common operations.
}
