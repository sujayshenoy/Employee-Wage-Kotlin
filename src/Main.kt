import `class`.Company
import `class`.Employee

fun main(args : Array<String>){
    val infosys = Company("Infosys",9,15)
    val capgemini = Company("Capgemini",7,25)
    val tcs = Company("TCS",10,20)

    infosys.createRandomEmployee(1)
    infosys.createRandomEmployee(2)
    capgemini.createRandomEmployee(1)
    capgemini.createRandomEmployee(2)
    tcs.createRandomEmployee(1)
    tcs.createRandomEmployee(2)

    infosys.showAttendance()
    capgemini.showAttendance()
    tcs.showAttendance()

    val infoEmployee = infosys.getEmployee(2)
    println(infoEmployee.empId)

    println("Total Wage of Employees(${infosys.name}): ${infosys.getTotalEmployeeWage()}")
    println("Total Wage of Employees(${capgemini.name}): ${capgemini.getTotalEmployeeWage()}")
    println("Total Wage of Employees(${tcs.name}): ${tcs.getTotalEmployeeWage()}")
}