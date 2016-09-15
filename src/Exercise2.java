/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Exercise2 {

    public int digitalSum(int n) {
        if (n <= 9) {
            return n;
        }
        return digitalSum(n % 10) + digitalSum(n / 10);
    }

    public int digitalRoot(int n) {
        if (n <= 9) {
            return n;
        }
        n = digitalRoot(n % 10) + digitalRoot(n / 10);
        if (n > 9) {
            n = digitalRoot(n % 10) + digitalRoot(n / 10);
        }
        return n;
    }

    public int triangle(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        n = n + triangle(n - 1);
        return n;
    }

    public static void hailstone(int n) {
        System.out.println(n);
        if (n > 1) {
            if (n % 2 == 0) {
                hailstone(n / 2);               
            }
            if (n % 2 == 1) {
                hailstone(3 * n + 1);
            }
        }       
    }
    
    public static void binaryConvert(int n){
        if(n > 1){
            if(n%2==0){
                System.out.print("0");
                binaryConvert(n/2);
            }
            if(n%2==1){
                System.out.print("1");
                binaryConvert(n/2);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println("Digital Sum: " + test.digitalSum(473));
        System.out.println("Digital Root: " + test.digitalRoot(666));
        System.out.println("Number of Blocks: " + test.triangle(4));
        test.hailstone(17);   
        test.binaryConvert(56);
    }
}
