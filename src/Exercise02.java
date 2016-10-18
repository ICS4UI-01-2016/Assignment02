
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Exercise02 {

    public static void main(String[] args) {

        // Method used to return the result 
        Exercise02 test = new Exercise02();

        // create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("The Sum of the Number you entered is: " + test.digitalSum(126));
        System.out.println("The Digital root is: " + test.digitalRoot(9656));
        System.out.println("The Total number of Blocks is: " + test.triangle(3));
        test.hailstone(5);
        System.out.println("The binary conversion numbers are: " + test.binaryConvert(156));
        System.out.println("The Number Converted is: " + convert(1000, 16));
        System.out.println("The word entered is: " + test.isPalindrome("racecar", 7));

    }

// Problem 1 DigitalSum 
    // Making a method called digital sum
    public int digitalSum(int number) {

        // If the number is less than or equal to 9 than ouput the same number 
        if (number <= 9) {
            return number;
        }

        // If number is not less than or equal to 9 than split the digits and add them 
        return digitalSum(number % 10) + digitalSum(number / 10);
    }

// Problem 2 DigitalRoot 
    // Making a method called digital root 
    public int digitalRoot(int number) {

        // Used method from problem one to sum up the digits of the number
        int sumDigit = digitalSum(number);

        // If the sum of the number is one digit  
        if (sumDigit <= 9) {

            // Return the sum of the digit 
            return sumDigit;
        }

        // Return the number that is the correct root
        return digitalRoot(sumDigit);

    }

// Problem 3 Triangle
    // Making a method called triangle
    public int triangle(int number) {

        // If the number equals 1 or 0 than output the same number of blocks
        if (number == 0 || number == 1) {
            return number;
        }

        // Take the number inputed by user and use method to find total number blocks
        return number + triangle(number - 1);
    }

// Problem 4 Hailstone
    // Making a method called hailstone 
    public void hailstone(int number) {

        // Output a number 
        System.out.println(number);

        // If the user inputed a number that is not 1 
        if (number != 1) {

            // The number the user inputed is a Even number
            if (number % 2 == 0) {

                // Divide the Even number by 2 using hailstone method
                hailstone(number / 2);
            } else {

                // If the user inputed a number that is 1
                if (number % 2 == 1) {

                    // The number inputed is odd and follows the formula below
                    hailstone((3 * number) + 1);
                }
            }
        }
    }

// Problem 5 Binary Converter
    // Making a method called binary convert  
    public String binaryConvert(int number) {

        // If the user inputed a number that equals to 1, output 1
        if (number == 1) {
            return "1";
        }

        // If the user inputed a number that equals to 0, output 0
        if (number == 0) {
            return "0";
        }

        // Allows the user to divide the number by 2 and determine if remainder is 0 
        if (number % 2 == 0) {

            // Use binary convert method to output 0 if number is even
            return binaryConvert(number / 2) + "0";

        } else {

            // Otherwise use binary convert method to output 1 if number is odd
            return binaryConvert(number / 2) + "1";
        }

    }

// Problem 6 convert
    // Making a method called convert 
    static String convert(int number, int base) {

        // If the number inputed by the user is smaller than the base inputed 
        if (number < base) {
            // If the number is less than 10, return the number
            if (number < 10) {
                return "" + number;
                // If the number is equal to 10, A is outputed  
            } else if (number == 10) {
                return "A";
                // If the number is equal to 11, B is outputed 
            } else if (number == 11) {
                return "B";
                // If the number is equal to 12, C is outputed 
            } else if (number == 12) {
                return "C";
                // If the number is equal to 13, D is outputed 
            } else if (number == 13) {
                return "D";
                // If the number is equal to 14, E is outputed 
            } else if (number == 14) {
                return "E";
                // If the number is not equal to any of the following, F is outputed  
            } else {
                return "F";
            }
        }

        // If the remainder is less than 10, return the remainder
        if (number % base < 10) {
            return convert(number / base, base) + number % base;
        }
        // If the remainder is equal to 10, A outputed 
        if (number % base == 10) {
            return convert(number / base, base) + "A";
        }
        // If the remainder is equal to 11, B outputed 
        if (number % base == 11) {
            return convert(number / base, base) + "B";
        }
        // If the remainder is equal to 12, C outputed 
        if (number % base == 12) {
            return convert(number / base, base) + "C";
        }
        // If the remainder is equal to 13, D outputed 
        if (number % base == 13) {
            return convert(number / base, base) + "D";
        }
        // If the remainder is equal to 14, E outputed 
        if (number % base == 14) {
            return convert(number / base, base) + "E";
            // If the number is not equal to any of the following, F is outputed  
        } else {
            return convert(number / base, base) + "F";
        }
    }

// Problem 6 Palindrome
    // Making a method called isPalindrome
    public boolean isPalindrome(String str, int wordlength) {

        // If the word has one letter
        if (wordlength == 1) {

            // Return true
            return true;
        }
        // If first and last letter are the same 
        if (str.charAt(0) == str.charAt(wordlength - 1)) {

            // Return because the words were searched through in order to find similar letters 
            return isPalindrome(str.substring(1), (wordlength - 2));

        } else {

            // Return false if the first and last words are not the same 
            return false;
        }
    }
}
