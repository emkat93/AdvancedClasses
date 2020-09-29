/**
 *@author Emily Allen
 * @desc This is the main block
 *date: 9/28/20
 * @param emp1 holds employee's 1 information
 * @param emp2 holds employee's 2 information
 * @param emp3 holds employee's 3 information
 * mod
 * updated 9/29/20
 * fixed the position to display the enum class
 * removed startDate information
 */

fun main(){
    val emp1 = Employee("Rosella", "Valentine", "${PositionTitle.SECRETARIAL.namePosition}", true,
            28.00, 1)
    val emp2 = Employee("Leon", "Pendragon", "${PositionTitle.SALES.namePosition}", false,
            26.00, 2)
    val emp3 = Employee("Julia", "Stone", "${PositionTitle.TECHNICAL.namePosition}", false,
            22.00, 3)

    emp1.printAll()
    emp1.calculate(45.0)
    println("\n")
    emp2.printAll()
    emp2.calculate(50.0)
    println("\n")
    emp3.printAll()
    emp3.calculate(35.0);
}
