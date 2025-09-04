package app

import data.Person

fun main() {
    val person = Person()

    person.firstName = "Peter"
    person.middleName = "Martin"
    person.lastName = "Michael"

    person.sayHello("Ryan")
    val fullName = person.getFullName()

    print(fullName)
}