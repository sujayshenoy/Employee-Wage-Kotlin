package `class`

import sealedClass.EmployeeType
import kotlin.math.floor

class Employee(val empId: Int, private val wagePerHour: Float, private val employeeType: EmployeeType) {
    fun isPresent() : Boolean{
        val attendance = ((floor(Math.random()*10))%2).toInt()
        return attendance == 1
    }

    fun calculateWage() : Float {
        var totalWorkedHours = 0
        var totalWorkedDays = 0
        var workingHoursPerDay = 0;
        var workingDaysPerMonth = 0;

        when(employeeType){
            is EmployeeType.FullTime -> {
                workingHoursPerDay = employeeType.workingHoursPerDay
                workingDaysPerMonth = employeeType.workingDaysPerMonth
            }
            is EmployeeType.PartTime -> {
                workingHoursPerDay = employeeType.workingHoursPerDay
                workingDaysPerMonth = employeeType.workingDaysPerMonth
            }
        }

        while (totalWorkedHours < workingHoursPerDay && totalWorkedDays < workingDaysPerMonth) {
            //calculate total hours worked today
            val rng = floor(Math.random() * (8 - 4 + 1) + 4).toInt()
            // used formula (max-min+1)+ min to generate a random working hour between 4 and 8
            totalWorkedHours += rng
            totalWorkedDays++
        }

        return wagePerHour * totalWorkedHours
    }
}