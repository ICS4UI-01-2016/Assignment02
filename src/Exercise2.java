/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    
    public int digitalSum(int n){
        if(n <= 10){
            return n;
        }
        return digitalSum(n / 10) + digitalSum(n % 10);
    }
    
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println(test.digitalSum(126));
    }
}
