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
public class Rectangle extends Shape {
    double whith;
    double heigth;

    public Rectangle(double whith, double heigth, int numSides) {
        super(numSides);
        this.whith = whith;
        this.heigth = heigth;
    }
    
    @Override
    public double Getarea(){
        return (this.whith*this.heigth);
    }
    public double Getperimeter(){
        return((2*(this.whith) ) + (2*(this.heigth)));
    }
    
}
