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
        // Base case, if the integer is less than or equal to 9, return the input
        if (n <= 9) {
            return n;
        }
        // Chop off the last digit, then the digits to the left and add them, redo this until it can't be done anymore, and then add all the numbers together
        return digitalSum(n / 10) + (n % 10);
    }

    public int digitalRoot(int n) {
        // Create a new integer (Used to connect this method with the method from the first question)
        int sum = digitalSum(n);
        // Base case, if the sum is equal to or less than 9, return the sum (If it is a single digit)
        if (sum <= 9) {
            return sum;
        }
        // Calling the method again and running the new sum through digitalSum method! Breaking it down and then adding the digits together (occurs within the 2nd return in the digitalSum method)
        return digitalRoot(sum);
    }

    public static int triangle(int n) {
        // Create an if statement to focus on the recusion!
        // If the integer is equal to 0 or equal to 1, return the integer!
        if (n == 0 || n == 1) {
            // Return the integer, which would return 0 or 1
            return n;
        }
        // Return the integer plus the integer minus 1 (Getting the block count of the row before the user's input), then add them together
        return n + triangle(n - 1);
    }

    public static int hailstone(int n) {
        // Print out all the steps!
        System.out.println(n);
        // Base case if the integer is equal to 1, return 1
        if (n == 1) {
            // Return the integer due to the fact that it equals 1
            return n;
        }
        // If the number is even, divide the integer by two and checking whether is has a decimal (if n < 0)!
        if (n % 2 == 0) {
            // Call the method again, return the integer that is divided by two
            return hailstone(n / 2);
        } else {
            // Call the method again, if the integer is odd, multiply by three and add one!
            return hailstone(3 * n + 1);
        }
    }

    public static String binaryConvert(int n) {
        // Create new empty string
        String wordEntered = "";
        // If there is not a remainder, return "0"
        if (n % 2 == 0) {
            wordEntered = "0";
        }
        // If there is a remainder, return "1"
        if (n % 2 == 1) {
            wordEntered = "1";
        }
        // Ending of the recusion loop if the integer is equal to one
        if (n == 1) {
            return wordEntered;
        }
        // Recall the method in binary form (backwards), adding them in the correct binary order
        return binaryConvert(n / 2) + wordEntered;
    }

    public static String convert(int n, int b) {
        // Create new empty string
        String word = "";
        // Create a string that has all the numbers and letters within it 
        // (it is easier to then have the recursion loop look through the string to call a number or letter)
        String[] answers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        // Base case, when n is equal to 0 return the word
        if (n == 0) {
            return word;
        }
        // After the calculation is done (n / b), the loop heads to the string to grab number/letter and prints it
        word = answers[n % b];

        // Recall the method in binary form (backwards)
        // The method functions by taking in both n and b and then dividing n by b and printing the letter or the number from the string array (prints backwards)
        // This proccess then occurs again and again until the quotient is literally not possible to be divided by b!
        return convert(n / b, b) + word;
    }

    public static boolean isPalindrome(String s, int length) {
        // (Base case) If the word is one length or no length at all, it is the same written forwards as it being written backwards
        // Print true is the word is equal or less than 1 characters long
        if (length <= 1) {
            return true;
        }

        // Create a new string for the first letter 
        String first = s.substring(0, 1);
        // Create a new string for the last letter
        String last = s.substring(s.length() - 1, s.length());

        // If the first and the last letter equal the same letter 
        if (first.equals(last)) {
            // Use a substring to seperate the letter, cutting off the first and the last letter, checking if they are the same
            // This then happens again and again! Return the word that is cut and compare again
            return isPalindrome(s.substring(1, length - 1), length - 2);
        } else {
            // Return false if the letters are not the same!
            return false;
        }
    }

//    public static int lostMarbles(int maxMarbles, int[] numMarbles) {
//
//        if (numMarbles.length == 0) {
//            return 0;
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Add a new method (Allows us to use anything within a class)
        Exercise2 test = new Exercise2();

        // Print out the user's answer 
        System.out.println("Question 1: ");
        System.out.println(test.digitalSum(0));

        // Print out the user's answer 
        System.out.println("Question 2: ");
        System.out.println(test.digitalRoot(0));

        // Print out the user's answer
        System.out.println("Question 3: ");
        System.out.println(test.triangle(3));

        // Print out the user's answer
        System.out.println("Question 4: ");
        hailstone(12);

        // Print out the user's answer
        System.out.println("Question 5: ");
        System.out.println(test.binaryConvert(2));

        // Print out the user's answer
        System.out.println("Question 6: ");
        System.out.println(test.convert(1000, 8));

        // Print out the user's answer
        System.out.println("Question 7: ");
        System.out.println(test.isPalindrome("lamont", 6));

        //Print out the user's answer
        System.out.println("Question 8: ");

    }
}
