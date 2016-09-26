/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

/**
 *
 * @author fostp4040
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static String convert(int n, int b) {
        //A blank string that is used to add number to (you can not add a string to int so this does it)
        String word = "";

        //base case: returns the word once n = 1 
        if (n == 1) {
            word = "" + n % b;
            return word;
        }
        //When the base is higher than n
        if (n < b) {
            //if number = 10, prints out A as replacement
            if (n == 10) {
                word = "A";
                //if number = 10, prints out A as replacement
            } else if (n == 11) {
                word = "B";
                //if number = 10, prints out A as replacement
            } else if (n == 12) {
                word = "C";
                //if number = 10, prints out A as replacement
            } else if (n == 13) {
                return "D";
                //if number = 10, prints out A as replacement
            } else if (n == 14) {
                return "E";
                //if number > or equal to 15, prints out F as replacement
            } else if (n >= 15) {
                return "F";
            }
            //If the user inputs a number less than base, return the number.
            if (n < b) {
                return "" + n;
            }
        }
        //if number = base then it returns 0 
        if (n == b) {
            return "0";
            //if remainder is less than 10, prints it
        } else if (n % b < 10) {
            word = "" + n % b;
            //if remainder is 10, prints A as replacement
        } else if (n % b == 10) {
            word = "A";
            //if remainder is 11, prints B as replacement
        } else if (n % b == 11) {
            word = "B";
            //if remainder is 12, prints C as replacement
        } else if (n % b == 12) {
            word = "C";
            //if remainder is 13, prints D as replacement
        } else if (n % b == 13) {
            word = "D";
            //if remainder is 14, prints E as replacement
        } else if (n % b == 14) {
            word = "E";
            //if remainder is 15 and above, prints F as replacement
        } else if (n % b >= 15) {
            word = "F";
        }

        //divides number by the base and keeps base constant, then prints the results from above
        return convert(n / b, b) + word;

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Problem6 test=new Problem6();
        test.convert(156,8);
        System.out.println(test.convert(156,8));
    }
}
