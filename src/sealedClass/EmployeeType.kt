package sealedClass

sealed class EmployeeType {
    data class FullTime(val workingHoursPerDay: Int, val workingDaysPerMonth: Int) : EmployeeType()
    data class PartTime(val workingHoursPerDay: Int, val workingDaysPerMonth: Int) : EmployeeType()
}