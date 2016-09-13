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

    public int digitalSum(int n) {
        int sum = 0;
        if (n >= 0 || n <= 9) {
            return n;
        }
        if (n > 9) {
            sum = sum + n % 10 ;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
