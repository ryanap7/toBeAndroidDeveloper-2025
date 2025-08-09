// === Function with Named Arguments in Kotlin ===
// Named arguments allow specifying parameter values by name
// when calling a function, improving readability and flexibility.

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    // === Calling function using named arguments ===
    fullName(middleName = "Aprianto", firstName = "Ryan", lastName = "")
    // Output: Hello Ryan Aprianto 

    // === Notes & Tips ===
    // - Named arguments help clarify which value corresponds to which parameter.
    // - They allow passing arguments in any order.
    // - Useful in functions with many parameters or optional/default values.
}
