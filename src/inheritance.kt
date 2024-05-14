//Parent class/Super class/Base class
open class Animal{
    var age = 13
    var gender = "Male"

    fun move(movement:String){
        println("Animal is $movement")
    }

}
//Child class/Sub class/derived class
open class Duck:Animal(){
    var isMammal = true
    var color = "white"

    fun sound(){
     println("The duck is quacking")
    }

}

class Fish:Duck(){
    var hasScales = true
    var hasFins = true
     fun eat(){
         println("Fish is eating")
     }

}

fun main() {

    var a = Animal()

    var d = Duck()
    d.move("swimming")
    var f = Fish()

}


