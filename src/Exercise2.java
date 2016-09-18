
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
        System.out.println("Write a word to determine if its Palindrome or not");
        String word = in.nextLine();
        int wordSize = word.length();

        //Asks for a number
        System.out.println("Enter a number please.");
        //saves the number 
        int n = in.nextInt();
        System.out.println("Enter a base number");
        int b = in.nextInt();

        //necessary to "spit" out (output) the result a method has performed
        int answer = digitalSum(n);
        int answer2 = digitalSum(answer);
        int answer3 = triangle(n);
        int answer4 = hailStone(n);
        //boolean answer8 = isPalindrome(word, wordSize);
        String answer5 = binaryConvert(n);
        String answer6 = convert(n, b);
        boolean answer7 = isPalindrome(word, wordSize);

        //Prints answer for questions
        System.out.println("Answer#1 " + answer);
        System.out.println("Answer#2 " + answer2);
        System.out.println("Answer#3 " + answer3);
        System.out.println("Answer#4 " + answer4);
        System.out.println("Answer#5 " + answer5);
        System.out.println("Answer#6 " + answer6);
        System.out.println("Answer#7 " + answer7);

    }

    //Methods that perform all the work
    public static int digitalSum(int n) {
        //The base case used to return a value lower than 10 and is required to solve the puzzle
        if (n <= 9) {
            //once n is found, it is sent back in order to be solved.
            return n;
        }
        //divides by 10 and takes its remainder, then sends it back to call the method again
        return digitalSum(n / 10) + digitalSum(n % 10);
    }
    
    //Same method as digitalSum, but this time it uses the answer from method 1
    public static int digitalRoot(int n) {
        if (n <= 9) {
            return n;
        }
        return digitalSum(n / 10) + digitalSum(n % 10);
    }

    //method used to solve question 3
    public static int triangle(int n) {
        //base case if n = 1, it will return 1 back to the equation below (method caller)
        if (n == 1) {
            return 1;
        }
        //base case: if n = 0 it will return 0 back to the equation below (method caller)
        if (n == 0) {
            return 0;
        }
        //the method caller that keeps on going until a number is found and can be used
        return n + triangle(n - 1);
    }

    //method used to solve question 4
    public static int hailStone(int n) {
        //prints out the result
        System.out.println(n);
        //if statement used to return the value and stop the method
        if (n == 1) {
            return n;
        }
        //Checks if the last digit is odd, if yes, it multiples it by 3 and adds 1
        if (n % 2 == 1) {
            n = 3 * n + 1;
        } else {
            //if even, it divides by 2
            n = n / 2;
        }
        //method caller that keeps on calling until an if statement returns int
        return hailStone(n);
    }

    //String method for question 5 
    public static String binaryConvert(int n) {
        //a blank string that stores "numbers" and does not take sum of numbers 
        String word = "";

        //checks if number is odd 
        if (n % 2 == 1) {
            //stores word as "1"
            word = "1";
        }
        //checks if number is even 
        if (n % 2 == 0) {
            //stores word as "0"
            word = "0";
        }
        //once the number that is being divided reaches 1, it returns the word back and ends the loop
        if (n == 1) {
            return word;
        }
        //a method caller that constantly divides by 2 and adds up all the strings stored starting from 1 to n
        return binaryConvert(n / 2) + word;
    }

    //String method used for question 6 
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

    //last method for question 7
    public static boolean isPalindrome(String s, int length) {

        //length acts as a counter, once it reaches 1 or 0 (negative wouldn't be possible) it returns true
        if (length <= 1) {
            return true;
        }
        //takes first letter and stores it as "first"
        String last = s.substring(s.length() - 1, s.length());
        //takes last letter and stores it as "last"
        String first = s.substring(0, 1);
        //ditches out the last letter by default 
        String lastIsGone = s.substring(0, s.length() - 1);

        //if first letter DOES equal or resemble last letter then return true 
        if (last.equals(first)) {
            //takes the variable "lastIsGone" and removes first letter
            lastIsGone = lastIsGone.replaceFirst(first, "");
            //s (original word) is now lastIsGone! that way it ensures modified is saved
            s = lastIsGone;
        }

        //if first letter does NOT equal or resemble last letter then return false
        if (!last.equals(first)) {
            return false;
        }

        //return statement that returns both the word (that is modified) and the length of word (modified)
        return isPalindrome(s, length - 2);
    }
}
