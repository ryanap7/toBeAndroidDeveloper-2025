fun main() {
    // === Arrays in Kotlin ===
    // Definition:
    // An Array is a fixed-size collection that stores multiple elements of the same type.
    // It can store both primitive types (Int, Double, Boolean, etc.) and objects.
    // Arrays in Kotlin are zero-indexed, meaning the first element is at index 0.

    // Usage:
    // Use arrays when you know the number of elements will not change.
    // Suitable for storing data in a fixed-length sequence.

    // === Example 1: Creating and Modifying an Array ===
    val names: Array<String> = arrayOf("Ryan", "Aprianto") // Create an Array of Strings
    names[1] = "Ryan Aprianto" // Update element at index 1
    println(names[1]) // Output: Ryan Aprianto

    // === Example 2: Nullable Array Elements ===
    // You can create an Array with nullable elements using arrayOfNulls(size).
    // This initializes all positions with null values.
    val balances: Array<Int?> = arrayOfNulls(5) // Create an Array of nullable Integers
    balances[0] = 1000 // Assign value to the first index
    println(balances[0]) // Output: 1000

    // === Notes & Tips ===
    // - Arrays have a fixed size. You cannot directly add or remove elements.
    // - For collections that can grow or shrink, use List or MutableList instead.
    // - Accessing an index out of bounds will throw an IndexOutOfBoundsException.
    // - Use loops (for, forEach) to iterate through array elements.
}
