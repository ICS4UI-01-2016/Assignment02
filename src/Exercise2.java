
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner used to recognize user input
        Scanner in = new Scanner(System.in);
        //necessary for calling methods later on
        Exercise2 test = new Exercise2();
        //Asks for a number
        System.out.println("Enter a number please.");
        //saves the number 
        int n = in.nextInt();

        System.out.println("Write a word to determine if its Palindrome or not");
        String word = in.nextLine();

        int wordSize = word.length();

        //necessary to "spit" out (output) the result a method has performed
        int answer = digitalSum(n);
        int answer2 = digitalSum(answer);
        int answer4 = hailStone(n);
        //boolean answer8 = isPalindrome(word, wordSize);
        int answer5 = binaryConvert(n);

        //Prints answer for questions
        
        System.out.println("Answer#1 " + answer);
        System.out.println("Answer#2 " + answer2);
        System.out.println("Answer#3 " + test.triangle(2));
        System.out.println("Answer#4 " + answer4);
        System.out.println("Answer#5 " + answer5);
        // System.out.println("Answer#7 " + answer8);
        System.out.println("Answer#8" + answer5);


    }

    //Methods that perform all the work
    public static int digitalSum(int n) {
        //The base case used to return a value lower than 10 and is required to solve the puzzle
        if (n <= 9) {
            return n;
        }
        return digitalSum(n / 10) + digitalSum(n % 10);
    }
    //Second question requires 2 methods

    public static int digitalRoot(int n) {
        if (n <= 9) {
            return n;
        }
        return digitalSum(n / 10) + digitalSum(n % 10);
    }

    //method used to solve question 3
    public int triangle(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n + triangle(n - 1);
    }

    //method used to solve question 4
    public static int hailStone(int n) {
        System.out.println(n);
        //if statement used to return the value and stop the method
        if (n == 1) {
            return n;
        }
        //Checks if the last digit is odd, if yes, it multiples it by 3 and adds 1
        if (n %2 == 1) {
            n = 3 * n + 1;
        } else {
            //if even, it divides by 2
            n = n / 2;
        }
        //ALSO ASK LAMONT ABOUT THE FACT HIS QUESTIONS ASK "will take any positive integer n" SHOULD I FILTER IT OUT SO ONLY POSITIVE WORK
     
        return hailStone(n);
    }

    public static int binaryConvert(int n) {
        System.out.println("lol fail + "+n);
      
        if(n%2 == 1){
            System.out.println("yo enemey incoming" + 1);
            
        }
        if(n%2 == 0){
            System.out.println("Enemy ult down " + 0);
            
        }
        if(n == 1){
            return n;
        }
        
        return binaryConvert(n/2);
        
    }
    //  public static boolean isPalindrome(String s, int length){
    //    String first;
    //  first = s.substring(length);
    //return isPalindrome(s,length-1);
    //}
}
