/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    
    // Question 1
    // Create the rescursive method digitalSum(int n) that given a non-negative int n, 
    // return the sum of its digits recursively. 
    public int digitalSum(int n){
        
        // BASE CASE
        // if n is less than 10 then it should return n
        if(n < 10){
            return n;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // recusively return digitalSum changing the state of by dividng by 10 removing the right most digit 
        // and adding by mod by 10 yielding the rightmost digit.
        return digitalSum(n / 10) + (n % 10);
    }
    
    // Question 2
    // The digital root of a non-negative integer n is computed as follows. 
    // Begin by summing the digits of n. The digits of the resulting number are then summed, 
    // and this process is continued until a single-digit number is obtained.  
    // Write a recursive function digitalRoot(n) which returns the digital root of n. 
    public int digitalRoot(int n){
        
        // create variable that calls on method 1 (digitalSum) to get the sum on the digits
        // and then stores this in a variable called sum
        // CHANGED STATE
        int sum = digitalSum(n);
        
        // BASE CASE
        // if the sum is one digit than rteturn the sum
        if(sum < 10){
            return sum;
        }
        
        // CALL ON ITSELF
        // continue to call on itself
        return digitalRoot(sum);
    }
    
    // Question 3
    // We have a triangle made of blocks. 
    // The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. 
    // Create a recursive method called triangle(int n) to compute recursively
    // the total number of blocks in such a triangle with the given number of rows. 
    public int triangle(int n){
        
        // BASE CASE
        // if there is no blocks left than return n
        if(n == 0){
            return n;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // continue to call on itself changing the state of n by reducing it by 1 and additing the value of n
        return triangle(n-1) + n;
    }
    
    // Question 4
    // The Hailstone pattern is generated using 2 simple rules: 
    // If the current number, n, in the sequence is even, the next number is n/2, otherwise, the next number is 3*n+1. 
    // Repeating this process will generate the Hailstone sequence. 
    // Your job is to write a recursive method hailstone(int n) that will print out this sequence for any postive integer n that is greater than 0. 
    // Note: once your sequence hits 1, you will want to stop the sequence or you will be stuck in an infinite loop.
    public void hailstone(int n){
        
        // output the value of n
        System.out.println(n);
        
        // BASE CASE
        // if n is equal to 1 than the method should stop
        if(n > 1){
            
            // if n is an even number than it should call on itself again however divinding the value of n by 2
            if((n % 2) == 0){
                // CALL ON ITSELF
                // CHANGED STATE
                hailstone(n/2);
            
            // if n is an odd number than it should call on itself again however multiplying n by 3 and adding 1
            } else{
                // CALL ON ITSELF
                // CHANGED STATE
                hailstone(3*n+1);
            }
        }
    }
    
    // Question 5
    // Create a recursive method called binaryConvert(int n) that will take any positive integer n and will return a STRING in binary (base 2). 
    // To do this, you must first learn how to convert a number in a recursive manner to base 2. 
    // We will use repeated division by 2, the quotient and the remainder to do this. 
    public String binaryConvert(int n){
        
        // create a variable that stores the characters found into a string
        String value = "";
        
        // is number larger than 2, if yes then recurse
        if(n / 2 != 0){
            // CALL ON ITSELF
            // CHANGED STATE
            // value should then equal the call on the method itelf with the change in state of n divided by 2
            value = binaryConvert(n / 2);
        }
        
        // determine the remainder and append the remainder in string form
        // if n has no remainder than
        if ( n % 2 == 0 ) {
            // value shold equal itself plus 0
            value = value + "0";
            
        // if n has a remainder than
        } else {
            // value shold equal itself plus 1
            value = value + "1";
        }
        
        // BASE CASE
        // return the string
        return value;
    }
    
    // Question 6
    // Create a recursive method called convert(int n, int b) that will take any positive integer n and positive base integer b (from 2-16), 
    // and convert that integer to the given base and return the answer as a String.
    // If a number converts to a digit that is 10 or bigger, use a letter to replace that digit. 
    // So 10->A, 11->B, 12->C, 13->D, 14->E, 15->F. 
    // The recursive method is similar to the method from Problem 3, except that the repetitive division by 2 is replace by whatever base they specify. This method works exactly like question 4.
    public String convert(int n, int b){
        
        // create an array of all the characters within base 16
        String [] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        
        // create a string to store the characters
        String value = "";
                   
        // determine if the number is larger than a single digit in the base.
        // If it is recurse to process the next position/digit
        if(n >= b){
            // CALL ON ITSELF
            // CHANGED STATE
            // value should then equal the call on the method itelf with the change in state of n divided by b
            value = convert(n / b, b);
        }
        
        // determine the remainder and append the remainder in string form
        value = value + digit[ n % b ];
        
        // BASE CASE
        // return the string
        return value;
    }
    
    // Question 7
    // A palindrome is a sequence of characters or numbers that looks the same forwards and backwards. 
    // For example, "racecar" is a palindrome because it is spelled the same reading it from front to back as from back to front. 
    // The number 12321 is a numerical palindrome. 
    // Write a function that takes a string and its length as arguments and recursively determines whether the string is a palindrome or not. 
    // Name this method isPalindrome(String s, int length) and make it return a boolean instead of just printing it to the screen. 
    public boolean Palindrome(String s, int length) {
        
        // create variable to determine with the word is a palindrome or not
        boolean p = true;
        
        // if the first letter and the last letter are not equal than it cannot be a palindrome
        if(s.charAt(0) != s.charAt(length - 1)){
            p = false;
        }
        
        // BASE CASE
        // if the length is less than or equal to 1 or it has already been determined that it is not a palindrome than return p
        if(length <= 1 || p == false){
            return p;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // chop off the first and last leter of the word 
        // and call on itself with the new word and the new length of that word
        String newString = s.substring(1, length - 1);
        return Palindrome(s = newString, length = s.length());
    }
    
    // Question 8 (Challenge)
    // Create a method that will calculate the growth of money in a savings account.
    // Therefore the program should receive the initial value and interest rate of the account.
    // Finally, it should calculate and output the number of years it took to double and reach 1 million.
    public static int calcMaxMarblesCanBeStored( int roomLeftInBox, int marblesInBags[], int bagToConsider ) {
        
        // BASE CASE
        // if no more bags left to consider, then we can't store any more marbles in box
      
        // Determine the maximum number of marbles we can store in box by determine maximum
        // number of marbles we we fit if we include include each bag in box compared
        // to the max number we can fit if we don't include the bag in the box
       
        // determine number of marbles can be stored if we include bag
 
 
     
        // determine number of marbles can be stored if we don't include the bag
       
        // Determine if including the bag produced a larger total number of marbles that can be stored
        // then if we do not include the bag.  
        // if including the bag of marbles doesn't exceed the room left in the box and
        // and including the bag produces larger number that can be stored than
        // then return the total marbles stored including the bag included otherwise return
        // max number of marbles can be stored without including the bag.
        
        return 0;
    }
        
    
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        
        // Call on Question 1 and print out answer to this recurision
        System.out.println("Question 1: " + test.digitalSum(126));
        
        // Call on Question 2 and print out answer to this recurision
        System.out.println("Question 2: " + test.digitalRoot(2019));
        
        // Call on Question 3 and print out answer to this recurision
        System.out.println("Question 3: " + test.triangle(4));
        
        // Call on Question 4 and print out answer to this recurision
        System.out.println("Question 4: ");
        test.hailstone(5);
        
        // Call on Question 5 and print out answer to this recurision
        System.out.println("Question 5: " + test.binaryConvert(1000) );
        
        // Call on Question 6 and print out answer to this recurision
        System.out.println("Question 6: " + test.convert(123456, 5));
        
        // Call on Question 7 and print out answer to this recurision using the
        // stored word and its length in the variables
        String word = "racecar";
        int length = word.length();
        System.out.println("Question 7: " + test.Palindrome(word, length));
        
        // Call on Question 8 and print out answer to this recurision using the
        // stored array of the different numbers of marbles in each bag and
        // the total number of marbles that can fit in the box
        int [] marblesInBag = {12, 14, 18, 33, 34};
        System.out.println("Question 8: " + calcMaxMarblesCanBeStored( 50, marblesInBag, 0 ) );
    }
}
