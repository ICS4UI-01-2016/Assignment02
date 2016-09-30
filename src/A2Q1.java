/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q1{

public int digitalSum(int N) {

    if (N >= 0 && N <= 9){
        return N;
    }
    int F = N % 10;
    
    int B = N / 10;
     
    return digitalSum(B) + (F);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       A2Q1 nums = new A2Q1(); 
       int num = nums.digitalSum(126);
       System.out.println(num); 
    }
}
