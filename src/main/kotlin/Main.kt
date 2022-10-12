fun main(args: Array<String>) {

    val personList = listOf<Person>(
        Person("Ronaldo", 29, "London"),
        Person("Ronaldo", 29, "London")
    )
    personList.map {person ->
        println("Person: $person")
    }



    val person1 = Person("Ronaldo", 29, "London")
    println("Name: ${person1.name}")

    person1.name = "Messi"

    println("Name: ${person1.name}")
    println("Age: ${person1.age}")
    println("School: ${person1.school}")

}