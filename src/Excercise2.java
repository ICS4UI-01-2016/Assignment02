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
            System.out.println(" ");
        } else if (n % 2 == 0) { //if even
            hailstone(n / 2);
        } else { // if odd
            hailstone(3 * n + 1);
        }
    }

    // Problem 5
    public String binaryConvert(int n){
        if(n / 2 == 0){
            System.out.println("1");
        }
        System.out.println(n % 2);
        return binaryConvert(n / 2);
    }
    
    // Problem 6
   /*public String convert(int n, int, b){
        
    }*/
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
        System.out.println("Hailstone:");
        test.hailstone(12);
        System.out.println("BinaryConvert:");
        System.out.println(test.binaryConvert(156));
    }
}
