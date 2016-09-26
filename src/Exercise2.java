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
        // 
        return digitalSum(n % 10) + digitalSum(n / 10);
    }
    // problem 2

    public int digitalRoot(int n) {
        if (n <= 9) {
            return n;
        }
        n = digitalRoot(n % 10) + digitalRoot(n / 10);
        if (n > 9) {
            n = digitalRoot(n % 10) + digitalRoot(n / 10);
        }
        return n;
    }
    // problem 3

    public int triangle(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        n = n + triangle(n - 1);
        return n;
    }
    // problem 4

    public static void hailstone(int n) {
        System.out.println(n);
        if (n > 1) {
            if (n % 2 == 0) {
                hailstone(n / 2);
            }
            if (n % 2 == 1) {
                hailstone(3 * n + 1);
            }
        }
    }
    // problem 5

    public String binaryConvert(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        if (n % 2 == 0) {
            return binaryConvert(n / 2) + "0";
        } else {
            return binaryConvert(n / 2) + "1";
        }
    }
    // problem 6

    public String convert(int n, int b) {
        if (n < b) {
            if (n == 0) {
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
        if (length == 0 || length == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(length - 1)) {
            return isPalindrome(s.substring(1), (length - 1) - 1);
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        System.out.println("Digital Sum: " + test.digitalSum(473));
        System.out.println("Digital Root: " + test.digitalRoot(666));
        System.out.println("Number of Blocks: " + test.triangle(4));
        test.hailstone(17);
        System.out.println("Binary: " + test.binaryConvert(15));
        System.out.println(test.convert(123, 5));
        System.out.println(test.isPalindrome("racecar", 7));

    }
}
