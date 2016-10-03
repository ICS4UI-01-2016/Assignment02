
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static int digitalSum(int n) {
        if (n <= 9) {
            return n;
        }

        return digitalSum(n / 10) + digitalSum(n % 10);
    }

    public static int digitalRoot(int n) {
        if (n <= 9) {
            return n;
        }
        return digitalRoot(n / 10) + digitalRoot(n % 10);

    }

    public static int triangle(int q) {
        if (q == 0 || q == 1) {
            return q;
        }
        return q + triangle(q - 1);
    }

    public static int hailstone(int h) {
        if (h < 0) {
            return 0;
        }
        if (h == 1) {
            return h;
        }
        if (h % 2 == 0) {
            System.out.println(h);
            return hailstone(h = h / 2);
        } else {
            System.out.println(h);
            return hailstone(h = 3 * h + 1);
        }
    }

    public static int binaryConvert(int b) {
        if (b == 0 || b == 1) {
            return b;
        } else {
            System.out.println(b % 2);
            return binaryConvert(b = b / 2);
        }
    }

    public String letter(int e) {
        if (e == 10) {
            return "A";
        }
        if (e == 11) {
            return "B";
        }
        if (e == 12) {
            return "C";
        }
        if (e == 13) {
            return "D";
        }
        if (e == 14) {
            return "E";
        }
        if (e == 15) {
            return "F";
        }
        return "" + e;
    }

    public String convert(int e, int f) {
        if (e == 0) {
            return "";
        } else {
            if ((e % f) >= 10 && e <= f) {
                return letter(e % f);
            }
            return convert(e / f, f) + letter(e % f);
        }

    }
    
    
            
    public boolean isPalindrome(String s, int Length){
        
        return true;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        A2 test = new A2();


//        System.out.println("Please enter a number for problem 1 and 2.");
//        int n = input.nextInt();
//        
//        int answer1 = digitalSum(n);
//        int answer2 = digitalRoot(answer1);
//        System.out.println(answer2);
//        
//        System.out.println("Please enter a number for problem 3.");
//        int q = input.nextInt();
//        
//        int triangle1 = triangle(q);
//        System.out.println(triangle1);
//        
//        System.out.println("Please enter a number for problem 4.");
//        int h = input.nextInt();
//        
//        int hailstone1 = hailstone(h);
//        System.out.println(hailstone1);
//        
//        System.out.println("Please enter a number for problem 5.");
//        int b = input.nextInt();
//        
//        System.out.println(binaryConvert(b));

        System.out.println("Please enter a positive integer for problem 6.");
        int e = input.nextInt();
        System.out.println("Please enter a base number for problem 6.");
        int f = input.nextInt();

        System.out.println(test.convert(e, f));
        
        System.out.println("Please enter a word for Problem 7.");
        String s = input.nextLine();
        int Length = s.length();
        
        System.out.println(test.isPalindrome(s, Length));
        












    }
}
