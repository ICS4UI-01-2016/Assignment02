
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
    //digsum method
    public int digSum(int number){
        //only one digit. just send that
        if(number<10){
            return number;
        }
        //more than one digit
        //add the first digit to the rest
        return (number%10) + digSum(number/10);
    }
    
    public int digRoot(int number){
        //do digsum
        number = digSum(number);
        //if more then one digit do again
        if(number>10){
            number = digRoot(number);
        }
        //whe only one digit; return
        return number;
    }
    
    public int triangle(int n){
        //if number is one; therfor no more triangle; send number
        if(n == 1){
            return n;
        }
        //if not 1; add number to number -1
        return n + triangle(n-1);
    }
    
    public void hailstone(int n){
        if(n==1){
            //if one; print and stop
            System.out.println(n);
        }else if(n%2==1){
            //if odd; print and continue
            System.out.println(n);
            hailstone((n*3)+1);
        }else{
            //if even; print and continue
            System.out.println(n);
            hailstone(n/2);
        }
    }
    
    public String binaryConvert(int n){
        //if number is 1 or 0; therfor done; return and stop
        if(n==1){
            return "1";
        }else if(n==0){
            return "0";
        }
        //if not; find what digit and continue
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
        //if number less then base; therefore done; return and end
        if(n<b){
            return letterCheck(n);
        }
        //find first digit and do agian
        return convert(n/b,b) + letterCheck(n%b);
    }
    
    public static void main(String[] args) {
        Methods test = new Methods();
        Scanner in = new Scanner(System.in);
        System.out.println(test.convert(in.nextInt(),in.nextInt()));
    }
}
