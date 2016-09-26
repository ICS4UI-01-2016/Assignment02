
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */



public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your your number for which problem you'd like ");
        int a = input.nextInt();

        if(a == 1){System.out.println("you have chosen digital sum, enter your number ");
        int d = input.nextInt();
    int answer = DigitalSum(d);
            System.out.println(answer);
        }
        if(a == 2){System.out.println("you have chosen DigitalSum2, enter your number");
        int n = input.nextInt();
        int answer2 = DSum2(n);
        System.out.println(answer2);
        }
        if(a == 3){System.out.println("you have chosen Trow, enter your number");
        int t = input.nextInt();
    int answer3 = Trow(t);
    System.out.println(answer3);
        }
        if(a == 4){ System.out.println("you have chosen hailstone, enter your number");
        int h = input.nextInt();
    int answer4 = Hailstone(h);
    System.out.println(answer4);
        }
        if(a == 5){System.out.println("you have chosen binary convert, enter your number");
       int c = input.nextInt();
    String answer5 = binaryconvert(c);
    System.out.println(answer5);    
        }
        if(a == 6){System.out.println("you have chosen convert, enter your number ");
      int n = input.nextInt();
              System.out.println("second number to divide problem 6");
        int b = input.nextInt();
    String answer6 = convert(n, b);
        System.out.println(answer6);
        }
        if(a == 7){System.out.println("you have chosen ispalindrome, enter your word");
        String s = input.nextLine();
        int length = s.length();
            boolean answer7 = isPalindrome(s, length);
            System.out.println(answer7);
        }
    }
    //Problem1
    public static int DigitalSum (int d){
  if(d>= 100){
    d =(d/10) + (d %10);
    return (d/10) + (d%10);
}
if(d>=9){
return (d / 10) + (d %10);
}
return d;
}
    //Problem2
    public static int DSum2 (int n){
        while (n>9){
            n = (n/10) + (n%10);
        }
        return n;
    }
    //Problem3
public static int Trow (int t){
    if(t==1){
        return 1;
}
     if(t==0){
        return 0;
}
     return t + Trow(t-1);
    }
public static int Hailstone (int h){
   
    while(h > 1){
      if(h % 2 == 1){
          h = (h*3)+1;
      } else if (h % 2 == 0){
        h = (h/2);
    }
    }
    
    return (h);
}
public static String binaryconvert(int c){
    if (c == 0){
        return "0";
    }else if(c == 1){
        return "1";
    }
    
    if (c % 2 == 0){
        return binaryconvert(c/2) + "0";
    }else{
        return binaryconvert(c/2) + "1";
    }
}
 public static String convert(int n, int b) {
        String word = "";
        if (n == 1) {
            word = "" + n % b;
            return word;
        }
        if (n < b) {
            if (n == 10) {
                word = "A";
            } else if (n == 11) {
                word = "B";
            } else if (n == 12) {
                word = "C";
            } else if (n == 13) {
                return "D";
            } else if (n == 14) {
                return "E";
            } else if (n >= 15) {
                return "F";
            }
            if (n < b) {
                return "" + n;
            }
        }
        if (n == b) {
            return "0";
        } else if (n % b < 10) {
            word = "" + n % b;
        } else if (n % b == 10) {
            word = "A";
        } else if (n % b == 11) {
            word = "B";
        } else if (n % b == 12) {
            word = "C";
        } else if (n % b == 13) {
            word = "D";
        } else if (n % b == 14) {
            word = "E";
        } else if (n % b >= 15) {
            word = "F";
        }
        return convert(n / b, b) + word;

    }
public static boolean isPalindrome(String s, int length){
     if (length <= 1) {
            return true;
        }
       
        String last = s.substring(s.length() - 1, s.length());
        String first = s.substring(0, 1);
        String lastIsGone = s.substring(0, s.length() - 1);
        if (last.equals(first)) {
            lastIsGone = lastIsGone.replaceFirst(first, "");
            s = lastIsGone;
        }
        if (!last.equals(first)) {
            return false;
        }
        return isPalindrome(s, length - 2);
    }
}


