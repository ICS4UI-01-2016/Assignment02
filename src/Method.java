
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Method {
    //this method creates the digital sum, eg. if the number is 999
    public int digitalSum(int number){
        if(number < 10){
                return number;
            }
        return number%10 + digitalSum(number/10);
    }
    
    public int digitalRoot(int number){
        number = digitalSum(number);
        if (digitalSum(number) < 9)
            {
                return digitalSum(number);
            }
        return number%10 + digitalSum(number/10);
    }
    
    public int triangle(int n){
        if (n == 0){
            return n;
        }else if (n == 1){
            return n;
        }
        return n + triangle(n-1);
    } 
    
    public void hailstone(int number){
        
        if (number == 1){
        } else if (number%2 == 0){
            System.out.println(number/2);
            hailstone(number/2);
        }else if (number%2 == 1){
            System.out.println(3*number+1);
            hailstone(3*number+1);
        }
    }
    
    public void binaryConvert(int n){
        if (n == 1){
        System.out.print(1);
        } else if(n%2 == 0){
            System.out.print(0);
            binaryConvert(n/2);
        } else if(n%2 == 1){
            System.out.print(1);
            binaryConvert(n/2);
        }
    } 
    
    public void convert(int n, int b){
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Method tests = new Method();
        tests.binaryConvert(7);
    }
}
