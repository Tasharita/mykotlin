fun main() {
    //break statement
    for (number in 34..39){
        if (number == 36){
            break
        }
        println(number)
    }

    //continue statement
    for (characters in 'd'..'h'){
        if (characters == 'f'){
            continue
        }
        println("Character is $characters")
    }

}