fun main() {

    // === String Values ===
    // A String is a sequence of characters. Use double quotes ("") to declare a string.
    val firstname: String = "Ryan"
    val lastname: String = "Aprianto"

    // === Multiline Strings ===
    // Use triple quotes (""") to create a string that spans multiple lines.
    val simpleAddress: String = """
        Jl. Merdeka No. 123,
        Cirebon City,
        West Java 45100,
        Indonesia
    """

    // === trimMargin() with Default Margin ('|') ===
    // Use '|' as a margin prefix and trim it using trimMargin()
    val formattedAddress: String = """
        |Ryan Aprianto
        |Jl. Merdeka No. 123
        |Cirebon City, West Java 45100
        |Indonesia
    """.trimMargin()

    // === trimMargin() with Custom Margin ('>') ===
    // You can use any custom character as the margin prefix
    val profileDescription: String = """
        >Hello, my name is Ryan Aprianto.
        >I'm a software developer who enjoys working with Kotlin.
        >This is a sample of a well-formatted multiline string using '>'.
    """.trimMargin(">")

    // === String Template ===
    // Kotlin supports string interpolation using the '$' symbol
    val fullName: String = "$firstname $lastname"

    // You can also use expressions in templates with ${...}
    val description: String = "$fullName has ${fullName.length} characters"

    // === Output ===
    println(simpleAddress)       // Basic multiline string without trimming
    println(formattedAddress)    // Multiline string using trimMargin('|')
    println(profileDescription)  // Multiline string using trimMargin('>')
    println(fullName)            // Interpolated full name
    println(description)         // Full name with character count
}
