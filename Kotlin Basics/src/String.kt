fun main() {

    // === String Values in Kotlin ===
    // Definition:
    // A String is a sequence of characters enclosed in double quotes ("").
    val firstname: String = "Ryan"
    val lastname: String = "Aprianto"

    // === Multiline Strings ===
    // Use triple quotes (""") to create strings spanning multiple lines.
    val simpleAddress: String = """
        Jl. Merdeka No. 123,
        Cirebon City,
        West Java 45100,
        Indonesia
    """

    // === trimMargin() with Default Margin ('|') ===
    // Use '|' as margin prefix and remove it with trimMargin()
    val formattedAddress: String = """
        |Ryan Aprianto
        |Jl. Merdeka No. 123
        |Cirebon City, West Java 45100
        |Indonesia
    """.trimMargin()

    // === trimMargin() with Custom Margin ('>') ===
    // Any character can be used as margin prefix in trimMargin()
    val profileDescription: String = """
        >Hello, my name is Ryan Aprianto.
        >I'm a software developer who enjoys working with Kotlin.
        >This is a sample of a well-formatted multiline string using '>'.
    """.trimMargin(">")

    // === String Templates ===
    // Kotlin supports string interpolation with '$'
    val fullName: String = "$firstname $lastname"

    // Expressions can be included with ${...}
    val description: String = "$fullName has ${fullName.length} characters"

    // === Output ===
    println(simpleAddress)       // Prints basic multiline string
    println(formattedAddress)    // Prints trimmed multiline string with '|'
    println(profileDescription)  // Prints trimmed multiline string with '>'
    println(fullName)            // Prints interpolated full name
    println(description)         // Prints full name with character count

    // === Notes & Tips ===
    // - Use triple quotes for multiline strings to maintain formatting.
    // - Use trimMargin() to remove unwanted indentation in multiline strings.
    // - String templates simplify concatenation and embedding expressions.
    // - Use ${} for complex expressions inside string templates.
}
