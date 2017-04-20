/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract2;

/**
 *
 * @author Estudiante
 */
public class Abstract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape rectangulo = new Rectangle(6,5,4);
        int l = rectangulo.getNumSides();
        double a = rectangulo.Getarea();
        double p = rectangulo.Getperimeter();
        
        System.out.println(l + " " + a + " " + p);
    }
    
}
