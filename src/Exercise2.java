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

    
    public String Convert(int n, int b, int iteration ){
        String [] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String value = "";
 
        //System.out.println( n );
   
        for (int i=0;i<iteration; i++ ) {
            System.out.print(">");
        }
        System.out.println(" Convert ( " + n +"," + b +")");
                   
        // determine if the number is larger than a single digit in the base.
        // If it is recurse to process the next position/digit
        if(n >= b){
            value = Convert(n / b, b, iteration + 1);
        }
        
        for (int i=0;i<iteration; i++ ) {
            System.out.print(">");
        }
        System.out.println(" After-Call to Convert ( " + n +"," + b +")");
      //  System.out.println( ">" + value );
        
        // determine the remainder and append the remainder in string form
        value = value + digit[ n % b ];
        
        return value;
    }
    
//    public void binaryConvert(int n){
//        if(n / 2 != 0){
//            binaryConvert(n / 2);
//        }
//        System.out.print(n % 2);
//    }
    
//    public int convert(int n, int b) {
//        
//    }
//    
//    public boolean Palindrome(String s, int length) {
//        boolean p = true;
//        if(length == 0 || length == 1 || p == false){
//            return p;
//        }
//        
//        if(s.charAt(1) == s.charAt(length)){
//            p = true;
//            s.substring(2, length - 1);
//            Palindrome (s, length);
//        }else{
//            p = false;
//        }
//        
//        return p;
//    }
    
    
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println(test.digitalSum(126));
        System.out.println(test.digitalRoot(2019));
        System.out.println(test.triangle(4));
        test.hailstone(5);
        System.out.println( test.binaryConvert(1000) );
//        test.binaryConvert(1000);
        System.out.println(" 1000 converted:");
        System.out.println( test.Convert( 123456, 5, 1 ));
//      System.out.println(test.Palindrome("dad", 3));
        
    }
}
