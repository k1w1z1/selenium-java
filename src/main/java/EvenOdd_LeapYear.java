public class EvenOdd_LeapYear {
    // Write method to get the Integer, and return whether the number is even or odd
    public static void main(String[] args) {
        int number = 10;
        String checkNumber = checkEvenOdd(number);
        System.out.println("Number " + number + " is " + checkNumber); // Even number

        // Write method to input year, and return whether the year is leap year or not
        int year = 2020;
        String checkYear = checkLeapYear(year);
        System.out.println("Year " + year + " is " + checkYear); // Leap year

        // Write method to throw exception if the year is negative
        System.out.println(isLeapYear(-2025));
    }
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String checkLeapYear(int year) {
        if (year % 4 == 0) {
            return "Leap year";
        } else {
            return "NOT leap year";
        }
    }

    // Leap year can be divided by 4, but not by 100, except it can be divided by 400
    public static boolean isLeapYear(int year) {
        if (year < 0) {
            throw  new IllegalAccessError("Year MUST be greater than 0!!!");
        }
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
