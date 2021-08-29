/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Admin
 */
public class Food {
    private int mass;
    public Food() {
       this.mass = 10;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        if(mass<0){
            mass=0;
        }
        this.mass = mass;
    }
    
}
