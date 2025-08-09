fun main() {
    // === When Expression in Kotlin ===
    // Definition:
    // 'when' is a versatile replacement for 'switch' statements.
    // It can match values, group cases, check ranges, test types, or replace if-else chains.

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

    // 3. Using 'in' and '!in' to check membership in a collection or range
    val passValues: Array<Char> = arrayOf('A', 'B', 'C')
    when (grade) {
        in passValues -> println("Passed using 'in'")
        !in passValues -> println("Not Passed using '!in'")
    }

    // 4. Using 'is' and '!is' to check type
    when (val name = "Ryan") {
        is String -> println("Name is a String: $name")
        !is String -> println("Not a String")
    }

    // 5. Using 'when' without a subject — acts like an if-else chain
    when {
        grade in passValues -> println("Condition-based Passed")
        else -> println("Condition-based Not Passed")
    }

    // === Notes & Tips ===
    // - 'when' can be used as an expression and return a value.
    // - It improves readability over multiple if-else statements.
    // - Use 'when' for matching single values, ranges, types, or complex conditions.
    // - 'else' branch is required unless all cases are covered.
}
