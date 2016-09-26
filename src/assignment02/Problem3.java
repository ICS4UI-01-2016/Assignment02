/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public int triangle(int n){
        if(n==0){
             return 0;
         }else if(n==1){
             return 1;
         }
        return (n+triangle(n-1));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem3 test=new Problem3();
        System.out.println(test.triangle(3));
    }
}
