@Suppress("MISSING_DEPENDENCY_SUPERCLASS_IN_TYPE_ARGUMENT")

fun main() {

    // === Integer Numbers ===
    // Byte: 8-bit signed integer (-128 to 127)
    val age: Byte = 27

    // Int: 32-bit signed integer (default type for integers)
    val height: Int = 169

    // Short: 16-bit signed integer (-32,768 to 32,767)
    val distance: Short = 2000

    // Long: 64-bit signed integer. Use 'L' suffix to declare Long literal
    val balance: Long = 1_000_000L

    // === Floating Point Numbers ===
    // Float: 32-bit floating point number. Use 'F' suffix
    val value: Float = 3.14F

    // Double: 64-bit floating point number (default type for decimals)
    val radius: Double = 20.0

    // === Number Literals ===
    // Decimal literal (base 10)
    val decimalLiteral: Int = 100

    // Hexadecimal literal (base 16), prefix with '0x'
    val hexadecimalLiteral: Int = 0xFF // 255 in decimal

    // Binary literal (base 2), prefix with '0b'
    val binaryLiteral: Int = 0b0001 // 1 in decimal

    // === Using Underscores for Readability ===
    // Kotlin allows underscores to make large numbers more readable
    val price: Long = 1_000_000_000L

    // === Number Conversion ===
    // Kotlin does NOT automatically convert between different number types.
    // Use explicit conversion functions like toByte(), toInt(), toFloat(), etc.
    val number: Int = 11

    val byte: Byte = number.toByte()     // Converts Int to Byte
    val integer: Int = number.toInt()    // Converts Int to Int (no-op)
    val short: Short = number.toShort()  // Converts Int to Short
    val long: Long = number.toLong()     // Converts Int to Long
    val float: Float = number.toFloat()  // Converts Int to Float
    val double: Double = number.toDouble() // Converts Int to Double

    // === Output ===
    // Prints the Long value stored in 'balance' to the console
    println(balance)
}
