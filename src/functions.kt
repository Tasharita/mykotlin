fun main() {
    //pre defined functions/inbuilt library functions
    println("Hello Kotlin")

    var x = Math.sqrt(169.0)
    println(x)

    var y = Math.round(56.78)
    println(y)

    var z = Math.min(45, 34)
    println(z)

    var number = Math.max(123, 567)
    println(number)

    //calling a function
    name()
    sum()
    details("Joe", 56)
    details("Karimi",60)
}

//user-defined functions
fun name(){

    println("Tasha")

}
fun sum(){
    var number1 = 45
    var number2 = 60
    println(number1 + number2)
}

//parameter and arguments
fun details(name:String, age:Int){
    println("$name is $age years old")
}