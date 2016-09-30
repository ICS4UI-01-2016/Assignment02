
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class Exercise2 {    // the entire assignment 

    public int digitalSum(int N) {  // method for question one 

    if (N >= 0 && N <= 9){  // if n is equal or more then 0 and equal or less than 9 - do the following
        return N;   // return n
    }
    int F = N % 10; // taking off the last digit and storing it in integer F
    
    int B = N / 10; // taking off the next digit and storing it in integer B
     
    return digitalSum(B) + (F); // taking the integers and adding them together to get the final sum
    
    }
    
    public int digitalRoot(int N) { // method for question two

        if (N >= 0 && N <= 9) { // while n is more then or equal to zero and less then or equal to 9 do the following 
            return N;   // return n 
        }

        int F = N % 10; // taking off the last digit and storing it in integer F

        int B = N / 10; // taking off the next digit and storing it in integer B 

        int C = (B) + (F);  // taking the integers and adding them together to store in integer C

        int P = C % 10; // taking the last digit off the value stored in C and storing it in P

        int D = C / 10; // taking the other digit from C and storing it in D 

        return digitalRoot(D) + (P);    // taking the two numbers and adding them together to get the final sum of the digits 

    }
    
    public int triangle(int N) {    // method for question three

        if (N == 0 || N == 1) { // if n is equal to 0 or 1 do the following 
            return N;   // return n
        }
        
        return N + triangle(N - 1); // if not then return [n + triangle(n - 1)] 
        
    }
    
    public void hailstone(int N) {  // method for question four

        System.out.println(N);  // printing out the integer n

        if (N == 1) {   // the base case is if n is equal to one then do the following
            return; // return one 
        }
        
        if (N % 2 == 0) {   // seeing if this number is even and if it is do the following  
            hailstone(N / 2);   // take the number and divide it by 2 
        } else {    // if the number is odd do the following 
            hailstone(3 * N + 1);   // multiply the number by 3 and add one 
        }
    }
    
    public String binaryConvert(int N) {    // method for question five

        String num = new String();  // creating a string 

        if (N % 2 == 0) {   // seeing if the number is even: if so do the following 
            num = ("0");    // output a zero 
        } else if (N % 2 == 1) {    // if the number is off: do the following 
            num = ("1");    // output a one 
        }

        if (N == 1) {   // if the number is equal to one do the following
            return num; // return the num that was inputted
        }

        return binaryConvert(N / 2) + num;  // return [(N / 2) + num]

    }
    
    public String convert(int n, int b) {   // method for question six 

        String word = new String(); // creating the string for the word

        if (n % b == 0) {   // if (n % b) is 0 do the following
            word = "0"; // output a 0
        }

        if (n % b == 1) {   // if (n % b) is 1 do the following
            word = "1"; // output a 1
        }

        if (n % b == 2) {   // if (n % b) is 2 do the following
            word = "2"; // output a 2
        }

        if (n % b == 3) {   // if (n % b) is 3 do the following
            word = "3"; // output a 3
        }

        if (n % b == 4) {   // if (n % b) is 4 do the following
            word = "4"; // output a 4
        }

        if (n % b == 5) {   // if (n % b) is 5 do the following
            word = "5"; // output a 5
        }

        if (n % b == 6) {   // if (n % b) is 6 do the following
            word = "6"; // output a 6
        }

        if (n % b == 7) {   // if (n % b) is 7 do the following
            word = "7"; // output a 7
        }

        if (n % b == 8) {   // if (n % b) is 8 do the following
            word = "8"; // output a 8
        }

        if (n % b == 9) {   // if (n % b) is 9 do the following
            word = "9"; // output a 9
        }

        if (n % b == 10) {  // if (n % b) is 10 do the following
            word = "A"; // output a A
        }

        if (n % b == 11) {  // if (n % b) is 11 do the following
            word = "B"; // output a B
        }

        if (n % b == 12) {  // if (n % b) is 12 do the following
            word = "C"; // output a C
        }

        if (n % b == 13) {  // if (n % b) is 13 do the following
            word = "D"; // output a D     
        }

        if (n % b == 14) {  // if (n % b) is 14 do the following
            word = "E";// output a E
        }

        if (n % b == 15) {  // if (n % b) is 15 do the following
            word = "F";// output a F
        }

        if (n / b == 0) {   // if n / b is equal to 0 then do the following 

            return word;    // return the word 
        }

        return convert(n / b, b) + word;    // return the convert(n / b, b) + word

    }
    
    public boolean isPalindrome(String s) {  // method for question seven  
    
    if(s.length() == 1 || s.length() == 0){ // when the word is 1 or 0 letters long - do the following
        return true;    // return true
    }
    
    if(s.charAt(0) == s.charAt(s.length() - 1)){    // if the words first letter is the same as the last letter - do the following 
        
        return isPalindrome(s.substring(1, s.length() - 1));    // keep doing that until it goes through the whole word
    }
    
    return false;   // if that does not work return that the word is not a palindrome
    
    }
    
    public static void main(String[] args) {    // the main method 
        
        Exercise2 a2 = new Exercise2(); // creating a variable to use in the system out statements 
        
        System.out.println("The total sum of digits is " + a2.digitalSum(126) + ".");   // outputting the total sum of the digits
        System.out.println("The total of the digits added up is " + a2.digitalRoot(2019) + ".");    // outputting the total sum of the digits for question two
        System.out.println("There will be " + a2.triangle(3) + " blocks in this row."); // outputting the number of blocks in that row
        a2.hailstone(12);   // outputting the hailstone sequence
        System.out.println("The number in binary is " + a2.binaryConvert(156)); // outputting the number in binary 
        System.out.println(a2.convert(1000, 16));   // outputting the converted numbers into other numbers or letters
        System.out.println(a2.isPalindrome("racecar"));  // outputting whether or not the word is a palindrome
        
    }
}
