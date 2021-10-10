package `class`

import util.EmpType
import util.EmployeeFactory


class Company(private val name: String, private  val workingHoursPerDay:Int, private val workingDaysPerMonth: Int) {
    var employees:MutableList<Employee> = mutableListOf<Employee>()

    fun createRandomEmployee(id: Int){
        val emp = EmployeeFactory.createEmployee(id, generateWagePerHour(), generateEmployeeType(),workingHoursPerDay,workingDaysPerMonth)
        employees.add(emp)
    }

    private fun generateWagePerHour():Float = (Math.random()*1000+100).toFloat()

    private fun generateEmployeeType() : EmpType {
        val prob = Math.random()
        return if (prob > 0.5) {
            EmpType.FULL_TIME
        } else {
            EmpType.PART_TIME
        }
    }
}