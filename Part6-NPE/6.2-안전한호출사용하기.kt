package `Part6-NPE`

class Employee(val name:String, val manager: Employee?)
fun managerName(employee: Employee): String? = employee.manager?.name

fun main() {
    val ceo = Employee("Da Boss",null)
    val developer = Employee("Bob Smith", ceo)
    // manager -> name = da boss -> call ok
    println(managerName(developer))
    // manager -> name -> null, ?. 사용으로 콜 가능
    println(managerName(ceo))
}
