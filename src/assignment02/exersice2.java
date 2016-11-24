/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;



/**
 *
 * @author fostp4040
 */
public class exersice2 {

    public int digitalSum(int n){
        //seperate the first digit
        int dig1 = n%10;
        //seperate the second digit
        int dig2 = n/10%10;
        //seperate the third digit
        int dig3 = n/10/10;
        //add up the digits
        return dig1+dig2+dig3;
    }
    public int digitalRoot(int n){
        //seperate the first digit
        int dig1 = n%10;
        //seperate the second digit
        int dig2 = n/10%10;
        //seperate the third digit
        int dig3 = n/10/10;
        //add up the digits
        int dig = dig1+dig2+dig3;
        //seperate the new number's digits
        int dig4 = dig%10;
        int dig5 = dig/10%10;
        int dig6 = dig/10/10;
        //add all the new digits
        return dig4+dig5+dig6;
     }
    public int triangle(int n){
        if(n==0){
             return 0;
         }else if(n==1){
             return 1;
         }
        return (n+triangle(n-1));
    }
    public void hailstone(int n){
        //check if n is even or odd
        if(3*n+1==1||n/2==1){
             //stop when n equals 1
             System.out.println(1);
        }
        if(n%2==1&&n>1){
             //multiply n by 3 then add it by one if odd
             System.out.println(3*n+1);
             hailstone(3*n+1);
         }else if(n%2==0&&n>1){
             //divide in half if even
              System.out.println(n/2);
              hailstone(n/2);
         }
    }
    public String binaryCovert(int n){
        String word = "";
        //divide number in half
       
        if(n%2==1){
            word = "1";
        }else if(n%2==0){
            word = "0";
        }
        if(n/2==1){
            word = "1";
           return word;
        }
        return binaryCovert(n/2) + word;
    }
    public static String convert(int n, int b) {
        //A blank string that is used to add number to (you can not add a string to int so this does it)
        String word = "";

        //base case: returns the word once n = 1 
        if (n == 1) {
            word = "" + n % b;
            return word;
        }
        //When the base is higher than n
        if (n < b) {
            //if number = 10, prints out A as replacement
            if (n == 10) {
                word = "A";
                //if number = 10, prints out A as replacement
            } else if (n == 11) {
                word = "B";
                //if number = 10, prints out A as replacement
            } else if (n == 12) {
                word = "C";
                //if number = 10, prints out A as replacement
            } else if (n == 13) {
                return "D";
                //if number = 10, prints out A as replacement
            } else if (n == 14) {
                return "E";
                //if number > or equal to 15, prints out F as replacement
            } else if (n >= 15) {
                return "F";
            }else if (n >= 16) {
                return "G";
            }
            //If the user inputs a number less than base, return the number.
            if (n < b) {
                return "" + n;
            }
        }
        //if number = base then it returns 0 
        if (n == b) {
            return "0";
            //if remainder is less than 10, prints it
        } else if (n % b < 10) {
            word = "" + n % b;
            //if remainder is 10, prints A as replacement
        } else if (n % b == 10) {
            word = "A";
            //if remainder is 11, prints B as replacement
        } else if (n % b == 11) {
            word = "B";
            //if remainder is 12, prints C as replacement
        } else if (n % b == 12) {
            word = "C";
            //if remainder is 13, prints D as replacement
        } else if (n % b == 13) {
            word = "D";
            //if remainder is 14, prints E as replacement
        } else if (n % b == 14) {
            word = "E";
            //if remainder is 15 and above, prints F as replacement
        } else if (n % b >= 15) {
            word = "F";
        }

        //divides number by the base and keeps base constant, then prints the results from above
        return convert(n / b, b) + word;

    }
    public static boolean isPalindrome(String s, int length) {

        //length acts as a counter, once it reaches 1 or 0 (negative wouldn't be possible) it returns true
        if (length <= 1) {
            return true;
        }
        //takes last letter and stores it as "last"
        String last = s.substring(s.length() - 1, s.length());
        //takes first letter and stores it as "first"
        String first = s.substring(0, 1);
        //ditches out the last letter by default 
        String lastIsGone = s.substring(0, s.length() - 1);

        //if first letter DOES equal or resemble last letter then return true 
        if (last.equals(first)) {
            //takes the variable "lastIsGone" and removes first letter
            lastIsGone = lastIsGone.replaceFirst(first, "");
            //s (original word) is now lastIsGone! that way it ensures modified is saved
            s = lastIsGone;
        }

        //if first letter does NOT equal or resemble last letter then return false
        if (!last.equals(first)) {
            return false;
        }

        //return statement that returns both the word (that is modified) and the length of word (modified)
        return isPalindrome(s, length-2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        exersice2 test=new exersice2();
        System.out.println(test.digitalSum(126));
        System.out.println(test.digitalRoot(49));
        System.out.println(test.triangle(3));
        test.hailstone(5);
        System.out.println(test.convert(1000,16));
        System.out.println(test.isPalindrome("pop",3));
    }
}
