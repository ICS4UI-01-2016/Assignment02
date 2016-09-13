
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A2Q1 {

    public int Digitalsum(int num){
        
        if( num>-1 && num <11){//if the number is between 1 and 10 return the number entered
            return num;//retunr the number it self 
        }
        return (num%10)+ Digitalsum(num/10);//add the digits of the number enetered by the user.
    }
    
    
    
    
    
    public static void main(String[] args) {
          A2Q1 test= new A2Q1();//question 2 test***
          Scanner input = new Scanner(System.in);//new scanner 
          System.out.println("please enter a number");//ask user to enter a number 
          int num=input.nextInt();//allow user to enter a number 
          //tell user the sum of all the number entered
         System.out.println(" The sum of the number is " +test.Digitalsum(num));
        
        
    }
}
