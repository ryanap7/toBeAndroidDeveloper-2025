package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String): Unit {
        println("Hello $name, My name is $firstName")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}