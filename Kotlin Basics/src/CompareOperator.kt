fun main() {
    // === Comparison Operators in Kotlin (>=, <=, >, <, ==, !=) ===
    // Definition:
    // Comparison operators compare two values and return a Boolean result: true or false.
    //
    // Common operators:
    // - >= : greater than or equal to
    // - <= : less than or equal to
    // - >  : greater than
    // - <  : less than
    // - == : equal to
    // - != : not equal to

    val a = 100
    val b = 200

    // Example: Check if 'a' is less than or equal to 'b'
    // 100 <= 200 → true because 100 is less than 200
    val isLessOrEqual: Boolean = a <= b
    println(isLessOrEqual) // Output: true

    // Example: Check if 'a' is equal to 'b'
    // 100 == 200 → false because they are different
    val isEqual: Boolean = a == b
    println(isEqual) // Output: false

    // Example: Check if 'a' is not equal to 'b'
    // 100 != 200 → true because they are different
    val isNotEqual: Boolean = a != b
    println(isNotEqual) // Output: true

    // === Notes & Tips ===
    // - Use comparison operators in conditional statements to control program flow.
    // - The result of any comparison is always a Boolean.
}
