/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Excercise2 {

    public int digitalSum(int n){
        //if n only has 1 digit
        if(n < 10){
            return n;
        }
        
        //get the digits
        int x = n % 10;
        int y = n / 10;
        
        //return the sum of the digits
        return x + digitalSum(y);
    }
    
    public int digitalRoot(int n){
        //if n is only 1 digit
        if(n < 10){
            return n;
        }
        
        //get last digit
        int x = n % 10;
        
        //get first digits
        int y = n / 10;
        
        //get total
        int total = x + digitalRoot(y);
        
        //make sure total is one digit
        if(total > 10){
            total = digitalRoot(y);
        }
        
        //return statement
        return total;
    }
    
     public int triangle(int n){
        //if n is 0 or 1
        if(n == 2 || n == 1){
            return n;
        }
        
        //return the answer
        return n + triangle(n - 1);
    }
     
     public int hailstone(int n){
        //output the first number
        System.out.println(n);
  
        //make loop that outputs all numbers in sequence
        if(n == 1){
            return n;
        }
        if(n % 2 == 0){
            return hailstone (n / 2);
            
        }else{
            return hailstone (3 * n + 1);
        }
    }
     
      public String binaryConvert(int n){
        //make string to output answer
        String number = new String();
        
        //make if statement to get binary digits
        if(n % 2 == 0){
            number = ("0");
        }else if(n % 2 == 1){
            number = ("1");
        }
        
        //if n equals 1 the loop ends
        if(n == 1){
            return number;
        }
        
        //return answer
        return binaryConvert(n / 2) + number;
    
    }
      
      public String convert(int n, int b){
        //make string to output answer
        String answer = new String();
      
        //get answer
        if(n % b == 0){
            answer = ("0");
        }
        if(n % b == 1){
            answer = ("1");
        }
        if(n % b == 2){
            answer = ("2");
        }
        if(n % b == 3){
            answer = ("3");
        }
        if(n % b == 4){
            answer = ("4");
        }
        if(n % b == 5){
            answer = ("5");
        }
        if(n % b == 6){
            answer = ("6");
        }
        if(n % b == 7){
            answer = ("7");
        }
        if(n % b == 8){
            answer = ("8");
        }
        if(n % b == 9){
            answer = ("9");
        }
        if(n % b == 10){
            answer = ("A");
        }
        if(n % b == 11){
            answer = ("B");
        }
        if(n % b == 12){
            answer = ("C");
        }
        if(n % b == 13){
            answer = ("D");
        }
        if(n % b == 14){
            answer = ("E");
        }
        if(n % b == 15){
            answer = ("F");
        }
        
        //base case
        if(n / b == 0){
            return answer;
        }
        
        //return statement
        return convert(n / b, b) + answer;
    }
      
      public boolean isPalindrome(String s, int length){
        //base case
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        
        //determines if string is a palindrome or not
        if(s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindrome(s.substring(1, s.length() - 1), 0);
        }
           
        //return statement
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create methods
        Excercise2 Q1 = new Excercise2();
        Excercise2 Q2 = new Excercise2();
        Excercise2 Q3 = new Excercise2();
        Excercise2 Q4 = new Excercise2();
        Excercise2 Q5 = new Excercise2();
        Excercise2 Q6 = new Excercise2();
        Excercise2 Q7 = new Excercise2();
        
        //output answers
        System.out.println("Q1: " + Q1.digitalSum(43535434));
        System.out.println("Q2: " + Q2.digitalRoot(276));
        System.out.println("Q3: " + Q3.triangle(4636));
        System.out.println("Q4: " + Q4.hailstone(12));
        System.out.println("Q5: " + Q5.binaryConvert(156));
        System.out.println("Q6: " + Q6.convert(1000, 16));
        System.out.println("Q7: " + Q7.isPalindrome("smiles", 0));
    }
}
