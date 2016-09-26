
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Exercise2 {

    public int digitalSum(int n) {
        //create digital sum method to add the digits of a number
        if (n >= 0 && n <= 10) {
            //if its a single digit
            return n;
            //if its a single digit return it because its the sum
        } else {
            return n % 10 + digitalSum(n / 10);
            //adding the last digit to the digital sum of whats remaining
        }

    }

    public int digitalRoot(int n) {
        //create digital root method continue running the digital sum through the digital sum loop until its down to 1 digit
        int r = digitalSum(n);
        //get the sum of the number entered
        if (r >= 0 && r <= 10) {
            //if its a single digit
            return r;
            //if its a single digit return it because its the sum
        } else {
            return digitalSum(r);
            //if the sum wasn't 1 digit run it through again to get 1 digit
        }

    }

    public int triangle(int n) {
        //create method to find the number of blocks in a pyramid with n number of rows
        if (n == 0) {
            return 0;
            //if 0 rows return 0 blocks
        } else {
            return n + triangle(n - 1);
            //if more than 0 rows return the row number + all the other rows added 
        }
    }

    public int hailstone(int n) {
        //create a method to output a hailstone number pattern
        System.out.println(n);
        //output number
        if (n != 1) {
            if (n % 2 == 1) {
                return hailstone(3 * n + 1);
                //if n isn't 1 and is odd return the multiplication for the number numbers
            } else {
                return hailstone(n / 2);
                //if n is even return n divided by 2
            }
        } else {
            return n;
            //if n is 1 return 1 
        }
    }

    public String binaryConvert(int n) {
        //create method to convert a number to a binary string
        String binary = "";
        //create a string to store the binary
        if (n % 2 == 1) {
            binary = "1";
            //if n/2 has a remainder of 2 add a 1 to the string
        }
        if (n % 2 == 0) {
            binary = "0";
            //if n/2 has a remainder of 0 add a 0 to the string
        }
        if (n == 1) {
            return binary;
            //if n = 1 reurn a 1
        }
        return binaryConvert(n / 2) + binary;
        //send the n/2 back to the method until it's 1 and add the number onto the string

    }

    public String convert(int n, int b) {
        String conv = "";
        //create a method to convert, and a string to store the conversion in
        if (n % b == 0) {
            conv = "0";
        }
        //if the remainder is 0 store 0 in variable
        if (n % b == 1) {
            conv = "1";
        }
        //if the remainder is 1 store 1 in variable
        if (n % b == 2) {
            conv = "2";
        }
        //if the remainder is 2 store 2 in variable
        if (n % b == 3) {
            conv = "3";
        }
        //if the remainder is 3 store 3 in variable
        if (n % b == 4) {
            conv = "4";
        }
        //if the remainder is 4 store 4 in variable
        if (n % b == 5) {
            conv = "5";
        }
        //if the remainder is 5 store 5 in variable
        if (n % b == 6) {
            conv = "6";
        }
        //if the remainder is 6 store 6 in variable
        if (n % b == 7) {
            conv = "7";
        }
        //if the remainder is 7 store 7 in variable
        if (n % b == 8) {
            conv = "8";
        }
        //if the remainder is 8 store 8 in variable
        if (n % b == 9) {
            conv = "9";
        }
        //if the remainder is 9 store 9 in variable
        if (n % b == 10) {
            conv = "A";
        }
        //if the remainder is 10 store A in variable
        if (n % b == 11) {
            conv = "B";
        }
        //if the remainder is 11 store B in variable
        if (n % b == 12) {
            conv = "C";
        }
        //if the remainder is 12 store C in variable
        if (n % b == 13) {
            conv = "D";
        }
        //if the remainder is 13 store D in variable
        if (n % b == 14) {
            conv = "E";
        }
        //if the remainder is 14 store E in variable
        if (n % b == 15) {
            conv = "F";
        }
        //if the remainder is 15 store F in variable
        if (n == 1) {
            return conv;
        }
        // if n equals one return the string
        if (n < b) {
            return "" + n;
        }
        //if the divend is less than the divisor return the divend and the string
        return convert(n / b, b) + conv;
        //return the divend after being divided, the divisor and the string(adding the number to the string)
    }

    public boolean isPalindrome(String s, int length) {
        //create a method to determine if a word is a palindrome
        boolean same;
        //create a boolean
        if (length <= 1) {
            same = true;
            return same;
            //if the word is or has been chopped down to 1 or less letters return true as 1 letter will always be the same or it has ran through the entire thing
        }


        if (s.charAt(0) == s.charAt(length - 1)) {
            //if the first and last letter are the same
            s = s.substring(1, length - 1);
            //chop off first and last letter
            return isPalindrome(s, s.length());
            //return the chopped word and the new length
        } else {
            return false;
            //if they aren't the same return false
        }


    }

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here\
        Exercise2 test = new Exercise2();
        Scanner input = new Scanner(System.in);
        //creating an object to call 
    }
}
