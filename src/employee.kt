class Employee(var firstname:String,var salary:Double,var position:String){

    fun role(task:String){
        println("The role is $task")
    }
}

fun main(){
    var employee1 = Employee("John",120000.00,"Managing Director")
    var employee2 = Employee("Mark",320000.00,"Human Resource Manager")
    var employee3 = Employee("Jane",45000.00,"Accountant")

    println(employee2.salary)
    println("Employee3 is the ${employee3.position}")

    employee3.role("accounting")
}