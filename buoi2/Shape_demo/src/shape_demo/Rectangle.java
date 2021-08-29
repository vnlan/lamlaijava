/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_demo;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
    @Override
    public double getArea(){
       return myWidth * myHeight;
    }
    @Override
    public double getPerimeter(){
       return (myWidth + myHeight)*2;
    }

    public Rectangle(int myWidth, int myHeight) {
        this.myWidth = myWidth;
        this.myHeight = myHeight;
    }
}
