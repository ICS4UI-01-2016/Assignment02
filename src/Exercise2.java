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

    public static int binaryConvert(int n) {
        // Create two bases
        // If the integer ends has a remainder of 0 after dividing by 2
        if (n % 2 == 0) {
            // Calling the method again
            return n;
        } else {
            // Calling the method again
            return binaryConvert(n);

        }
        // Return two
        // Have to flip the binary code
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
        System.out.println(triangle(0));

        // Print out the user's answer
        System.out.println("Question 4: ");
        System.out.println(hailstone(12));

        // Print out the user's answer
        System.out.println("Question 5: ");
        System.out.println(binaryConvert(156));

    }
}
