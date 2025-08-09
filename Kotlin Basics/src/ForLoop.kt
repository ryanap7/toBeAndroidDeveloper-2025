fun main() {
    // === For Loops in Kotlin ===
    // Definition:
    // The 'for' loop is used to iterate over a range, array, collection, or any iterable object.

    // Example 1: Iterating over an Array
    val values: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    var total = 0
    for (value in values) {
        println(value) // Prints each element from the array
        total++        // Counts the number of elements
    }
    println("Total elements: $total") // Output: Total elements: 5

    // Example 2: Iterating over a Range from 1 to 100 (inclusive)
    for (value in 1..100) {
        println(value)
    }

    // === Notes & Tips ===
    // - '1..100' creates a closed range including both 1 and 100.
    // - Use 'until' to exclude the upper bound, e.g., '1 until 100' iterates from 1 to 99.
    // - Use 'downTo' to iterate in descending order, e.g., '5 downTo 1'.
    // - Use 'step' to skip values, e.g., '1..10 step 2' iterates over 1, 3, 5, 7, 9.
}
