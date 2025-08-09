// === Function Parameters in Kotlin ===
// Functions can accept input values called parameters.
// Parameters allow passing data into functions for processing.

fun sayHello(firstName: String, lastName: String?) {
    // Check if 'lastName' is null to customize the greeting
    if (lastName == null)
        println("Hello $firstName!")
    else
        println("Hello $firstName $lastName!")
}

fun main() {
    // === Calling function with parameters ===
    sayHello("Ryan", "Aprianto") // Output: Hello Ryan Aprianto!

    // === Notes & Tips ===
    // - Parameters can be nullable (e.g., String?) or non-nullable (e.g., String).
    // - Use null checks to handle optional parameters safely.
    // - String templates simplify output formatting.
}
