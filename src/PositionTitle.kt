/**
 * @author Emily Allen
 * @class This is the Enum class called PositionTitle
 * date 9/28/20
 * This class holds the position of the employee
 * mod
 * updated 9/29/20
 * added var namePosition
 * defined the var namePosition for the options
 */
enum class PositionTitle (var namePosition: String) {
    ADMINISTRATION ("Administration"),
    PRODUCTION ("Production"),
    SALES ("Sales"),
    MAINTENANCE ("Maintenance"),
    TECHNICAL ("Technical"),
    SECRETARIAL ("Secretarial");
}