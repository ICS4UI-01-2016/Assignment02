/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q2 {

    public int digitalRoot(int N) {

        if (N >= 0 && N <= 9) {
            return N;
        }

        int F = N % 10;

        int B = N / 10;

        int C = (B) + (F);

        int P = C % 10;

        int D = C / 10;

        return digitalRoot(D) + (P);

    }

    public static void main(String[] args) {

        A2Q2 nums = new A2Q2();
        int num = nums.digitalRoot(2019123);
        System.out.println(num);

    }
}
