fun main() {
    // Comparison Operators (>=, <=, >, <, ==, !=)
    // These operators are used to compare two values.
    // The result of a comparison is always a Boolean value: true or false.

    val a = 100
    val b = 200

    // Example: a <= b checks if 'a' is less than or equal to 'b'.
    // 100 <= 200 → true, because 100 is indeed less than 200.
    val isLessOrEqual: Boolean = a <= b
    println(isLessOrEqual) // Output: true

    // Example: a == b checks if 'a' is equal to 'b'.
    // 100 == 200 → false, because 100 is not equal to 200.
    val isEqual: Boolean = a == b
    println(isEqual) // Output: false

    // Example: a != b checks if 'a' is NOT equal to 'b'.
    // 100 != 200 → true, because 100 is different from 200.
    val isNotEqual: Boolean = a != b
    println(isNotEqual) // Output: true
}
