fun main() {

    var languages = arrayOf("Kotlin","Python","Java")

    println(languages[1])

    //re-assigning a value
    languages[1] = "php"
    println(languages[1])

    //looping through an array
    for (lang in languages){
        println(lang)
    }

    //checking if an element exists
    if ("Kotlin" in languages){
        println("It exists")
    }
    else{
        println("Does not exist")
    }
}