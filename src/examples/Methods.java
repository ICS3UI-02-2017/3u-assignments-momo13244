/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author elmam0030
 */
public class Methods {
    
    // calucalates positive root of quadratic formula
    public static double posQuadForm(double a, double b, double c){
        double discrim = b*b - 4*a*c;
        double root = (-b + Math.sqrt(discrim))/(2*a);
        // send back the root
        return root;
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // calculate the +ve roo of 3x^2+7x+1.5
       double pRoot = posQuadForm(3,7,1.5); 
       System.out.println(pRoot);
    }
}
