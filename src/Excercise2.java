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
        if (n >= 0 || n <= 9) {
            return n;
        }
        int last = last + n % 10;
        n = n / 10;
        return digitalSum + last;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Excercise2 test = new Excercise2();
        System.out.println(test.digitalSum(18));
    }
}