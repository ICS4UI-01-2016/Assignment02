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
    
    public int digitalSum(int n){
        if(n < 10){
            return n;
        }
        return digitalSum(n / 10) + (n % 10);
    }
    
    public int digitalRoot(int n){
        int sum = digitalSum(n);
        if(sum < 10){
            return sum;
        }
        return digitalRoot(sum);
    }
    
    public int triangle(int n){
        if(n == 0){
            return n;
        }
        return triangle(n-1) + n;
    }
    
    public void hailstone(int n){
        System.out.println(n);
        if(n > 1){
            if((n % 2) == 0){
                hailstone(n/2);
            } else{
                hailstone(3*n+1);
            }
        }
    }
    
    public String binaryConvert(int n){
        String value = "";
        
        // is number larger than 2, if yes then recurse
        if(n / 2 != 0){
            value = binaryConvert(n / 2);
        }
        // determine the remainder and append the remainder in string form
        if ( n % 2 == 0 ) {
            value = value + "0";
        } else {
            value = value + "1";
        }
        return value;
    }

//    public void binaryConvert(int n){
//        if(n / 2 != 0){
//            binaryConvert(n / 2);
//        }
//        System.out.print(n % 2);
//    }
    
    public String convert(int n, int b){
        String [] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String value = "";
                   
        // determine if the number is larger than a single digit in the base.
        // If it is recurse to process the next position/digit
        if(n >= b){
            value = convert(n / b, b);
        }
        
        // determine the remainder and append the remainder in string form
        value = value + digit[ n % b ];
        
        return value;
    }
    
    public boolean Palindrome(String s,int length) {
        boolean p = true;
        int start = 0;
        s.substring(start, length);
        System.out.println(start + " " + length);
        System.out.println(s.charAt(start) + " " + s.charAt(length));
        
        if(s.charAt(start) != s.charAt(length)){
            p = false;
            System.out.println(s.charAt(start) + s.charAt(length));
        }
        
        if(length <= 1 || p == false){
            return p;
        }
        
        start = start + 1;
        return Palindrome(s, length - 1);
    }
    
    
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        
        System.out.println("Question 1: " + test.digitalSum(126));
        
        System.out.println("Question 2: " + test.digitalRoot(2019));
        
        System.out.println("Question 3: " + test.triangle(4));
        
        System.out.println("Question 4: ");
        test.hailstone(5);
        
        System.out.println("Question 5: " + test.binaryConvert(1000) );
//        System.out.println("Question 5: ");
//        test.binaryConvert(1000);
        
        System.out.println("Question 6: " + test.convert(123456, 5));
        
        System.out.println("Question 7: " + test.Palindrome("racecar",(7) - 1));
    }
}
