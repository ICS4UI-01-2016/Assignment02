
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number please.");
        int n = in.nextInt();
        Exercise2 test = new Exercise2();
        int answer = digitalSum(n);
        System.out.println("Answer here boi: " + answer);
        int answer2 = digitalSum(answer);
        System.out.println("answer for second question " + answer2);
        
        System.out.println("triangle answer " + test.triangle(4));
     
        
    }
    public static int digitalSum(int n){
     if(n <= 9){
         return n;
     }
     return digitalSum(n/10) + digitalSum(n%10);
    }
    public int triangle(int n){
        if(n == 1|| n == 0){
            return 1;
        }
        return triangle(n-1) + triangle(n-2);
    }
    

  
}
