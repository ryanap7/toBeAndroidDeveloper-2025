fun main() {
    // === Boolean Operators in Kotlin (&&, ||, !) ===
    // Definition:
    // Boolean operators are used to combine or invert Boolean values (true/false).
    // Common operators include:
    // - AND (&&): true if both operands are true.
    // - OR (||): true if at least one operand is true.
    // - NOT (!): inverts the Boolean value.

    val finalExam = 80
    val attendance = 80

    // Example Conditions:
    // Check if the final exam score is greater than 75
    val passFinalExam = finalExam > 75  // true because 80 > 75

    // Check if the attendance score is greater than 75
    val passAttendance = attendance > 75 // true because 80 > 75

    // === Using Boolean Operators ===
    // Logical AND (&&): true only if both conditions are true
    val pass = passFinalExam && passAttendance
    println(pass)  // Output: true because both conditions are true

    // Logical OR (||): true if at least one condition is true
    val passOr = passFinalExam || passAttendance
    println(passOr) // Output: true because both are true (only one needed to be true)

    // Logical NOT (!): inverts the Boolean value
    val notPass = !pass
    println(notPass) // Output: false because 'pass' is true

    // === Notes & Tips ===
    // - Use && when you want all conditions to be true.
    // - Use || when you want at least one condition to be true.
    // - Use ! to invert a Boolean value (true becomes false, false becomes true).
}
