/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q7 {

    public static boolean isPalindrome(String s) {
    
    if(s.length() == 1 || s.length() == 0){
        return true;
    }
    
    if(s.charAt(0) == s.charAt(s.length() - 1)){
        
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    
    return false;
    
    }
    
    public static void main(String[] args) {
     
    A2Q7 num = new A2Q7();    
    System.out.println(num.isPalindrome("smiles"));    
        
    }
}
