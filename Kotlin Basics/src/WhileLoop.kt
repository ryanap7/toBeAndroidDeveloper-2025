fun main() {
    // === While Loop in Kotlin ===
    // Definition:
    // The 'while' loop repeatedly executes a block of code
    // as long as the given condition is true.

    var i = 0

    // Loop runs while 'i' is less than or equal to 10
    while (i <= 10) {
        println(i) // Prints the current value of 'i'
        i++        // Increments 'i' by 1
    }

    // === Notes & Tips ===
    // - 'while' checks the condition before each iteration.
    // - If the condition is false initially, the loop body will not run.
    // - Use 'while' when the number of iterations is not known beforehand.
}
