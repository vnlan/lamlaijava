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
public class Fish extends Animal{

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
    public Fish haveBaby(String name) {
        Fish f = new Fish();
        f.setName(name);
        System.out.println("A fish name: "+f.getName()+" was born");
        return f;
    }

    @Override
    public void scanInfo() {
        System.out.println("\nI am a Fish. My name is: " + this.name +"\n");
    }
    public void swim(){
        System.out.println("\n"+ this.name +": I am swimming!"+"\n");
    }
    public void dive(){
        System.out.println("\n"+ this.name +": I am diving!"+"\n");
    }
    
}
