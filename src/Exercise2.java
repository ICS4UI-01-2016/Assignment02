/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class Exercise2 {

    public int digitalSum(int n) {
        // Chopped off the left side, goes through the algorithem to find out each entered number, then adds to the one beside it
        // Base case
        if (n <= 9) {
            return n;
        }
        // Chop off the last digit, then the digit before and so on and then add all of them together
        return digitalSum(n / 10) + (n % 10);
    }

    public int digitalRoot(int n) {
        // Chopped off the left side, goes through the algorithem to find out each entered number, then adds to the one beside it
        int sum = digitalSum(n);
        // Base case (If it is a single digit)
        if (sum <= 9) {
            return sum;
        }
        // Run the new sum through digitalSum! Breaking it down and then adding the digits together withing the 2nd return in digitalSum
        return digitalRoot(sum);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        // Add a new method (Allows us to use antyhing within a class)
        Exercise2 test = new Exercise2();

        // Print our the user's answer (Question 1)
        System.out.println(test.digitalSum(0));

        // Print our the user's answer (Question 2)
        System.out.println(test.digitalRoot(1234567));

    }
}
