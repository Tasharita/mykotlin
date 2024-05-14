class Person{
    //attributes/properties
    var name = "James"
    var age = 21
    var location = "Nairobi"

    //behaviour/methods/functions
    fun walk(){
        println("Person is walking")
    }
}

fun main() {
    var doctor = Person()
    println(doctor.age)
    println(doctor.name)

    doctor.walk()
}