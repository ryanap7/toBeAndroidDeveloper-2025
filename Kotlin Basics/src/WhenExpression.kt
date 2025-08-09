fun main() {
    // When Expression
    // The 'when' expression in Kotlin is a versatile replacement for the 'switch' statement in other languages.
    // It can be used to check a value against multiple conditions, group cases, use ranges, check type, or even replace if-else chains.

    val grade: Char = 'A'

    // 1. Basic usage: match a single value
    when (grade) {
        'A' -> println("Grade A: Excellent")
        'B' -> println("Grade B: Good")
        'C' -> println("Grade C: Fair")
        'D' -> println("Grade D: Needs Improvement")
        else -> println("Invalid input")
    }

    // 2. Grouping multiple cases together
    when (grade) {
        'A', 'B', 'C' -> println("Status: Passed")
        else -> println("Status: Not Passed")
    }

    // 3. Using 'in' and '!in' to check for membership in a collection or range
    val passValues: Array<Char> = arrayOf('A', 'B', 'C')
    when (grade) {
        in passValues -> println("Passed using 'in'")
        !in passValues -> println("Not Passed using '!in'")
    }

    // 4. Using 'is' and '!is' to check type
    val name = "Ryan"
    when (name) {
        is String -> println("Name is a String: $name")
        !is String -> println("Not a String")
    }

    // 5. Using 'when' without a subject — works like an if-else chain
    when {
        grade in passValues -> println("Condition-based Passed")
        else -> println("Condition-based Not Passed")
    }

    // Note:
    // - 'when' can return a value just like 'if' expression
    // - 'when' is more readable than multiple if-else statements when checking multiple conditions
}
