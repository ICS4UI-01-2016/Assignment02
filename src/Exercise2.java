/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    
    public int digitalSum(int n){
        if(n < 10){
            return n;
        } else {
            return digitalSum(n / 10) + (n % 10);
        }
    }
    
    public int digitalRoot(int n){
        int sum = digitalSum(n);
        if(sum < 10){
            return sum;
        } else{
            return digitalRoot(sum);
        }
    }
    
    public int triangle(int n){
        if(n == 0){
            return n;
        } else{
            return triangle(n-1) + n;
        }
    }
    
    public int hailstone(int n){
        System.out.println(n);
        if(n <= 1){
            return n;
        } else{
            if((n % 2) == 0){
                return hailstone(n/2);
            } else{
                return hailstone(3*n+1);
            }
        }
    }
    
    public int binaryConvert(int n){
        if(n <= 1){
            return n;
        } else{
            System.out.print(n % 2);
            return binaryConvert(n / 2);
        }
    }
    
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println(test.digitalSum(126));
        System.out.println(test.digitalRoot(2019));
        System.out.println(test.triangle(4));
        test.hailstone(5);
        test.binaryConvert(156);
        
    }
}
