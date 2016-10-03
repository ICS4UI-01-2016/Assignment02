
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Problem1 {

    public int digitalSum(int number){
    if(number < 10){
            return number;
        }
    return number%10 + digitalSum(number/10);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Problem1 tests = new Problem1();
        System.out.println(tests.digitalSum(9999));
    }
}
