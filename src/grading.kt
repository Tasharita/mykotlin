import java.util.Scanner
fun main() {
    println("Enter the student mark :")
    val mark = readLine()!!.toInt()
    val input = Scanner(System.`in`)

    val grade = when(mark) {
        in 80..100 ->"A"
        in 70..79 ->"B"
        in 60..69 ->"C"
        in 40..59 ->"D"
        in 0..39 ->"E"
        else -> "Invalid Mark"
    }
    println("Grade: $grade")
}