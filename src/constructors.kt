class Dog(var name:String,var breed:String,var age:Int,var weight:Int){
    fun move(movement:String){
        println("The dog is $movement")
    }

}

fun main() {
    var dog1 = Dog("Bill","Chihuahua",3,30)
    var dog2 = Dog("Tito","German Shepherd",5,20)

    println(dog1.name)
    dog1.move("walking")

    println(dog2.breed)
    dog2.move("running")

}