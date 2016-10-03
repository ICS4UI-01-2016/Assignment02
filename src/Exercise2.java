/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Exercise2 {
    // problem 1

    public int digitalSum(int n) {
        // if number is less than or equal to 9
        if (n <= 9) {
            // return number
            return n;
        }
        // return remainder plus number divided by 10
        return digitalSum(n % 10) + digitalSum(n / 10);
    }
    // problem 2

    public int digitalRoot(int n) {
        // if number is less than or equal to 9
        if (n <= 9) {
            // return number
            return n;
        }
        // return remainder plus number divided by 10
        n = digitalRoot(n % 10) + digitalRoot(n / 10);
        // if number is more than 9
        if (n > 9) {
            // return remainder plus number divided by 10
            n = digitalRoot(n % 10) + digitalRoot(n / 10);
        }
        // return number
        return n;
    }
    // problem 3

    public int triangle(int n) {
        // if number is 0 or 1
        if (n == 0 || n == 1) {
            // return number
            return n;
        }
        
        n = n + triangle(n - 1);
        return n;
    }
    // problem 4

    public static void hailstone(int n) {
        // print number typed in
        System.out.println(n);
        // if number is greater than 1
        if (n > 1) {
            // if number is even
            if (n % 2 == 0) {
                // return number divided by 2
                hailstone(n / 2);
            }
            // if number is odd
            if (n % 2 == 1) {
                // return 3*n+1
                hailstone(3 * n + 1);
            }
        }
    }
    // problem 5

    public String binaryConvert(int n) {
        // if number is 0
        if (n == 0) {
            // return "0"
            return "0";
        }
        // if number is 1
        if (n == 1) {
            // return "1"
            return "1";
        }
        // if number is even
        if (n % 2 == 0) {
            // return "0" and divide number by 2
            return binaryConvert(n / 2) + "0";
            // if number is odd
        } else {
            // return "0" and divide number by 2
            return binaryConvert(n / 2) + "1";
        }
    }
    // problem 6

    public String convert(int n, int b) {
        // if number is less than base
        if (n < b) {
            // if number is 0
            if (n == 0) {
                // return "0"
                return "0";
            }
            if (n == 1) {
                return "1";
            }
            if (n == 2) {
                return "2";
            }
            if (n == 3) {
                return "3";
            }
            if (n == 4) {
                return "4";
            }
            if (n == 5) {
                return "5";
            }
            if (n == 6) {
                return "6";
            }
            if (n == 7) {
                return "7";
            }
            if (n == 8) {
                return "8";
            }
            if (n == 9) {
                return "9";
            }
            if (n == 10) {
                return "A";
            }
            if (n == 11) {
                return "B";
            }
            if (n == 12) {
                return "C";
            }
            if (n == 13) {
                return "D";
            }
            if (n == 14) {
                return "E";
            }
            if (n == 15) {
                return "F";
            }
        }
        // if there is a remainder of 0
        if (n % b == 0) {
            return convert(n / b, b) + "0";
        } else if (n % b == 1) {
            return convert(n / b, b) + "1";
        } else if (n % b == 2) {
            return convert(n / b, b) + "2";
        } else if (n % b == 3) {
            return convert(n / b, b) + "3";
        } else if (n % b == 4) {
            return convert(n / b, b) + "4";
        } else if (n % b == 5) {
            return convert(n / b, b) + "5";
        } else if (n % b == 6) {
            return convert(n / b, b) + "6";
        } else if (n % b == 7) {
            return convert(n / b, b) + "7";
        } else if (n % b == 8) {
            return convert(n / b, b) + "8";
        } else if (n % b == 9) {
            return convert(n / b, b) + "9";
        } else if (n % b == 10) {
            return convert(n / b, b) + "A";
        } else if (n % b == 11) {
            return convert(n / b, b) + "B";
        } else if (n % b == 12) {
            return convert(n / b, b) + "C";
        } else if (n % b == 13) {
            return convert(n / b, b) + "D";
        } else if (n % b == 14) {
            return convert(n / b, b) + "E";
        } else if (n % b == 15) {
            return convert(n / b, b) + "F";
        }
        return convert(n, b);
    }
    // problem 7

    public boolean isPalindrome(String s, int length) {
        // if word has 1 letter
        if (length == 0 || length == 1) {
            // return true
            return true;
        }
        // if first letter is the same as last letter
        if (s.charAt(0) == s.charAt(length - 1)) {
            // looks through the next letters
            return isPalindrome(s.substring(1), (length - 1) - 1);
            // if first and last letter searched do not equal
        } else {
            // return false
            return false;
        }
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println("Digital Sum: " + test.digitalSum(325));
        System.out.println("Digital Root: " + test.digitalRoot(325));
        System.out.println("Number of Blocks: " + test.triangle(4));
        test.hailstone(17);
        System.out.println("Binary: " + test.binaryConvert(325));
        System.out.println(test.convert(325, 5));
        System.out.println(test.isPalindrome("racecar", 7));

    }
}
