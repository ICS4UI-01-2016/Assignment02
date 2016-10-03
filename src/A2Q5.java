/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q5 {

    public String binaryConvert(int N) {

        String num = new String();

        if (N % 2 == 0) {
            num = ("0");
        } else if (N % 2 == 1) {
            num = ("1");
        }

        if (N == 1) {
            return num;
        }

        return binaryConvert(N / 2) + num;

    }

    public static void main(String[] args) {
    
        A2Q5 num2 = new A2Q5();
        String num3 = num2.binaryConvert(13);
        System.out.println(num3);
    
    }
}
