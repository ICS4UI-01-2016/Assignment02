

import java.util.Scanner;

public class Exercise2 {

    public int digitalSum(int n) {
        if (n > -1 && n < 10) { //if the number is between 0 and 10
            return n; //return the current n value
        } else { //otherwise
            return n % 10 + digitalSum(n / 10); //add the last digit of n and the digitalSum of the remaining numbers in n
        }
    }

    public int digitalRoot(int n) {
        if (n > -1 && n < 11) { //if the number is between 0 and 10
            return n; //return the current n value
        } else { //otherwise
            return n % 10 + digitalRoot(n / 10); //add the last digit of n and the digitalSum of the remaining numbers in n
        }
    }

    public int triangle(int n) {
        //if the input number is 0
        if (n == 0) {
            return 0; //return 0
        } else { //otherwise
            return n + triangle(n - 1); //return the number plus the previous value of the method
        }
    }

    public int hailstone(int n) {
        //output the current value of the number
        System.out.println(n);
        //if the number does not equal one
        if (n != 1) {
            //if the number is odd
            if (n % 2 == 1) {
                n = n * 3 + 1; //multiply the number by 3 and add one
                return hailstone(n); //return the number back to the method
            } else { //otherwise
                n = n / 2; //divide the number by 2
                return hailstone(n); //return the number back to the method
            }
        } else { //otherwise
            return 1; //return the value of one
        }

    }

    public String binaryConvert(int n) {
        String word = ""; //create a blank string
        
        if (n % 2 == 1) { //if the remainder is 1
            word = "1"; //the string = 1
        }
        if(n % 2 == 0){ //otherwise if the remainder is 0
            word = "0"; //the string is 0
        }
        if(n == 1){ //if the number is 1
            return word; //return it
        }
        return binaryConvert(n/2) + word; //use recursion to repeat the method

    }
    
    public String convert(int n, int b){
        String word = ""; //create a blank string 
        
        if(n % b == 0){ //if the remainder is 0
            word = "0"; //the string is now 0
        }
        if(n % b == 1){ //if the remainder is 1
            word = "1"; //the string is now 1
        }
        if(n % b == 2){ //if the remainder is 2
            word = "2"; //the string is now 2
        }
        if(n % b == 3){ //if the remainder is 3
            word = "3"; //the string is now 3
        }
        if(n % b == 4){ //if the remainder is 4
            word = "4"; //the string is now 4
        }
        if(n % b == 5){ //if the remainder is 5
            word = "5"; //the string is now 5
        }
        if(n % b == 6){ //if the remainder is 6
            word = "6"; //the string is now 6
        }
        if(n % b == 7){ //if the remainder is 7
            word = "7"; //the string is now 7
        }
        if(n % b == 8){ //if the remainder is 8
            word = "8"; //the string is now 8
        }
        if(n % b == 9){ //if the remainder is 9
            word = "9"; //the string is now 9
        }
        if(n % b == 10){ //if the remainder is 10
            word = "A"; //the string is now 10
        }
        if(n % b == 11){ //if the remainder is 11
            word = "B"; //the string is now 11
        }
        if(n % b == 12){ //if the remainder is 12
            word = "C"; //the string is now 12
        }
        if(n % b == 13){ //if the remainder is 13
            word = "D"; //the string is now 13
        }
        if(n % b == 14){ //if the remainder is 14
            word = "E"; //the string is now 14
        }
        if(n % b == 15){ //if the remainder is 15
            word = "F"; //the string is now 15
        }

        if(n == 1){ //if number is 1
            return word; //return it
        }
        if(n < b){ //if the number is less than the base
            return "" +n; //return the number
        }
        return convert(n/b, b) + word; //use recusion to repeat
        
    }
    
    public boolean isPalindrome(String s, int length){
        
        //create a boolean for the word
        boolean pal = true;

        //if the word is one letter
        if(length == 1){
            pal = true; //the word is a palindrome
            return pal; //return that it is true
        }
        
        if(s.charAt(0) == s.charAt(length -1)){ //if the first and last letter are the same
            s = s.substring(1, length-1); //the new string is the old string with the outter letters cut off
            return isPalindrome(s, length-2); //use recursion to repeat the method until the word is 1 letter long
        } else { //otherwise
            return false; //return that the answer is false
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create the object to call
        Exercise2 test = new Exercise2();

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");

        int n = in.nextInt();

        int x = test.digitalRoot(n);

        System.out.println("Answer to Problem 1: " + test.digitalSum(n));

        while (x > 10) {
            x = test.digitalRoot(x);
        }
        System.out.println("The answer to Problem 2: " + x);

        System.out.println("The answer to Problem 3: " + test.triangle(n));
        
        test.hailstone(n);
        
        System.out.println("The answer to Problem 5: " + test.binaryConvert(n));
        
        System.out.println("The answer to Problem 6: " + test.convert(1000, 16));
        
        String word = "radar";
        
        int wordLength = word.length();
        
        System.out.println(test.isPalindrome(word, wordLength));

        
    }
}
