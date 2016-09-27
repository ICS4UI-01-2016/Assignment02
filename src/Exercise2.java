/*
 * Exercise 2: Recursion
 * 
 * All answer to Exercise 3 are contained in this single file
 *
 * @author richj0985
 */
public class Exercise2 {

    // Question 1
    // Create the rescursive method digitalSum(int n) that given a non-negative int n, 
    // Recursely pull of each of the right most digits of the number of the number
    // and sum the digits using the return of the recursive call.
    public int digitalSum(int n){
        
        // BASE CASE
        // if n is less than 10, then the remaining number is a single digit, return the number n
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
        
        // sum the digits of the number and determine if the sum has multiple digit.
        // to sum the digits of the number, we use the method from question 1
        // CHANGED STATE
        int sum = digitalSum(n);
        
        // BASE CASE
        // if the sum is one digit number then return the sum
        // otherwise the number has more than 1 digit 
        // continue to recurse to sum the digits
        if(sum < 10){
            return sum;
        }
        
        // The number has multiple digits, continue 
        // to CALL ON ITSELF to sum the digits and return that result
        return digitalRoot(sum);
    }
    
    // Question 3
    // We have a triangle made of blocks. 
    // The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. 
    // Create a recursive method called triangle(int n) to compute recursively
    // the total number of blocks in such a triangle with the given number of rows. 
    // The recursive routine will compute the number of blocks in each row N, 
    // and add the number of blocks in that row to the total number of blocks
    // in all rows in triangle less than N to come to total # of blocks. 
    public int triangle(int n){
        
        // BASE CASE
        // if there is no blocks left and number of blocks in row is 0, return 0
        if(n == 0){
            return n;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // continue to call on itself changing the state of n by reducing it by 1 to move to the 
        // call the routine recursively to get the total number of blocks 
        // for a triangle with n-1 rows in it and then add n blocks to that total 
        // to then return the total blocks in a triangle with n rows. 
        return triangle(n-1) + n;
    }
    
    // Question 4
    // The Hailstone pattern is generated using 2 simple rules: 
    // If the current number, n, in the sequence is even, the next number is n/2, otherwise, the next number is 3*n+1. 
    // Repeating this process will generate the Hailstone sequence. 
    // Write a recursive method hailstone(int n) that will print out this sequence for any postive integer n that is greater than 0. 
    // Note: once your sequence hits 1, you will want to stop the sequence or you will be stuck in an infinite loop.
    public void hailstone(int n){
        
        // output the value of n
        System.out.println(n);
        
        // BASE CASE
        // if n is equal to 1 then we have reached the end of the hailstore sequence, the method should stop 
        // and not recurse further.  Otherwise we have not reached the end of the hailstone sequence and 
        // should continue to recurse using the hailstone pattern
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
        
        // create a variable that stores the number for the binary conversion into a string
        String value = "";
        
        // is number larger than 2, if yes then recurse to convert the remainder
        // after dividing by 2, otherwise we have hit the BASECASE of 0 or 1 and don't recurse
        if(n / 2 != 0){
            // CALL ON ITSELF
            // CHANGED STATE
            // value should then equal the call on the method itelf with the change in state of n divided by 2
            value = binaryConvert(n / 2);
        }
        
        // determine the remainder and append the remainder in string form as 0 or 1
        if ( n % 2 == 0 ) {
            // append 0 for value should equal itself plus 0
            value = value + "0";
            
        // if n has a remainder than
        } else {
            // value should equal itself plus 1
            value = value + "1";
        }
        
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
        // If number is not larger than base, then we have hit the BASE CASE and don't need to recurse
        if(n >= b){
            // CALL ON ITSELF
            // CHANGED STATE
            // value should then equal the call on the method itelf with the change in state of n divided by b
            value = convert(n / b, b);
        }
        
        // determine the remainder and append the remainder in string form
        value = value + digit[ n % b ];
        
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
        // BASE CASE - empty string considered palindrome
        if(length == 0){
            return true;
        }

        // BASE CASE - if string is single character than it is a palindrome
        if(length == 1){
            // no string, declare it no a palindrome
            return true;
        }
        
        // string is long than 1 character
        // if the first letter and the last letter are not equal than it cannot be a palindrome
        if(s.charAt(0) != s.charAt(length - 1)){
            // not a Palindome
            return false;
        }
        
        
        // CALL ON ITSELF
        // CHANGED STATE
        // chop off the first and last leter of the word 
        // and call on itself with the new word and the new length of that word
        String newString = s.substring(1, s.length() - 1);
        
        return Palindrome( newString, newString.length() );
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
        System.out.println("Question 7: " + word + " = "+ test.Palindrome(word, word.length()) );
    }

}
