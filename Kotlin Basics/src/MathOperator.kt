fun main() {

    // Basic Mathematical Operations (+, -, *, /, %)
    // Example: Division of two Double numbers
    var math = 10.0 / 3.0

    // Here we calculate: 10 + (10 * 2)
    // According to operator precedence, multiplication is done first.
    val result = 10 + (10 * 2)

    println(math) // Output: 3.3333333333333335

    // Augmented Assignments (+=, -=, *=, /=, %=)
    // Example: math += 10 means math = math + 10
    math += 10

    println(math) // Output: 13.333333333333334

    // Unary Operators:
    // ++ (increment), -- (decrement)
    // - (negation), + (positive sign), ! (logical NOT)
    // Example: math++ means math = math + 1
    math++

    println(math) // Output: 14.333333333333334
}
