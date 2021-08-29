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
 abstract class Animal {
     
    protected String name;

    protected abstract String getName();
    protected abstract void setName(String name);
    
    
    protected abstract int eat(Food food, int m);

    protected abstract Animal haveBaby(String name);

    protected abstract void scanInfo();

}
