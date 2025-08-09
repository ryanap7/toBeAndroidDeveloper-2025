fun main() {
    // === Do-While Loop in Kotlin ===
    // Definition:
    // The 'do-while' loop executes the code block at least once,
    // then repeats it as long as the condition is true.

    var i = 0

    // Loop runs, then condition is checked after each iteration
    do {
        println(i) // Prints the current value of 'i'
        i++        // Increments 'i' by 1
    } while (i < 10)

    // === Notes & Tips ===
    // - 'do-while' guarantees the loop body runs at least once.
    // - Use when you want the code to run before the condition is tested.
    // - Be careful to avoid infinite loops by ensuring the condition eventually becomes false.
}
