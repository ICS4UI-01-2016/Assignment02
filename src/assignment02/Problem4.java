/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public void hailstone(int n){
        //check if n is even or odd
        if(3*n+1==1||n/2==1){
             //stop when n equals 1
             System.out.println(1);
        }
        if(n%2==1&&n>1){
             //multiply n by 3 then add it by one if odd
             System.out.println(3*n+1);
             hailstone(3*n+1);
         }else if(n%2==0&&n>1){
             //divide in half if even
              System.out.println(n/2);
              hailstone(n/2);
         }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem4 test=new Problem4();
        test.hailstone(5);
    }
}
