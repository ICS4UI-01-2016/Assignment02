/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thomas
 */
public class Assignment2 {

    public int DigitalSum(int n) {
        //check if n is one digit number
        if (n <= 9) {
            //if so, return number (number is digital sum)
            return n;
        } else {
            //use mod to get last digit of number
            //call on method again if nessesary
            return (n % 10) + DigitalSum(n / 10);

        }
    }

    public int DigitalRoot(int n) {
        //check if n is one digit number
        if (n <= 9) {
            //if so, return number (number is digital sum)
            return n;
        }
        //find sum of all digits in number
        int sum = n % 10 + DigitalRoot(n / 10);
        //if sum is single digit
        if (sum <= 9) {
            //return sum
            return sum;
        }
        //if the sum is not a single digit break the sum down further until one digit is left    
        return sum % 10 + DigitalRoot(sum / 10);

    }

    public int triangle(int n) {
        //check if triangle has only one row, if so output 1
        if (n == 1) {
            //output 1
            return 1;
        }
        //add number of blocks in lowest row to number of blocks in next lowest row
        return n + triangle(n - 1);
    }

    public void Hailstone(int n) {
        //check if n is 1, if so, output 1
        if (n == 1) {
            //output 1
            System.out.println("1");
        }
        //check if n is even and that it has not been reduced 1, if so divide by 2
        if (n % 2 == 0 && n != 1) {
            //output n
            System.out.println(n);
            //divide n by 2
            Hailstone(n / 2);
            //check if n has been reduced to one    
        } else if (n != 1) {
            //output n
            System.out.println(n);
            //multiply n by 2 and add 1
            Hailstone(3 * n + 1);
        }
    }

    public String binaryConvert(int n) {
        //create empty string
        String number = "";

        if (n % 2 == 1) {
            //System.out.print("1");
            number = "1";

        }
        if (n % 2 == 0) {
            number = "0";
            //System.out.print("0");

        }
        if (n == 1) {
            return number;

        }
        //return divded number back to start
        return binaryConvert(n / 2) + number;
        

    }

    public String convert(int n, int D) {
        //create string
        String integer = "";

        if (n % D == 0) { //if the remainder is 0
            integer = "0"; //set string to 0

        }
        if (n % D == 1) {  //if the remainder is 1
            integer = "1";//set string to 1 

        }
        if (n % D == 2) {//if the remainder is 2
            integer = "2";//set string to 2 

        }
        if (n % D == 3) {//if the remainder is 3
            integer = "3";//set string to 3 

        }
        if (n % D == 4) {//if the remainder is 4
            integer = "4";//set string to 4

        }
        if (n % D == 5) {//if the remainder is 5
            integer = "5";//set string to 5 

        }
        if (n % D == 6) {//if the remainder is 6
            integer = "6";//set string to 6 

        }
        if (n % D == 7) {//if the remainder is 7
            integer = "7";//set string to 7 

        }
        if (n % D == 8) {//if the remainder is 8
            integer = "8";//set string to 8 

        }
        if (n % D == 9) {//if the remainder is 9
            integer = "9";//set string to 9

        }
        if (n % D == 10) {//if the remainder is 10
            integer = "A";//set string to "A" 

        }
        if (n % D == 11) {//if the remainder is 11
            integer = "B";//set string to "B"

        }
        if (n % D == 12) {//if the remainder is 12
            integer = "C";//set string to "C" 

        }
        if (n % D == 13) {//if the remainder is 13
            integer = "D";//set string to "D" 

        }
        if (n % D == 14) {//if the remainder is 14
            integer = "E";//set string to "E"

        }
        if (n % D == 15) {//if the remainder is 15
            integer = "f";//set string to "F"

        }
        if (n % D == 16) {//if the remainder is 16
            integer = "G";//set string to "G"

        }
        if (n < D) { //check if input number is smaller than base input
            return "" + n;//retrun number
        }
        //continue divinding inout number by base integer and adding the remainders
        return convert(n / D, D) + integer;
    }

    public boolean isPalindrome(String s, int length) {

        //check if string is 1 character long or is empty(base case)
        if (s.length() == 1 || s.length() == 0) {
            //if so, return true
            return true;
        }

        System.out.println(s.charAt(s.length() - 1));
        //check if first and last letters are the same
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            //remove first and last characters and send string back to beggining of method
            return isPalindrome(s.substring(1, s.length() - 1), 0);
        }

        //if string is not palindrome return false
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enable main class to call on methods
        Assignment2 test = new Assignment2();

        //call on method, store result in variable "sum"
        // int sum = test.DigitalSum(139);
        //send int to method and store result in "root"
        // int root = test.DigitalRoot(1234567);
        //send numeber of rows to triangle method, store result in variable "total blocks"
        //  int totalBlocks = test.triangle(4);
        //send number to method "Hailstone"
        // test.Hailstone(7);
        //send number to method "binaryConvert"
        // test.binaryConvert(500);
        //send number and base to method "convert"
        // test.convert(1000,8);
        //System.out.println(test.convert(1000, 16));

        System.out.println(test.isPalindrome("palindrome", 10));
    }
}
