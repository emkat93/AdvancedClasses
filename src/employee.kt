import java.text.DecimalFormat

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
 * mod
 * updated 9/29/20
 * added spaces in the println to separate the words
 * Got rid of startDate
 * Added more to the calculate function (Now that I know what to do)
 * Simplified the println to look nicer
 */
class Employee constructor(var firstName: String,
                           var lastName: String,
                           var position: String,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int,

){

    fun printAll(){
        println(firstName + " " + lastName + "\nPosition: " + position + " is " + salary
        + " shift: " + shift + "\nRate of pay: " + payRate + " per hour")
    }

    fun calculate(hoursIn: Double){
        val twoDigits = DecimalFormat("###,###,###.00")

        if (!salary){
            var OverTimeHR = 0.00
            if (OverTimeHR > 40)
                OverTimeHR = hoursIn - 40

            var totalPay = (hoursIn * payRate) + (OverTimeHR * (payRate + payRate/2))
            if (shift == 2)
                totalPay += (totalPay * 0.05)
            else if (shift == 3)
                totalPay = totalPay + (totalPay * 0.10)

            var formattedPay = twoDigits.format(totalPay)

            println("$firstName $lastName earned $$formattedPay this week")

        }
        else{
            var salaryPay = (hoursIn * payRate)
            var formattedSalaryPay = twoDigits.format(salaryPay)

            println("$firstName $lastName earned $$formattedSalaryPay this week")
        }


    }
}