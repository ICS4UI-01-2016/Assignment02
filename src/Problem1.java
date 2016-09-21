
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

        int stone = n;

        if (n % 2 == 1) {
            stone = 3 * n + 1;
        } else {
            stone = n / 2;
        }
        System.out.println(n);
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
        }else if(n==0){
            return "";
        }
        
        String digits = "";
        if (n % b < 10) {
            int result = n % b;
            digits = String.valueOf(result);
        } else if (n % b == 10) {
            digits = "A";
        } else if (n % b == 11) {
            digits = "B";
        } else if (n % b == 12) {
            digits = "C";
        } else if (n % b == 13) {
            digits = "D";
        } else if (n % b == 14) {
            digits = "E";
        } else if (n % b == 15) {
            digits = "F";
        }
        
        //remove last int so next digit can be converted
        n = n / b;
        
        //return method
        return convert(n, b) + digits;

    }

    public boolean isPalindrome(String s, int length) {

        StringBuilder sBuilder = new StringBuilder(s);
        if (length == 1 || s == "") {
            return true;
        }

        //length of word or number
        if (sBuilder.charAt(0) == sBuilder.charAt(length - 1)) {
            sBuilder.deleteCharAt(length - 1);
            sBuilder.deleteCharAt(0);
            return isPalindrome(sBuilder.toString(), length - 2);

        } else {
            return false;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem1 test = new Problem1();
        //output A1
        System.out.println("Q1 " + test.digitalSum(126));

        //output A2
        System.out.println("Q2 " + test.digitalRoot(126));

        //output A3
        System.out.println("Q3 " + test.triangle(3));

        //output A4
        System.out.println("Q4:");
        System.out.println(test.Hailstone(5));
        System.out.println("Q4 done.");

        //output A5
        System.out.println("Q5:");
        System.out.println(test.binaryConvert(156));

        //output A6
        System.out.println("Q6 " +test.convert(1000, 16));

        //output A7
        System.out.println("Q7 " + test.isPalindrome("racecar", 7));
    }
}
