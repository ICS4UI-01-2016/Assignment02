
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Exercise2 {

    public int digitalSum(int n) {

        //if n is a single digit return it 
        if (n >= 0 && n <= 9) {
            return n;
        }
        //if not then cut off the last digit
        int num = (n % 10);
        //devide all reamaining digits by 10 
        int div = (n / 10);
        //add them together
        int ans = num + digitalSum(div);
        //return 
        return ans;
    }

    public int digitalRoot(int n) {

        //referance to the above method
        n = digitalSum(n);
        //if the number is between or equals 0 to 9
        if (n >= 0 && n <= 9) {
            return n;
        }
        return digitalSum(digitalRoot(n));



    }

    public int triangle(int n) {
        //if n is 0 or 1
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + triangle(n - 1);
    }

    public void hailstone(int n) {
        //print out all loops
        System.out.println(n);
        //if you input 1 output 1
        if (n == 1) {
            return;
        }
        //if the inputted number is even
        if (n % 2 == 0) {
            hailstone(n / 2);
            //if its odd
        } else {
            hailstone(3 * n + 1);
        }

    }
    
    public String binaryConvert(int n){
        String word = new String();
        
        
        //if the number is even
        if(n % 2 == 0){
            word = "0";
            //if its odd
        } else if (n % 2 == 1){
            word = "1";
        }
        //if the number is 1 
        if(n == 1){
            return word;
        }
        //return the previously devided number
       return binaryConvert(n/2) + word;
       
    }
    
    
    public String convert(int n, int b){
        String word = new String();
        
        
        //if the remainder is 0
        if(n % b == 0){
            word = "0";
        }
        //if the remainder is 1
        if(n % b == 1){
            word = "1";
        }
        //if the remainder is 2
        if(n % b == 2){
            word = "2";
        }
        //if the remainder is 3
        if(n % b == 3){
            word = "3";
        }
        //if the remainder is 4
        if(n % b == 4){
            word = "4";
        }
        //if the remainder is 5
        if(n % b == 5){
            word = "5";
        }
        //if the remainder is 6
        if(n % b == 6){
            word = "6";
        }
        //if the remainder is 7
        if(n % b == 7){
            word = "7";
        }
        //if the remainder is 8
        if(n % b == 8){
            word = "8";
        }
        //if the remainder is 9
        if(n % b == 9){
            word = "9";
        }
        //if the remainder is 10
        if(n % b == 10){
            word = "A";
        }
        //if the remainder is 11
        if(n % b == 11){
            word = "B";
        }
        //if the remainder is 12
        if(n % b == 12){
            word = "C";
        }
        //if the remainder is 13
        if(n % b == 13){
            word = "D";
        }
        //if the remainder is 14
        if(n % b == 14){
            word = "E";
        }
        //if the remainder is 15
        if(n % b == 15){
            word = "F";
        }
        //when the numbers devide to 0
        if(n / b ==  0){
            return word;
        }
        //return all the numbers
        return convert(n / b,b) + word;
    }
    
    public boolean isPalindrome(String s){
        
        //if length of string entered is 0 or 1 then its true
        if(s.length() == 0 || s.length() == 1){
            
            return true;
        }
        //check for first and last char of String
        if(s.charAt(0) == s.charAt(s.length()-1)){
            
            //if they are same then cut them off and do the same thing
            return isPalindrome(s.substring(1, s.length()-1));
        }

        //if its not the case than string is not a palindrome
        return false;
    } 
        
    
    

            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Exercise2 test = new Exercise2();

        System.out.println("Q1: " + test.digitalSum(126));
        System.out.println("Q2: " + test.digitalRoot(49));
        System.out.println("Q3: " + test.triangle(5));
        test.hailstone(5);
        System.out.println("Q5: " + test.binaryConvert(6947));
        System.out.println("Q6: " + test.convert(1000,8));
        System.out.println("Q7: " + test.isPalindrome("90009"));
        
        
    }
}
