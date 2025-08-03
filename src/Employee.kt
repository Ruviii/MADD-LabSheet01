abstract class Employee(val name: String, val id: Int) {
    abstract fun displayInfo()
}

class TemporaryStaff(name: String, id: Int, val hourlyRate: Double) : Employee(name, id) {
    override fun displayInfo() {
        println("Temporary Staff: $name, ID: $id, Hourly Rate: $$hourlyRate")
    }
}

class PermanentStaff(name: String, id: Int, val salary: Double) : Employee(name, id) {
    override fun displayInfo() {
        println("Permanent Staff: $name, ID: $id, Salary: $$salary")
    }
}

fun main() {
    val tempStaff = TemporaryStaff("John", 101, 15.0)
    val permStaff = PermanentStaff("Jane", 102, 50000.0)

    tempStaff.displayInfo()
    permStaff.displayInfo()
}