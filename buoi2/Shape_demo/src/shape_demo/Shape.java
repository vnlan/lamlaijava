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
public abstract class Shape {
    protected int myWidth;
    protected int myHeight;

    public Shape() {
    }

    public Shape(int myWidth, int myHeight) {
        this.myWidth = myWidth;
        this.myHeight = myHeight;
    }

    public int getMyWidth() {
        return myWidth;
    }

    public void setMyWidth(int myWidth) {
        this.myWidth = myWidth;
    }

    public int getMyHeight() {
        return myHeight;
    }

    public void setMyHeight(int myHeight) {
        this.myHeight = myHeight;
    }
    abstract double getArea();

    abstract double getPerimeter();
}
