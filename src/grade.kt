import java.util.Scanner

//Main Function , Entry point of Program
fun main(args: Array<String>) {

    //array of subjects Names
    val subject = arrayOf<String>("English", "Maths", "Physics", "Computer")

    //This collects the input from the user
    val input = Scanner(System.`in`)

    //This declares Array to Contain Subjects marks
    val marksArray = DoubleArray(4)

    //Start Inputing mark of Subjects
    println("Input Marks:")
    for (i in marksArray.indices) {
        println("${subject[i]} : ")
        marksArray[i] = input.nextDouble()
    }

    //Calculates the total mark of all the subject
    val total = marksArray.sum()

    //Calculates Percentage
    val percentage = marksArray.average()

    //Print Total and Percentage
    println("Total mark of all subjects : $total")
    println("Percentage(%) : $percentage")


    //To find out Grade based on Percentage
    when {
        percentage >= 100 -> println("Grade : A")
        percentage >= 89 -> println("Grade : B")
        percentage >= 79 -> println("Grade : C")
        percentage >= 69 -> println("Grade : D")
        else -> println("Grade : F")
    }
}