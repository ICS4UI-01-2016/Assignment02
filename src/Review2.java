/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Review2 {
    
    public double circleArea(double radius){
        double answer = Math.PI*radius*radius;
        return answer;
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Review2 tests = new Review2();
        double area = tests.circleArea(3);
        System.out.println("Area: " + area);
    }
}
