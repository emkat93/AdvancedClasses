/**
 *@author Emily Allen
 * @desc This is the main block
 *date: 9/28/20
 * @param emp1 holds employee's 1 information
 * @param emp2 holds employee's 2 information
 * @param emp3 holds employee's 3 information
 *
 */

fun main(){
    val emp1 = Employee("Rosella", "Valentine", position = PositionTitle.SECRETARIAL, true,
            28.00, 1, "May 5, 2019")
    val emp2 = Employee("Leon", "Pendragon", position = PositionTitle.SALES, false,
            26.00, 2, "December 10, 2019")
    val emp3 = Employee("Julia", "Stonr", position = PositionTitle.TECHNICAL, false,
            22.00, 3, "June 5, 2020")

    emp1.printAll()
    emp1.calculate(45)
    println("\n")
    emp2.printAll()
    emp2.calculate(50)
    println("\n")
    emp3.printAll()
    emp3.calculate(35);
}
