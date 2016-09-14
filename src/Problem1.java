
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    
    public static int digitalSum(int n){
        //base case if n is 1 didit(smaller than 10)
            if(n <10){
                //return 1
                return n;
            }
            //remove the right most digit added to the right most digit of the same integer
            return digitalSum(n/10) + digitalSum(n%10);
            
                
        }
    
    public static int digitalRoot(int n){
        //base case if n is 1 didit(smaller than 10)
        int i = digitalSum(n);
            if(i <10){
                
                //return 1
                return i;
                
            }
            //remove the right most digit added to the right most digit of the same integer
            return digitalRoot(i);
            
                
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Problem1 test = new Problem1();
//calling digitalSum method 
        System.out.println("Please enter a number");
        int number = in.nextInt();
        int answer1 = digitalSum(number);
        int answer2 = digitalRoot(answer1);
        
        System.out.println("Answer #1 " + answer1);
        System.out.println("Answer #2 " + answer2);
        
    }

}