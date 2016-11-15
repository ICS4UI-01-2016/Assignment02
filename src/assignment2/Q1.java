/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author snowc4636
 */
public class Q1 {
    
    public int digitalSum (int n){
        
        if( n >= 0 && n <= 9){
            return n;
    } 
        // creating ints
        int number = (n%10);
        int num = (n/10);
        //formula
        int solution = number + digitalSum(num);
        
        return solution;
        }
    public int digitalRoot (int n){
        
        n = digitalSum(n);
        
        if( n >= 0 && n <= 9){
            return n;
        }
        return digitalSum(digitalRoot(n));
        
    }
    
    public int digitalTriangle (int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n + digitalTriangle(n-1);
        
    }
    
    public void stone (int n){
        System.out.println(n);
        
        if(n == 1){
            return ;
        }
        if (n % 2 == 0){
            stone(n/2);
        }else{
             stone(3 * n + 1);
            
        }
        
    }
    public String binaryConvert(int n) {
         String bin = "";
         
         if (n == 1) {
            bin = "1";
            return bin;
         } 
         if (n == 0) {
             bin = "0";
             return bin;
         }
         
         if (n > 1) {
            
             if (n % 2 == 0) {
                 bin = "0";
             }
              
             if (n % 2 == 1) {
                 bin = "1";
             }
         }
        
         n = n / 2;
         
         return binaryConvert(n) + bin;
     }
    public String convert(int n, int b) {
          
         if(n == 1) {
             return "1";
         } else if (n == 0){
             return "";
         }
         
         
         String result = "";
         
         
         if (n % b < 10) {
             int answer = n % b;
             result = String.valueOf (answer);
          
         } else if (n % b == 10) {
             result = "A";
         } else if (n % b == 11) {
             result = "B";
         } else if (n % b == 12) {
             result = "C";
         } else if (n % b == 13) {
             result = "D";
         } else if (n % b == 14) {
             result = "E";
         } else if (n % b == 15) {
             result = "F";
         }
          
         n = n / b;
         
         return convert(n , b) + result;
         
     }
    
     public boolean isPalindrome(String s, int length) {
         //taking the length of the word
         if (s.length() == 0 || s.length() == 1) {
            return true;
         }
         //comparing and subtracting
         if (s.charAt(0) == s.charAt(length - 1)) {
              
            
             return isPalindrome(s.substring(length), length);
 
         } else {
            
             return false;
         }
     }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Q1 test = new Q1();
        //outputting all of the answers
        System.out.println("Q1. " + test.digitalSum(1234));
        System.out.println("Q2. " + test.digitalRoot(2019));
        System.out.println("Q3. " + test.digitalTriangle(2));
        test.stone(12);
        System.out.println("Q5. " + test.binaryConvert(13));
        System.out.println("Q6. " + test.convert(1000,8));
        System.out.println("Q7. " + test.isPalindrome("racecar", 4));
    }
}
