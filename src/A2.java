/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A2 {

    public int digitalSum(int n) {
        // if a single digit number is entered        
        if (n <= 9) {
            if (n >= 0 && n <= 9) {
                return n;
            }
        }

        // if a mulitple-digit number is entered
        // stores last number
        int mod = n % 10;
        // everything but the last number
        int divide = n / 10;
        // repeat progress with the value of 'divide'
        return mod + digitalSum(divide);
    }

    public int digitalRoot(int n) {
        // if a single digit number is entered
        if (n >= 0 && n <= 9) {
            return n;
        }

        return digitalRoot(digitalSum(n));
    }

    public int triangle(int n) {
        if (n == 0) {
            return n;
        }
        // minus per row
        int subsum = n;
        // keeps track of total amount of blocks in triangle
        int total = n - 1;

        return subsum + triangle(total);
    }

    public int Hailstone(int n) {
        // the output after the math
        int total = n;

        if (total == 1) {
            return total;
        }
        // even
        if (n % 2 == 0) {
            total = (n / 2);
        }
        // odd
        if (n % 2 == 1) {
            total = (3 * n + 1);
        }
        System.out.println(n);
        return Hailstone(total);
    }

    public int binaryConvert(int n){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A2 test = new A2();

        // Q1
        System.out.println("Q1: " + test.digitalSum(1999));

        // Q2
        System.out.println("Q2: " + test.digitalRoot(1999));

        // Q3
        System.out.println("Q3: " + test.triangle(3));

        // Q4
        System.out.println("Q4: " + test.Hailstone(5));
        
        // Q5
        System.out.println("Q5: " + test.binaryConvert(156));
    }
}
