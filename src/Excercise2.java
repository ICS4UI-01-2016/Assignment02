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
    // add the sum of the number entered
    public int digitalSum(int n) {
        // base case
        if (n <= 9) {
            return n;
        }
        // recursive part
        return digitalSum(n / 10) + digitalSum(n % 10);
    }

    // Problem 2
    public int digitalRoot(int n) {
        // base case
        if (n <= 9) {
            return n;
        }
        // recursive part
        return digitalSum(digitalSum(n / 10) + digitalSum(n % 10));
    }

    // Problem 3
    public int triangle(int n) {
        // base case
        if (n <= 1) {
            return n;
        }
        // recursive part

        return n + triangle(n - 1);
    }

    // Problem 4
    public void hailstone(int n) {
        System.out.println(n);
        if (n == 1) { // so no infinite loop
            System.out.print("");
        } else if (n % 2 == 0 & n > 1) { //if even
            hailstone(n / 2);
        } else { // if odd
            hailstone(3 * n + 1);
        }
    }

    // Problem 5
    public String binaryConvert(int n) {
        int q = n / 2;
        int r = n % 2;

        // base case
        if (q == 0) {
            return Integer.toString(r);
        } else {
            return binaryConvert(q) + Integer.toString(r);
        }
    }

    // Problem 6
    public String convert(int n, int b) {
        int q = n / b;
        int r = n % b;

        // base case
        if (q == 0) {
            return Integer.toString(r);
        } else {
            return convert(q, b) + Integer.toString(r);
        }
    }

    //Problem 7
    public boolean isPalindrome(String s, int length) {
        if (length < 2) {
            return true;
        }
        if (s.charAt(0) != s.charAt(length - 1)) {
            return false;
        }
        return isPalindrome(s.substring(length - length + 1, length - 1), length - 2);
    }

    // Problem 8
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the methods
        Excercise2 test = new Excercise2();
        System.out.println("DigitalSum:");
        System.out.println(test.digitalSum(456));
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
        System.out.println("Convert: ");
        System.out.println(test.convert(1000, 8));
        System.out.println("IsPalindrome:");
        System.out.println(test.isPalindrome("radar", 5));

    }
}
