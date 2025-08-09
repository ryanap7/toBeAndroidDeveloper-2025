fun main() {
    // === Range in Kotlin ===
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

    // Printing the range object will show its progression type (not the actual numbers).
    // To display all elements, convert it to a list: numbers.toList()
    println(numbers.toList())
}
