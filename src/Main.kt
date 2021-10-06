import `class`.Employee
import sealedClass.EmployeeType

fun main(args : Array<String>){
    val emp1 = Employee(1,400f)
    emp1.employeeType = EmployeeType.PartTime(6)

    println(emp1.isPresent())
}