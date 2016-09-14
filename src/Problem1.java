
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
        System.out.println("Q4 " + test.Hailstone(5));
        
        //output A5
    }
}
