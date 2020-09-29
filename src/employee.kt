/**
 *@author Emily Allen
 * @desc This is the employee class
 * date: 9/28/20
 * @constructor This constructs the employee class's variables and holds them
 * @param firstName describes the employee's first name
 * @param lastName describes the employee's last name
 * @param position describes the employee's position
 * @param salary holds the employee's salary
 * @param payRate holds the employee's pay rate
 * @param shift describes the employee's shift
 * @param startDate describes the employee's start date
 * printAll prints out information in a nice format
 */
class Employee constructor(var firstName: String,
                           var lastName: String,
                           var position: String,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int,
                           var startDate: String

){
    fun calculate(payRate: Double){
        val twoDigits = DecimalFormat("###,###,###.00")
        var hoursIn: Double
        




    }
    fun printAll(){
        println(firstName + " " + lastName + "\nPosition: " + position + "is" + salary
        + "shift: " + shift + "\nRate of pay:" + payRate + "per hour" + "\n" + firstName + " "
                + lastName + "earned" + hoursIn + "for this week" + "\n" + firstName + " " +
        lastName + "starts working on " + startDate)
    }
}