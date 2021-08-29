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
public class Bird extends Animal{

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int eat(Food food, int m) {
        System.out.println(this.name+ " eated");
        return food.getMass()-m;
    }

    @Override
    public Bird haveBaby(String name) {
        Bird b = new Bird();
        b.setName(name);
        System.out.println("A bird name: "+b.getName()+" was born");
        return b;
    }

    @Override
    public void scanInfo() {
        System.out.println("\nI am a Bird. My name is: " + this.name +"\n");
    }
    public void fly(){
        System.out.println("\n"+ this.name +": I am Flying!"+"\n");
    }
}
