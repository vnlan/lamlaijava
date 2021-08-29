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
public class Shape_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rc = new Rectangle(5,10);
        System.out.println("Diện tích: "+ rc.getArea());
        System.out.println("Chu vi: "+ rc.getPerimeter());
    }
    
}
