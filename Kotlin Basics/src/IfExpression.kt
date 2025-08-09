fun main() {
    // If Expression
    // The if expression in Kotlin is used to execute code based on conditions.
    // It can have one or multiple branches (if, else if, else).

    val score = 90

    if (score > 80) {
        // This block will run if score is greater than 80
        println("Excellent")
    } else if (score > 70) {
        // This block will run if score is not greater than 80 but greater than 70
        println("Not Bad")
    } else {
        // This block will run if all previous conditions are false
        println("Try again later!")
    }

    // In Kotlin, 'if' can also return a value, making it an expression
    val performance = if (score > 80) {
        "Excellent"
    } else if (score > 70) {
        "Not Bad"
    } else {
        "Try again later!"
    }

    println("Performance: $performance")
}
