
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
    
    public String binaryConvert(int n){
        if(n==1){
            return "1";
        }else if(n==0){
            return "0";
        }
        if(n%2==0){
            return binaryConvert(n/2) + "0";
        }else{
            return binaryConvert(n/2) + "1";
        }
    }
    
    public String letterCheck(int n){
        if(n==10){
            return "a";
        }else if(n==11){
            return "b";
        }else if(n==12){
            return "c";
        }else if(n==13){
            return "d";
        }else if(n==14){
            return "e";
        }else if(n==15){
            return "f";
        }
        return "" + n;
        
    }
    
    public String convert(int n, int b){
        if(n<b){
            return letterCheck(n);
        }
        return convert(n/b,b) + letterCheck(n%b);
    }
    
    public int mar(int size, int[] balls){
        if(size < balls[0]){
            return 0;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        Methods test = new Methods();
        Scanner in = new Scanner(System.in);
        System.out.println(test.convert(in.nextInt(),in.nextInt()));
    }
}
