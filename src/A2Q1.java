
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A2Q1 {

    public int digitalSum(int a) {
        // if the number is a single digit, just return the number
        if (a < 10) {
            return a;
        }
        // separate the digits of the number and add them together
        return digitalSum(a / 10) + digitalSum(a % 10);
    }

    public int digitalRoot(int a) {
        // using answer from the first problem, add the digits of the sum
        if (a < 10) {
            return a;
        }
        // return the sum of the sum
        return digitalSum(a / 10) + digitalSum(a % 10);
    }

    public int triangleBlocks(int b) {
        // if the row is one or zero, the amount of blocks is the same as the row
        if (b == 0 | b == 1) {
            return b;
        }
        // add the current row number to the amount of blocks in the previous row
        return b + triangleBlocks(b - 1);
    }

    public int hailstone(int c) {
        // if the number is 0 or 1, return the number
        if (c == 0 | c == 1) {
            return c;
        }
        // determine if the number is even
        // number is even if there is no remainder when divided by two
        if (c % 2 == 0) {
            System.out.println(c);
            return hailstone(c = c / 2);

        // if the number is not even, using the given formula (3c + 1)
        } else {           
            System.out.println(c);
            return hailstone(3 * c + 1);
        }
    }

    public int binaryConvert(int d) {
        // if the number is a 1 or 0, it is already in binary
        // return the number
        if (d == 0 | d == 1) {
            return d;
        } else {
            // print the remainder when divided by two
            System.out.println(d % 2);
            return binaryConvert(d / 2);
        }

    }
    public String convert(int e, int f) {
        // if the number is 0, return a blank
        if (e == 0) {
            return "";
            
        } else {
            // if the remainder of the number is greater than 10, activate letter method
            if ((e % f) >= 10 && e <= f) {
                return letter(e % f);
            }
            return convert(e / f, f) + letter(e % f);
        }
    } 
    
    public String letter(int e) {
        // if the number is 10, return A
        if (e == 10) {
            return "A";
        }
        if (e == 11) {
            return "B";
        }
        if (e == 12) {
            return "C";
        }
        if (e == 13) {
            return "D";
        }
        if (e == 14) {
            return "E";
        }
        if (e == 15) {
            return "F";
        }
        return "" + e;
    }

    public boolean isPalindrome(String g) {
        // if the length of the word is one or zero, it is a palindrome
        if (g.length() == 1 | g.length() == 0) {
            return true;
        } else {
            // determine the first letter of the word
            String firstLetter = g.substring(0, 1);
            // determine the last letter of the word
            String lastLetter = g.substring(g.length() - 1, g.length());
            
            // if the first and last letters are the same
            if (firstLetter.equals(lastLetter)) {
                // cut the first and last letters 
                return isPalindrome(g.substring(1, g.length() - 1));
            } else {
                // if the first and last letters are not the same, return false
                return false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);
        A2Q1 test = new A2Q1();

        // problem 1
        // tell the user to enter a number
        System.out.println("Enter a number");
        // store the number in int n
        int a = input.nextInt();
        // sout sum of digits
        System.out.println("The digital sum is "+test.digitalSum(a));
        // store sum in a variable
        int problem1 = test.digitalSum(a);



        // problem two
        // store root of sum in a variable
        int problem2 = test.digitalRoot(problem1);
        // print out the root
        System.out.println("The digital root is "+problem2);



        // problem 3
        // ask user to enter the triangle row number
        System.out.println("Enter the row number");
        // store the number in variable b
        int b = input.nextInt();
        // print out total blocks at that row
        System.out.println(test.triangleBlocks(b));



        // problem 4
        // ask the user to enter a number
        System.out.println("Enter a number");
        // store in a variable
        int c = input.nextInt();
        // activate method and sout answers
        System.out.println(test.hailstone(c));



        // problem 5
        // ask the user to enter a number
        System.out.println("Enter a number to convert into binary");
        // store the number in a variable
        int d = input.nextInt();
        // activate method and sout ansers
        System.out.println(test.binaryConvert(d));



        // problem 6
        // ask the user to enter a positive integer
        System.out.println("Enter a positive integer");
        // store in e
        int e = input.nextInt();
        // ask user to enter a base positive integer
        System.out.println("Enter a posiive base integer");
        // store in f
        int f = input.nextInt();
        input.nextLine();
        // activate method
        System.out.println("The coverted number is " + test.convert(e, f));



        // problem 7
        // ask the user to enter a word
        System.out.println("Enter a word to determine if a palindrome or not");
        // store the word in a string
        String g = input.nextLine();
        //activate method
        System.out.println(test.isPalindrome(g));











    }
}
