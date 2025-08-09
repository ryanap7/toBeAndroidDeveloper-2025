fun main() {
    // === If Expression in Kotlin ===
    // Definition:
    // The 'if' expression is used to execute code conditionally.
    // It can have multiple branches: if, else if, and else.
    // In Kotlin, 'if' is an expression, meaning it returns a value.

    val score = 90

    // Example: Using if-else for branching logic
    if (score > 80) {
        // Runs if score is greater than 80
        println("Excellent")
    } else if (score > 70) {
        // Runs if score is not greater than 80 but greater than 70
        println("Not Bad")
    } else {
        // Runs if all above conditions are false
        println("Try again later!")
    }

    // Example: Using if as an expression that returns a value
    val performance = if (score > 80) {
        "Excellent"
    } else if (score > 70) {
        "Not Bad"
    } else {
        "Try again later!"
    }

    println("Performance: $performance") // Output: Performance: Excellent

    // === Notes & Tips ===
    // - Use if expressions when you want to select between multiple conditions.
    // - Because 'if' returns a value, you can assign its result directly to a variable.
}
