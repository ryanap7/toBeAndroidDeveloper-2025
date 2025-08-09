fun main() {
    // === Creating an Array ===
    // An Array in Kotlin is a fixed-size collection that can store elements of the same type.
    // Here, we create an Array of Strings with two initial elements.
    val names: Array<String> = arrayOf("Ryan", "Aprianto")

    // === Accessing Elements in an Array ===
    // Arrays in Kotlin are zero-indexed, meaning the first element is at index 0.
    // Common operations:
    // - size: Returns the number of elements in the array.
    // - get(index): Retrieves the element at the given index.
    // - [index]: Shorthand to get the element at the given index.
    // - set(index, value): Replaces the element at the given index with a new value.
    // - [index] = value: Shorthand to set a new value at a given index.

    // Updating the element at index 1 (second element)
    names[1] = "Ryan Aprianto"

    // Printing the element at index 1
    println(names[1]) // Output: Ryan Aprianto

    // === Nullable Array Elements ===
    // Here, we create an Array that can store nullable Integers (Int?).
    // This means each element can either be an Int or null.
    // arrayOfNulls(size) creates an array of the given size filled with null values.
    val balances: Array<Int?> = arrayOfNulls(5)

    // Assigning a value to the first element (index 0)
    balances[0] = 1000

    // Printing the element at index 0
    println(balances[0]) // Output: 1000
}
