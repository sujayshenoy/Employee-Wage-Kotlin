package `class`

import sealedClass.EmployeeType
import kotlin.math.floor
import kotlin.properties.Delegates

class Employee(val empId: Int, val wagePerHour: Float) {
    lateinit var employeeType : EmployeeType

    fun isPresent() : Boolean{
        val attendance = ((floor(Math.random()*10))%2).toInt()
        return attendance == 1
    }
}