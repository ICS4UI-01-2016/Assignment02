


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Problem1 {

    //create the palindrome method
    public static boolean isPalindrome(String s) {
        //if the word is just one letter, return true
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }

        //
        if (s.charAt(0) == s.charAt(s.length() - 1)) {

            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    //create the convert method
    public String convert(int n, int b) {

        //create the word
        String kip = new String();

        //if the converted number is 0-10, return the number it is converted to
        if (n % b == 0) {
            kip = "0";
        }

        if (n % b == 1) {
            kip = "1";
        }

        if (n % b == 2) {
            kip = "2";
        }

        if (n % b == 3) {
            kip = "3";
        }

        if (n % b == 4) {
            kip = "4";
        }

        if (n % b == 5) {
            kip = "5";
        }

        if (n % b == 6) {
            kip = "6";
        }

        if (n % b == 7) {
            kip = "7";
        }

        if (n % b == 8) {
            kip = "8";
        }

        if (n % b == 9) {
            kip = "9";
        }

        //if the converted is 10-15, return the corresponding letter in the aphabed starting from A
        if (n % b == 10) {
            kip = "A";
        }

        if (n % b == 11) {
            kip = "B";
        }

        if (n % b == 12) {
            kip = "C";
        }

        if (n % b == 13) {
            kip = "D";
        }

        if (n % b == 14) {
            kip = "E";
        }

        if (n % b == 15) {
            kip = "F";
        }

        if (n / b == 0) {
            return kip;
        }


        //method calls it self
        return convert(n / b, b) + kip;

    }

    //create the binary convert method
    public String binaryConverter(int n) {

        String numb = new String();

        //if the number is 0 return it
        if (n == 0) {
            return numb;
        }

        //divide the quotient by 2
        int divi = n / 2;

        //if the number mod 10 is 0, number is 0
        if (n % 2 == 0) {
            numb = ("0");
            
            //if the number mod 10 is 1, return 1
        } else if (n % 2 == 1) {
            numb = ("1");
        }


        //return the the number divided by 2 + the original number th method converted
        return binaryConverter(n / 2) + numb;


    }

    //create the hailstone method
    public int hailstone(int n) {

        //print out the number
        System.out.println(n);
        
        //if the number is 1, return it
        if (n == 1) {
            return n;
        }

        //if the n is even, return the number divided by 2
        if (n % 2 == 0) {
            return hailstone(n / 2);
            
        //otherwise return 3 * n + 1
        } else {
            return hailstone(3 * n + 1);
        }
    }

    //if there is no triangle or only one triangle, return n
    public int triangle(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        //return the number of triangles, move up a row, and return 1 less triangles, do this until there are no triangle in a row
        return n + triangle(n - 1);
    }

    //create the digital root method
    public int digitalRoot(int n) {
        
        //if the number is greater than 0 or lowere than 9, return n
        if (n >= 0 && n <= 9) {
            return n;
        }

        //chop off the last number
        int numbs = n % 10;
        
        //divide the quotient by 10
        int other = n / 10;
        
        //the remainder plus the chopped off number
        int toodles = (other) + (numbs);

        //take the number and do the same thing then return it
        int p = toodles % 10;
        int j = toodles / 10;
        return digitalRoot(j) + p;

    }

    //create the mothod
    public int digitalSum(int n) {

        //if the integer is more than or equal to 0 or less than or equal to 9 output it
        if (n >= 0 && n <= 9) {
            return n;
        }


        //take off last int
        int numbs = n % 10;
        //keep
        int other = n / 10;
        return digitalSum(other) + numbs;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create the variable
        Problem1 numa = new Problem1();

        //Method 1
        System.out.print("The digital sum is:" + numa.digitalSum(126));
        //method 2
        System.out.print("The digital root is: " + numa.digitalRoot(2019123));
        //method 3
        System.out.print("The rows of the triangle are: " + numa.triangle(3));
        //method 4
        System.out.print("The pattern is: " + numa.hailstone(12));
        //method 5
        System.out.println(numa.binaryConverter(156));
        //method 6
        System.out.println(numa.convert(1000, 16));
        //method 7
        System.out.println(numa.isPalindrome("smiles"));
    }
}
