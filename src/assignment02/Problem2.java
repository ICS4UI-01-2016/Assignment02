/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public int digitalRoot(int n){
        //seperate the first digit
        int dig1 = n%10;
        //seperate the second digit
        int dig2 = n/10%10;
        //seperate the third digit
        int dig3 = n/10/10;
        //add up the digits
        int dig = dig1+dig2+dig3;
        //seperate the new number's digits
        int dig4 = dig%10;
        int dig5 = dig/10%10;
        int dig6 = dig/10/10;
        //add all the new digits
        return dig4+dig5+dig6;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem2 test=new Problem2();
        System.out.println(test.digitalRoot(49));
    }
}
