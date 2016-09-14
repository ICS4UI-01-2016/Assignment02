/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public int digitalSum(int n){
        int dig1 = n%10;
        int dig2 = n/10%10;
        int dig3 = n/10/10;
         return dig1+dig2+dig3;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem1 test=new Problem1();
        System.out.println(test.digitalSum(126));
    }
}
