/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Fibinachi {

    public int fib(int n){
        if(n == 0| n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public int fact(int n){
        if (n == 0||n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibinachi tests = new Fibinachi();
        System.out.println(tests.fib(5));
        System.out.println(tests.fact(3));
    }
}
