import `class`.Employee
import util.EmpType
import util.EmployeeFactory

fun main(args : Array<String>){
    val emp1 = EmployeeFactory.createEmployee(1,400f,EmpType.PART_TIME,6,10);
    val emp2 = EmployeeFactory.createEmployee(2,600f,EmpType.FULL_TIME,7,22);

    println(emp1.isPresent())
    println(emp1.calculateWage())

    println(emp2.isPresent())
    println(emp2.calculateWage())
}