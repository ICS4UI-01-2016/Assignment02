/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q6 {

    public String convert(int n, int b) {

        String word = new String();

        if (n % b == 0) {
            word = "0";
        }

        if (n % b == 1) {
            word = "1";
        }

        if (n % b == 2) {
            word = "2";
        }

        if (n % b == 3) {
            word = "3";
        }

        if (n % b == 4) {
            word = "4";
        }

        if (n % b == 5) {
            word = "5";
        }

        if (n % b == 6) {
            word = "6";
        }

        if (n % b == 7) {
            word = "7";
        }

        if (n % b == 8) {
            word = "8";
        }

        if (n % b == 9) {
            word = "9";
        }

        if (n % b == 10) {
            word = "A";
        }

        if (n % b == 11) {
            word = "B";
        }

        if (n % b == 12) {
            word = "C";
        }

        if (n % b == 13) {
            word = "D";
        }

        if (n % b == 14) {
            word = "E";
        }

        if (n % b == 15) {
            word = "F";
        }

        if (n / b == 0) {

            return word;
        }

        return convert(n / b, b) + word;

    }

    public static void main(String[] args) {
        
        A2Q6 num = new A2Q6();
        System.out.println(num.convert(1000, 16));

    }
}
