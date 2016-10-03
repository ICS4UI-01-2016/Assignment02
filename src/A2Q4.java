/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q4 {

    public int hailstone(int N) {

        System.out.println(N);

        if (N == 1) {
            return N;
        }
        
        if (N % 2 == 0) {
            return hailstone(N / 2);
        } else {
            return hailstone(3 * N + 1);
        }
    }
    
    public static void main(String[] args) {
        
        A2Q4 num = new A2Q4();
        int num2 = num.hailstone(12);
        System.out.println(num2);
        
    }
}
