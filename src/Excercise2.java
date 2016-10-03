/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class Excercise2 {
    //create digitalsum method

    public int digitalSum(int n) {
        //create base case to return n when it is a single digit
        if (n >= 0 && n <= 9) {
            return n;
        }
        // create integer of the rightmost digit of n
        int mod = n % 10;
        // create integer of n without the right most digit
        int divide = n / 10;
        //return the rightmost digit added to the new number which wll repeat
        return mod + digitalSum(divide);
    }
    // create digitalRoot method

    public int digitalRoot(int n) {
        //run the digitalSum method
        n = digitalSum(n);
        //return n once it is one digit
        if (n >= 0 && n <= 9) {
            return n;
        }
        //return the sum of the digital sum answer
        return digitalSum(digitalRoot(n));
    }

    //create Triangle Method
    public int triangle(int n) {
        //return n once it is 0
        if (n == 0) {
            return n;
        }
        //return n and add the row above 
        return n + triangle(n - 1);
    }
    //create hailstone method

    public void hailstone(int n) {
        //print out n
        System.out.println(n);
        //return n once it is one
        if (n == 1) {
            return;
        }
        //if n is even, divide it by 2
        if (n % 2 == 0) {
            hailstone(n / 2);
        } else {
            //if n is odd, multiply by 3 and add one
            hailstone(3 * n + 1);
        }
    }
    //create binaryCovert method

    public String binaryCovert(int n) {
        //create string to store 0's and 1's
        String binary = new String();

        //if n is even, add a 0 to the binary string
        if (n % 2 == 0) {
            binary = ("0");
            //if n is odd, add a 1 to the binary string
        } else if (n % 2 == 1) {
            binary = ("1");
        }
        //(basecase) if n is 1 then return it
        if (n == 1) {
            return binary;
        }
        //return n without the last int, and the binary string
        return binaryCovert(n / 2) + binary;
    }

    //create convert method
    public String convert(int n, int b) {
        //create new string to store numbers and letters
        String number = new String();
        //insert letters into an array
        String[] Alphabet = {"A", "B", "C", "D", "E", "F"};
        //check n converts into a number that is 10 
        if (n % b >= 10) {
            // add the proper letter from the array to the string
            number = number + Alphabet[n % b - 10];
            //if the number does not convert to a number over 10, then add the converted number to the stiring
        } else if (n % b >= 2 || n % b < 10) {
            number = number + n % b;
        }
        //once the number is 0 return it
        if (n / b == 0) {

            return number;

        }
        //return the divided number, the base integer, and the string
        return convert(n / b, b) + number;
    }
    
    //create boolean palindrome method
    public boolean isPalindrome(String s, int length) {
        //if the length of the word is 0 or 1, return as a palindrome
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        //if the first letter is the same as the last letter, remove both letters from string
        if (s.charAt(0) == s.charAt(length - 1)) {
             
            //return word without the letters, and the length
            return isPalindrome(s.substring(length), length);

        } else {
           //return the word as not a palindrome if the first and last letter arent the same
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Excercise2 test = new Excercise2();
        //test all the different methods
        System.out.println("Q1: " + test.digitalSum(4986));
        System.out.println("Q2: " + test.digitalRoot(1234));
        System.out.println("Q3: " + test.triangle(5));
        test.hailstone(5);
        System.out.println("Q5: " + test.binaryCovert(13));
        System.out.println("Q6: " + test.convert(1000, 8));
        System.out.println("Q7: " + test.isPalindrome("abba", 4));
    }
}
