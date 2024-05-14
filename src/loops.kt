fun main() {
    //while loop
    var number = 6
    while (number <= 10){
        println("Number is $number")
        number++
    }
    var number1 = 25
    while (number1 >= 20){
        println("Number is $number1")
        number1--
    }

    //do...while loop
    var counter = 100
    do {
        println("Number is $counter")
        counter++
    }while (counter <= 106)

    //for loop
    var furniture = arrayOf("Table", "Chair", "Desk")
    for (y in furniture){
        println(y)
    }

    var max = arrayOf(90, 80, 60)
    for (v in max){
        println("Mark is $v")
    }

    //range
    for (letter in 'a'..'d'){
        println(letter)
    }
    for (number in 5 .. 10){
        println("Number $number")
    }


}