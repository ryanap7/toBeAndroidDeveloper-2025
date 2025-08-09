fun main() {
    // Boolean Operators (&&, ||, !)
    // These operators are used to combine or modify Boolean values (true/false).

    val finalExam = 80
    val attendance = 80

    // Check if the final exam score is greater than 75
    val passFinalExam = finalExam > 75 // true because 80 > 75

    // Check if the attendance score is greater than 75
    val passAttendance = attendance > 75 // true because 80 > 75

    // Logical AND (&&): true only if both conditions are true
    val pass = passFinalExam && passAttendance
    println(pass) // Output: true because both conditions are true

    // Logical OR (||): true if at least one condition is true
    val passOr = passFinalExam || passAttendance
    println(passOr) // Output: true because both are true (only one needed to be true)

    // Logical NOT (!): inverts the Boolean value
    val notPass = !pass
    println(notPass) // Output: false because 'pass' is true
}
