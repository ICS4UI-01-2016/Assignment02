
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static int digitalSum(int n) {
        //base case if n is 1 didit(smaller than 10)
        if (n < 10) {
            //return 1
            return n;
        }
        //remove the right most digit added to the right most digit of the same integer
        return digitalSum(n / 10) + digitalSum(n % 10);


    }

    public static int digitalRoot(int n) {

        int i = digitalSum(n);

        //base case if n is 1 digit(smaller than 10)
        if (i < 10) {

            //return 1
            return i;

        }
        //call the method again with the integer stored in i
        return digitalRoot(i);


    }

    public static int triangle(int n) {
        //base case for if n is equal or smaller than one
        if (n <= 1) {
            //return the integer that satisfied the case
            return n;
        }

        //return the integer added to the method but subtracted 1 from the integer
        return n + triangle(n - 1);
    }

    public static int hailstone(int n) {
        //uncomment below line for testing of this method
        // System.out.println(n);

        //base case where it returns 1 if integer equals 1
        if (n == 1) {

            return n;
        }
        //if n integer is even
        if (n % 2 == 0) {
            //return/recall the method the integer but divide it by 2
            return hailstone(n / 2);

        } else //else return/recall the method the interger but multiply it by 3 and add 1
        {
            return hailstone(3 * n + 1);
        }

    }

    public static String binaryConverter(int n) {

        //create empty string to later store 
        String binarynum = "";
        //base case that returns 1 as a string if n becomes equal to 1 because 1/2 = 1 represents the end of the binary code
        if (n == 1) {

            return "1";
        }
        //if n is an odd number 
        if (n % 2 == 1) {
            //set 1 on the binarynum string
            binarynum = "1";
            //call the same method again but add it to the binarynum string with whatever it stores
            return binaryConverter(n / 2) + binarynum;

        } //else if it doesn't reach base case and the number is not odd
        else //set binarynum to 0 ,representing even
        {
            binarynum = "0";
        }
        //call the same method again but add it to the binarynum string with whatever it stores
        return binaryConverter(n / 2) + binarynum;


    }

    public static String convert(int n, int e) {

        //create empty string to later store returned integer as a string
        String binarynum = "";

        //base case that returns a "blank" as a string if n becomes equal to 0 because it would signal that the method is completely finished
        if (n == 0) {
            //return 1 to start filling in recursion memory
            return "";
        }
        //if n has a remainder of 0 / is even
        if (n % e == 0) {
            //set 0 on the binarynum string
            binarynum = "0";
        }
        //if n has a remainder of 1 / is odd
        if (n % e == 1) {
            //set 1 on the binarynum string
            binarynum = "1";
        }
        //if n has a remainder of 2
        if (n % e == 2) {
            //set 2 on the binarynum string
            binarynum = "2";
        }
        //if n has a remainder of 3
        if (n % e == 3) {
            //set 3 on the binarynum string
            binarynum = "3";
        }
        //if n has a remainder of 4
        if (n % e == 4) {
            //set 4 on the binarynum string
            binarynum = "4";
        }
        //if n has a remainder of 5
        if (n % e == 5) {
            //set 5 on the binarynum string
            binarynum = "5";
        }
        //if n has a remainder of 6
        if (n % e == 6) {
            //set 6 on the binarynum string
            binarynum = "6";
        }
        //if n has a remainder of 7
        if (n % e == 7) {
            //set 7 on the binarynum string
            binarynum = "7";
        }
        //if n has a remainder of 8
        if (n % e == 8) {
            //set 8 on the binarynum string
            binarynum = "8";
        }
        //if n has a remainder of 9 
        if (n % e == 9) {
            //set 9 on the binarynum string
            binarynum = "9";
        }
        //if the remainder of the number inputed divided by the base is 10...
        if (n % e == 10) {
            //set binarynum string as A
            binarynum = "A";
        }
        //if the remainder of the number inputed divided by the base is 11...
        if (n % e == 11) {
            //set binarynum string as B
            binarynum = "B";
        }
        //if the remainder of the number inputed divided by the base is 12...
        if (n % e == 12) {
            //set binarynum string as C
            binarynum = "C";
        }
        //if the remainder of the number inputed divided by the base is 13...
        if (n % e == 13) {
            //set binarynum string as D
            binarynum = "D";
        }
        //if the remainder of the number inputed divided by the base is 14...
        if (n % e == 14) {
            //set binarynum string as E
            binarynum = "E";
        }
        //if the remainder of the number inputed divided by the base is 15...
        if (n % e == 15) {
            //set binarynum string as F
            binarynum = "F";
        }
        
        //recall the method and input the integer
        return convert(n / e, e) + binarynum;
    }

    public static boolean isPalindrome(String s, int length) {

        //create middle integer that divides the length of the s string by 2, to find how many spots the word has left
        //(as I am recursively chopping the ends off for the method)
        int middle = s.length() / 2;

        //base case for when the method reaches the middle of the word/is done checking if word is palindrome
        if (middle == 0) {
            //return true boolean, because the word is a palindrome
            return true;
        }

        //create string for holding the left most letter of the s string
        String firstLetter = s.substring(0, 1);
        //create string for holding the right most letter of the s string
        String lastLetter = s.substring(s.length() - 1, s.length());

        //if the first and last letter are equal...
        if (firstLetter.equals(lastLetter)) {
            //keep recursively calling the method, but cutting off the end letters and reducing the length accordingly(-2)
            return isPalindrome(s.substring(1, s.length() - 1), length - 2);
        
            //else if the first and last letters are not equal...
        } else 
        {
            //return false, as this word is not a palindrome
            return false;
        }




    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Problem1 test = new Problem1();

        System.out.print("Please enter a word along with its length: ");
        String base = in.nextLine();
        int number = in.nextInt();
        
//        int answer1 = digitalSum(number);
//        int answer2 = digitalRoot(answer1);
//        int answer3 = triangle(number);
//        int answer4 = hailstone(number);
//        String answer5 = binaryConverter(number);
//        String answer6 = convert(number, base);
        boolean answer7 = isPalindrome(base, number);

        System.out.println("Credits to khaleeeed for this answer format :)");
        System.out.println("Answer #7: " + answer7);


    }
}