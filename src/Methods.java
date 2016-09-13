
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    
    public int digSum(int number){
        if(number<10){
            return number;
        }
        return (number%10) + digSum(number/10);
    }
    
    public int digRoot(int number){
        number = digSum(number);
        if(number>10){
            number = digRoot(number);
        }
        return number;
    }
    
    public int triangle(int n){
        if(n == 1){
            return n;
        }
        return n + triangle(n-1);
    }
    
    public void hailstone(int n){
        if(n==1){
            System.out.println(n);
        }else if(n%2==1){
            System.out.println(n);
            hailstone((n*3)+1);
        }else{
            System.out.println(n);
            hailstone(n/2);
        }
    }
    
    public static void main(String[] args) {
        Methods test = new Methods();
        Scanner in = new Scanner(System.in);
        test.hailstone(in.nextInt());
    }
}
