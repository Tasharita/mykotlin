fun main() {

    var greeting = "Hello world"
    var firstname = "Glory"
    var lastname = "eMobilis"

    println(firstname + " " + lastname) //STRING CONCATENATION
    println(firstname.plus(lastname))

    println(greeting[6]) //accessing an element in a string
    println(greeting.indexOf("world"))

    println(firstname.toUpperCase())

   //string interpolation
    println("Hello there. My name is $firstname")

}