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
        return digitalSum(n / 10) + digitalSum(n % 10);
    }
    
    // Problem 2
    public int digitalRoot(int n){
        // add the digits of n
        // then add the digits of the sum of n and so on until 1 number is left
        if (n <= 9) {
            return n;
        } 
        return digitalSum(n / 10) + digitalSum(n % 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Excercise2 test = new Excercise2();
        System.out.println(test.digitalSum(456));
    }
}