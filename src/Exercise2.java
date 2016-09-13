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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        // Add a new method (Allows us to use antyhing within a class)
        Exercise2 test = new Exercise2();
        // Print our the user's answer
        System.out.println(test.digitalSum(126));
    }
}
