/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public String binaryCovert(int n){
        
        
        String word = "";
        //divide number in half
       
        if(n%2==1){
            word = "1";
        }else if(n%2==0){
            word = "0";
        }
        if(n/2==1){
            word = "1";
           return word;
        }
        
        
        return binaryCovert(n/2) + word;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem5 test=new Problem5();
        test.binaryCovert(156);
        System.out.println(test.binaryCovert(156));
    }
}
