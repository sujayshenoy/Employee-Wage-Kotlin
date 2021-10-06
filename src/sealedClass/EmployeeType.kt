package sealedClass

sealed class EmployeeType {
    data class FullTime(val workingHoursPerDay: Int) : EmployeeType()
    data class PartTime(val workingHoursPerDay: Int) : EmployeeType()
}