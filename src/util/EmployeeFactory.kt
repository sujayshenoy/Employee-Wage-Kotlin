package util

import `class`.Employee
import sealedClass.EmployeeType

enum class EmpType{
    PART_TIME,FULL_TIME
}

object EmployeeFactory {
    fun createEmployee(id: Int,wagePerHour: Float,type: EmpType, workingHoursPerDay: Int, workingDaysPerMonth: Int): Employee {
        return return when(type){
            EmpType.PART_TIME -> {
                val type: EmployeeType = EmployeeType.PartTime(workingHoursPerDay, workingDaysPerMonth)
                Employee(id, wagePerHour, type)
            }
            EmpType.FULL_TIME -> {
                val type: EmployeeType = EmployeeType.FullTime(workingHoursPerDay, workingDaysPerMonth)
                Employee(id, wagePerHour, type)
            }
        }
    }
}