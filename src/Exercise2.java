
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to select question.");
        int a = input.nextInt();
        if (a==1){
            System.out.println("You selected DigitalSum. Enter your number.");
            int n = input.nextInt();
            int answer = DigitalSum(n);
            System.out.println(answer);
        }
        if (a==2){
            System.out.println("You selected DigitalRoot. Enter your number.");
            int r = input.nextInt();
            int answer2 = DigitalRoot(r);
            System.out.println(answer2);
        }
        if (a==3){
            System.out.println("You selected Triangle. Enter your number.");
            int t = input.nextInt();
            int answer3 = Triangle(t);
            System.out.println(answer3);
        }
        if (a==4){
            System.out.println("You selected Hailstone. Enter your number.");
            int h = input.nextInt();
            int answer4 = Hailstone(h);
            System.out.println(answer4);
        }
        if (a==5){
            System.out.println("You selected BinaryConvert. Enter your number.");
            int b = input.nextInt();
            String answer5 = BinaryConvert(b);
            System.out.println(answer5);
        }
        if (a==6){
            System.out.println("You selected Convert. Enter your number.");
            int c = input.nextInt();
            System.out.println("Now enter a number to divide by.");
            int C = input.nextInt();
            String answer6 = Convert(c, C);
            System.out.println(answer6);
        }
        if (a==7){
            System.out.println("You selected isPalindrome. Enter your number.");
            String S = input.nextLine();
            int length = S.length();
            boolean answer7 = isPalindrome(S, length);
            System.out.println(answer7);
        }
        
        
    }
    
        
    public static int DigitalSum (int n) {  //Problem 1
            if(n <= 9){
                return n;
            } 
        return DigitalSum(n/10) + DigitalSum(n%10);
        }
    
    public static int DigitalRoot (int r){  //Problem 2
        while(r > 9){
            r = (r/10) + (r%10);
        }
        return r;
    }
    
    public static int Triangle (int t){  //Problem 3
        if(t==1){
            return 1;
        } if (t==0){
            return 0;
        }
        return t + Triangle(t-1);
    }
    
    public static int Hailstone (int h){  //Problem 4
       while(h > 1){ 
       if(h%2==0){
           h= Hailstone (h/2);
       } else if(h%2==1) {
           h= Hailstone((h*3)+ 1);
       }
       }
        return h;
    }
    
    public static String BinaryConvert (int b) {  //Problem 5
        if(b==0){
            return "0";
        } if (b==1){
            return "1";
        }
        
        if (b % 2 == 0){
            return BinaryConvert(b/2) + "0";
        }else{
            return BinaryConvert(b/2) + "1";
        }    
    }
    
    public static String Convert(int c, int C){
        c = c%C;
        if(c == 10){
            return "A";
            
        } else if(c == 11){
            return "B";
            
        } else if(c == 12){
            return "C";
            
        } else if(c == 13){
            return "D";
            
        } else if(c == 14){
            return "E";
            
        } else if(c == 15){
            return "F";
            
        } else if(c == 1){
            return "1";
            
        } else if(c == 2){
            return "2";
            
        } else if(c == 3){
            return "3";
            
        } else if(c == 4){
            return "4";
            
        } else if(c == 5){
            return "5";
            
        } else if(c == 6){
            return "6";
            
        } else if(c == 7){
            return "7";
            
        } else if(c == 8){
            return "8";
            
        } else if(c == 9){
            return "9";
        }
        return Convert(c,C) ;
    }
    
    public static boolean isPalindrome(String S, int length){
        if (length <= 1) {
            return true;
        }
        
        String last = S.substring(S.length() - 1, S.length());
        String first = S.substring(0,1);
        String lastIsGone = S.substring(0, S.length() - 1);
        if (last.equals(first)) {
            lastIsGone = lastIsGone.replaceFirst(first, "");
            S = lastIsGone;
        }
        if (!last.equals(first)) {
            return false;
        }
        return isPalindrome(S, length - 2);
    }
        
        
                
}
