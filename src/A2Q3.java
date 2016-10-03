/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q3 {

    public int triangle(int N) {

        if (N == 0 || N == 1) {
            return N;
        }
        
        return N + triangle(N - 1);
        
    }
    
    public static void main(String[] args) {
    
        A2Q3 row = new A2Q3();
        int row2 = row.triangle(3);
        System.out.println(row2);
    
    }
}
