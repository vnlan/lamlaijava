/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

/**
 *
 * @author Admin
 */
public abstract class Animal implements Play{
    
    protected String name;
    
    public Animal() {
        
    }

    public Animal(String name) {
        this.name = name;
    }
    protected abstract void Eating();
}
