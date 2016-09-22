
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author munta
 */
public class A2 {

    public int Digitalsum(int num) {

        if (num > -1 && num < 11) {//if the number is between 1 and 10 return the number entered
            return num;//retunr the number it self 
        }
        return (num % 10) + Digitalsum(num / 10);//add the digits of the number enetered by the user.
    }

    public int Digitalroot(int num) {
        int sum = Digitalsum(num);//create new int to store didgital sum value 
        if (sum > -1 && sum < 11) {//if the number is a single digit return that number
            return sum;//return number 
        }
        return Digitalroot(sum);//if it is not single digit return back to digital sum method 
    }

    public int triangle(int n) { //new recursive method
        if (n == 0) {//if the numbered unouted the the user is 0,return 0
            return 0;//return 0
        }
        return n + triangle(n - 1);//if not 0 return the number plus the previos value of the triangle
    }

    public void hailstone(int n) {

        if (n != 1) {//if the number does not equal one continue 

            if (n % 2 == 1) { //if the number is odd then proceed
                System.out.println("" + n); //print the number enetered by the user 
                n = 3 * n + 1;//calculate sequnce if numbr is odd
                hailstone(n); //call the method hailstone

            } else {// if the number is even 
                //print the number enetered by thr user 
                System.out.println("" + n);
                //calculate sequnce if number is even
                n = n / 2;
                //call method hailstone 
                hailstone(n);

            }
        } else {

        }

    }

    public String BinaryConvert(int B) {
        //set new sting to be empty
        String number = "";
        //if the number is even set the string to 0
        if (B % 2 == 0) {
            //set string to 1
            number = "0";
        }
        //if the number is odd set the string to 1
        if (B % 2 == 1) {
            number = "1";
        }
        //if the number is 1,then return the number itself 
        if (B == 1) {
            //return the number 
            return number;
        }
        //keep dividing the number by 2, and then adding the remainders
        return BinaryConvert(B / 2) + number;
    }

    public String convert(int n, int D) {
        //set new string to be empty
        String integer = "";

        if (n % D == 0) { //if the remainder is 0
            integer = "0"; //set string to 0

        }
        if (n % D == 1) {  //if the remainder is 1
            integer = "1";//set string to 1 

        }
        if (n % D == 2) {//if theremainder is 2
            integer = "2";//set string to 2 

        }
        if (n % D == 3) {//if theremainder is 3
            integer = "3";//set string to 3 

        }
        if (n % D == 4) {//if theremainder is 4
            integer = "4";//set string to 4

        }
        if (n % D == 5) {//if theremainder is 5
            integer = "5";//set string to 5 

        }
        if (n % D == 6) {//if theremainder is 6
            integer = "6";//set string to 6 

        }
        if (n % D == 7) {//if theremainder is 7
            integer = "7";//set string to 7 

        }
        if (n % D == 8) {//if theremainder is 8
            integer = "8";//set string to 8 

        }
        if (n % D == 9) {//if theremainder is 9
            integer = "9";//set string to 9

        }
        if (n % D == 10) {//if theremainder is 10
            integer = "A";//set string to "A" 

        }
        if (n % D == 11) {//if theremainder is 11
            integer = "B";//set string to "B"

        }
        if (n % D == 12) {//if theremainder is 12
            integer = "C";//set string to "C" 

        }
        if (n % D == 13) {//if theremainder is 13
            integer = "D";//set string to "D" 

        }
        if (n % D == 14) {//if theremainder is 14
            integer = "E";//set string to "E"

        }
        if (n % D == 15) {//if theremainder is 15
            integer = "f";//set string to "F"

        }
        if (n % D == 16) {//if theremainder is 16
            integer = "G";//set string to "G"

        }
        if (n < D) { //if the int is samller than the base 
            return "" + n;//retrun the number itself
        }
        //keep dividing the nuumber by  the base integer and adding the remainders (string)
        return convert(n / D, D) + integer;
    }

    public Boolean Palindrome(String s, int length) {
        if (length <= 1) {//if the length of string is less than 1(0 or 1) return as ture 
            return true;//return true 

        }
        //if the first letter and last letter of the string are the same,get rid of them and set that as new string 
        if (s.charAt(0) == s.charAt(length - 1)) {
            //get rid of first and last letter 
            s = s.substring(1, s.length() - 1);
            //keep cehking letters to see if they are the same
            return Palindrome(s, length - 2);
        } else {
            //if the letters are not the same return false 
            return false;
        }

    }

    public static void main(String[] args) {

        A2 test = new A2();//question 2 test***
        Scanner input = new Scanner(System.in);//new scanner 
        System.out.println("please enter a number");//ask user to enter a number 
        int num = input.nextInt();//allow user to enter a number 
        //tell user the sum of all the number entered
        System.out.println(" The sum of the number is " + test.Digitalroot(num));
        //ask user how many rows the triangle has 
        System.out.println("please enter how many rows the triangle has");
        //allow user to enter how many rows there are
        int n = input.nextInt();
        //tell user how many bocks the triangle has,based on the rows entered
        System.out.println(" The triangle has " + test.triangle(n) + " blocks ");
        //enter a number to test hailstone method 
        test.hailstone(7);
        //test a number to convert to binary 
        System.out.println(test.BinaryConvert(156));
        //test a number to convert for question 6
        System.out.println(test.convert(1000, 8));

        //enetr a string to test if it is a palindrome
        String Test = "muntake";
        //set an integer to store the length of the string
        int testlength = Test.length();
        //check to see if the string enetred is true or false 
        System.out.println(test.Palindrome(Test, testlength));

    }
}
