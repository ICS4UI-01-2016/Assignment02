/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Excercise2 {

    // Problem 1
    public int digitalSum(int n) {
        // base case - when n is less than 10 return n
        if (n <= 9) {
            return n;
        } // recursive part - remove the last digit and add the rest to the last digit
        return digitalSum(n / 10) + (n % 10);
    }

    // Problem 2
    public int digitalRoot(int n) {
        // base case - when n is less than 10 return n
        if (n <= 9) {
            return n;
        } // recursive part - remove the last digit and add the rest to the last digit and multiply the whole thing
        return digitalSum(digitalSum(n / 10) + (n % 10));
    }

    // Problem 3
    public int triangle(int n) {
        // base case - when n is less than or equal to 1 return n
        if (n <= 1) {
            return n;
        } // return n and use recursion to add 1 less than n
        return n + triangle(n - 1);
    }

    // Problem 4
    public void hailstone(int n) {
        // print n to the screen
        System.out.println(n);
        // base case - when n equals 1 end by printing a space to the screen
        if (n == 1) {
            System.out.print("");
            // if n is even use recursion to divide n by 2
        } else if (n % 2 == 0) {
            hailstone(n / 2);
            // if n is odd use recursion to divide n by 3 and add 1 
        } else {
            hailstone(3 * n + 1);
        }
    }

    // Problem 5
    public String binaryConvert(int n) {
        // base case - if n / 2 = 0 then return the remainder, add to the string and end
        if ((n / 2) == 0) {
            return Integer.toString(n % 2);
        } else { // recurssion part - else keep dividing by 2 and adding the reminders to a string
            return binaryConvert(n / 2) + Integer.toString(n % 2);
        }
    }

    // for method convert
    // method that turns the base into a letter if it is bigger than 9
    public String letters(int b) {
        // if the number is 10 then return A
        if (b == 10) {
            return "A";
        } // if the number is 11 then return B
        if (b == 11) {
            return "B";
        } // if the number is 12 then return C
        if (b == 12) {
            return "C";
        } // if the number is 13 then return D
        if (b == 13) {
            return "D";
        } // if the number is 14 then return E
        if (b == 14) {
            return "E";
        } // if the number is 15 then return F
        if (b == 15) {
            return "F";
        } // else return b as a string 
        return Integer.toString(b);
    }

    // Problem 6
    public String convert(int n, int b) {
        // base case - if n divided by the base equals 0 then return n % b as a string
        if ((n / b) == 0) {
            return Integer.toString(n % b);
        } else { // use recurssion to return n divided by b plus letters method with n % b
            return convert(n / b, b) + letters(n % b);
        }
    }

    //Problem 7
    public boolean isPalindrome(String s, int length) {
        // base case - if we get to the middle of the word and it is equal return true
        if (length < 2) {
            return true;
        } // if the 1st character is not equal to the last character return false
        if (s.charAt(0) != s.charAt(length - 1)) {
            return false;
        } // use recurssion to run theh method with the string minus the first and last characters
        return isPalindrome(s.substring(length - length + 1, length - 1), length - 2);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the methods
        Excercise2 test = new Excercise2();
        System.out.println("DigitalSum:");
        System.out.println(test.digitalSum(45946));
        System.out.println("DigitalRoot:");
        System.out.println(test.digitalRoot(4325));
        System.out.println("Triangle:");
        System.out.println(test.triangle(4));
        System.out.println("DigitalRoot:");
        System.out.println(test.digitalRoot(4325));
        System.out.println("Triangle:");
        System.out.println(test.triangle(4));
        System.out.println("Hailstone:");
        test.hailstone(12);
        System.out.println("BinaryConvert:");
        System.out.println(test.binaryConvert(156));
        System.out.println("Convert:");
        System.out.println(test.convert(1000, 16));
        System.out.println("IsPalindrome:");
        System.out.println(test.isPalindrome("radar", 5));
    }
}
