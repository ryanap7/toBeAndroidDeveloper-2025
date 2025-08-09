// === Constant Variable ===
// 'const val' is used for compile-time constants.
// Must be declared at the top level (outside any function).
// The value must be assigned at declaration and cannot be changed later.
const val VERSION: String = "1.0"

fun main() {

    // === Mutable Variable ===
    // Declared with 'var' → the value can be reassigned later.
    var name: String = "Ryan" // Initial value
    name = "Ryan Aprianto"    // Value changed (mutable)

    // === Immutable Variable ===
    // Declared with 'val' → read-only reference.
    // The value can only be assigned once, but the object it refers to can still be mutable.
    val age: Int = 18

    // === Nullable Variable ===
    // Adding '?' after the type means the variable can store 'null'.
    // Without '?', variables cannot hold null values (non-null by default in Kotlin).
    val address: String? = null

    // === Output ===
    println("Name: $name")
    println("Age: $age")
    println("Address: $address")
    println("App Version: $VERSION")

    // === Notes & Tips ===
    // - Use 'const val' for compile-time constants declared outside functions.
    // - Use 'var' for variables that need to be reassigned.
    // - Use 'val' for variables that should be assigned once (immutable reference).
    // - Use nullable types (with '?') to allow variables to hold null values.
    // - Avoid null when possible to prevent NullPointerExceptions.
}
