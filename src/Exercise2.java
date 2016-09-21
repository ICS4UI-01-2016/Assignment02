/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class Exercise2 {

    public int digitalSum(int n) {
        // Chopped off the left side, goes through the algorithem to find out each entered number, then adds to the one beside it
        // Base case
        if (n <= 9) {
            return n;
        }
        // Chop off the last digit, then the digit before and so on and then add all of them together
        return digitalSum(n / 10) + (n % 10);
    }

    public int digitalRoot(int n) {
        // Chopped off the left side, goes through the algorithem to find out each entered number, then adds to the one beside it
        int sum = digitalSum(n);
        // Base case (If it is a single digit)
        if (sum <= 9) {
            return sum;
        }
        // Run the new sum through digitalSum! Breaking it down and then adding the digits together withing the 2nd return in digitalSum
        return digitalRoot(sum);
    }

    public static int triangle(int n) {
        // Create an if statement to focus on the recusion!
        if (n == 0 || n == 1) {
            // Return the integer, which would return 0 or 1
            return n;
        }
        // Return the integer plus the integer minus 1 (Getting the block count of the row before the user's input)
        return n + triangle(n - 1);
    }

    public static int hailstone(int n) {
        // Print out all the steps!
        System.out.println(n);
        // Base case if the integer is equal to 1, it will print out 1
        if (n == 1) {
            // Call the method again, 1 since n is equal to 1 in the if statement
            return n;
        }
        // If the number is even, divide the integer by two (getting the rightmost digit alone) and checking whether is has a decimal (if n < 0)!
        if (n % 2 == 0) {
            // Call the method again, the integer that is divided by two
            return hailstone(n / 2);
            // If the is user's input is odd 
        } else {
            // Call the method again, the integer that is multiplied by three and then one is added to the product
            return hailstone(3 * n + 1);
        }
    }

    public static String binaryConvert(int n) {
        // Create new empty string
        String wordEntered = "";
        // If the numeber is even
        if (n % 2 == 0) {
            wordEntered = "0";
        }
        // If the numeber is off
        if (n % 2 == 1) {
            wordEntered = "1";
        }
        // Ending of the recusion loop if the integer is equal to one
        if (n == 1) {
            return wordEntered;
        }
        // Recall the method in binary form (backwards)
        return binaryConvert(n / 2) + wordEntered;
    }

    public static String convert(int n, int b) {
        // Create new empty string
        String word = "";
        // Create a string that has all the numbers and letters within it 
        // (it is easier to then have the recursion look through the string to call a number or letter)
        String[] answers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        // Base case that 0 when n is equal to 0. E.g 7/8 = 0 = RETURN 0
        if (n == 0) {
            return word;
        }
        // After the calculation is done (n / b), the loop heads to string to grab number/letter and prints it
        word = answers[n % b];

        // Recall the method in binary form (backwards)
        // The method functions by taking in both n and b and then dividing n by b and then printing the letter or the number from the string array
        // This method then occurs again and again until the quotient is literally not possible to divide it by b!
        return convert(n / b, b) + word;
    }

    public static boolean isPalindrome(String s, int length) {
        // Seperate the String by using charAt and then using Substring, return the string but backwards, 
        // (Base case) If the word is one length or no length at all, it is the same written forwards as it being written backwards
        // Print true 
        if (length <= 1) {
            return true;
            // Return false, both words are not the same backwards
        } else {
            if () {
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        // Add a new method (Allows us to use antyhing within a class)
        Exercise2 test = new Exercise2();

        // Print out the user's answer (Question 1)
        System.out.println("Question 1: ");
        System.out.println(test.digitalSum(0));

        // Print out the user's answer (Question 2)
        System.out.println("Question 2: ");
        System.out.println(test.digitalRoot(0));

        // Print out the user's answer
        System.out.println("Question 3: ");
        System.out.println(test.triangle(0));

        // Print out the user's answer
        System.out.println("Question 4: ");
        hailstone(2);

        // Print out the user's answer
        System.out.println("Question 5: ");
        System.out.println(test.binaryConvert(1000));

        // Print out the user's answer
        System.out.println("Question 6: ");
        System.out.println(test.convert(1000, 8));

        // Print out the user's answer
        System.out.println("Question 7:");

    }
}
