fun main() {
    // === Range in Kotlin ===
    // Definition:
    // A range represents a sequence of values between a start and an end value (inclusive).
    // The ".." operator creates an increasing range.

    val range = 1..100 // Numbers from 1 to 100

    // === Common Range Operations ===
    // count()      -> Returns the total number of elements in the range
    // contains(x)  -> Checks if a value exists in the range
    // first        -> Returns the first element in the range
    // last         -> Returns the last element in the range
    // step         -> Returns the step value of the range

    // === Reversed Range ===
    // The "downTo" function creates a decreasing range.
    val values = 100 downTo 0 // Numbers from 100 down to 0

    // === Range with Step ===
    // The "step" function specifies the increment/decrement between each value in the range.
    val numbers = 100 downTo 0 step 10 // 100, 90, 80, ..., 0

    // Printing the range object shows its type, not all elements.
    // Use toList() to display all elements.
    println(numbers.toList()) // Output: [100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0]

    // === Notes & Tips ===
    // - Use ranges for loops or conditional checks involving sequences.
    // - Use 'downTo' for decreasing sequences.
    // - Use 'step' to skip values within the range.
    // - Convert ranges to lists when you need to work with all elements explicitly.
}
