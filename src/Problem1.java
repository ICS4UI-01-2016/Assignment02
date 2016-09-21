
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Problem1 {

    public int digitalSum(int n) {
        //return each single number that is entered
        if (n >= 0 && n <= 9) {
            return n;
        }

        //Store the last number
        int mod = n % 10;
        //Store the rest of the numbers except the rightmost number
        int divide = n / 10;
        //add each seperated number to get the sum of the whole number
        return mod + digitalSum(divide);

    }

    public int digitalRoot(int n) {
        //return each single number that is entered
        if (n >= 0 && n <= 9) {
            return n;
        }

        //Use the digitalSum method to loop it through digitalRoot until a single digit is obtained
        return digitalRoot(digitalSum(n));
    }

    public int triangle(int n) {
        //base case
        if (n == 0) {
            return n;
        }

        //row entered
        int tri = n;

        //the row before the row entered
        int rowBefore = n - 1;

        //add the row entered and sub one, then use the method until you have each row added
        return tri + triangle(rowBefore);
    }

    public int Hailstone(int n) {
        //base case
        if (n == 1) {
            return 1;
        }

        //create integer to manipulate if n is odd or even
        int stone = n;

        //if n is odd
        if (n % 2 == 1) {
            stone = 3 * n + 1;
        } else {
            //if n is even
            stone = n / 2;
        }
        //print out each number on its own line
        System.out.println(n);

        //return the manipulated numbers through the recursive method
        return Hailstone(stone);
    }

    public String binaryConvert(int n) {
        //base case
        if (n == 1) {
            return "1";
        } else if (n == 0) {
            return "0";
        }

        //create string for each number converted
        String part;

        //if num is even
        if (n % 2 == 0) {
            part = "0";
            //if num is odd
        } else {
            part = "1";
        }
        //remove that last int so the next num can be converted
        n = n / 2;

        //return recursion + num
        return binaryConvert(n) + part;
    }

    public String convert(int n, int b) {
        //base case
        if (n == 1) {
            return "1";
        } else if (n == 0) {
            return "";
        }

        //create string to hold the 'converted' numbers
        String digits = "";

        //if the number is less than 10, turn the int into a string
        if (n % b < 10) {
            int result = n % b;
            digits = String.valueOf(result);
            //if num equals 10 add 'A' to string
        } else if (n % b == 10) {
            digits = "A";
            //if num equals 11 add 'B' to string
        } else if (n % b == 11) {
            digits = "B";
            //if num equals 12 add 'C' to string
        } else if (n % b == 12) {
            digits = "C";
            //if num equals 13 add 'D' to string
        } else if (n % b == 13) {
            digits = "D";
            //if num equals 14 add 'E' to string
        } else if (n % b == 14) {
            digits = "E";
            //if num equals 15 add 'F' to string
        } else if (n % b == 15) {
            digits = "F";
        }

        //remove last int so next digit can be converted
        n = n / b;

        //return method
        return convert(n, b) + digits;

    }

    public boolean isPalindrome(String s, int length) {
        //create string builder to work with the word/string later on
        StringBuilder sBuilder = new StringBuilder(s);
        //base case
        if (length == 1 || s == "") {
            return true;
        }

        //if the first/last number are the same remove the first/last number
        if (sBuilder.charAt(0) == sBuilder.charAt(length - 1)) {
            sBuilder.deleteCharAt(length - 1);
            sBuilder.deleteCharAt(0);
            //return the method so that it recursively works through itself again until no letters remain
            return isPalindrome(sBuilder.toString(), length - 2);

        } else {
            //if the word can not be reversed
            return false;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem1 test = new Problem1();
        //Q1
        System.out.println("Q1 " + test.digitalSum(126));

        //Q2
        System.out.println("Q2 " + test.digitalRoot(126));

        //Q3
        System.out.println("Q3 " + test.triangle(3));

        //Q4
        System.out.println("Q4:");
        System.out.println(test.Hailstone(5));
        System.out.println("Q4 done.");

        //Q5
        System.out.println("Q5:");
        System.out.println(test.binaryConvert(156));

        //Q6
        System.out.println("Q6 " + test.convert(1000, 16));

        //Q7
        System.out.println("Q7 " + test.isPalindrome("racecar", 7));
    }
}
