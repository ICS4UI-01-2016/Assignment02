
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A2 {

    /**
     * @param args the command line arguments
     */
    
    public static int digitalSum(int n){
        if(n <= 9){
            return n;
        }
      
        return digitalSum(n/10) + digitalSum(n%10); 
    }
    
    public static int digitalRoot(int n){
        if(n <= 9){
            return n;
        }     
        return digitalRoot(n/10) + digitalRoot(n%10);
        
    }
    
    public static int triangle(int q){
        if(q == 0 || q == 1){
            return q;
        }
        return q + triangle(q - 1);
    }
    
    public static int hailstone(int h){
        if(h < 0){
            return 0;
        }
        if(h == 1){
            return h;
        }
        if(h % 2 == 0){
            System.out.println(h);
           return hailstone(h = h / 2); 
        }else{
            System.out.println(h);
           return hailstone(h = 3*h+1);
        }
    }
    
    public static int binaryConvert(int b){
        if(b == 0||b == 1){
            return b;
        }
        
        return 0;
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        A2 test = new A2();
        
        
        System.out.println("Please enter a number for problem 1 and 2.");
        int n = input.nextInt();
        
        int answer1 = digitalSum(n);
        int answer2 = digitalRoot(answer1);
        System.out.println(answer2);
        
        System.out.println("Please enter a number for problem 3.");
        int q = input.nextInt();
        
        int triangle1 = triangle(q);
        System.out.println(triangle1);
        
        System.out.println("Please enter a number for problem 4.");
        int h = input.nextInt();
        
        int hailstone1 = hailstone(h);
        System.out.println(hailstone1);
        
        System.out.println("Please enter a number for problem 5.");
        int b = input.nextInt();
        
        
        
        
       

        
        
        
        
        
            
            
        
    }
}
