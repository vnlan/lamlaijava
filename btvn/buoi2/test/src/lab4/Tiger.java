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
public class Tiger extends Animal{
    private int speed;

    public Tiger() {
    }
    
     @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void run(int speed){
        this.speed = speed;
        System.out.println("\n"+ this.name +": I am running with the speed of " +this.speed +"!\n");
    }
    
    @Override
    public Tiger haveBaby(String name){
        Tiger t = new Tiger();
        t.setName(name);
        System.out.println("A tiger name: "+t.getName()+" was born");
        return t;
    }

    @Override
    public int eat(Food food, int m) {
        System.out.println(this.name+ " eated");
        return food.getMass()-m;
    }

    @Override
    public void scanInfo() {
        System.out.println("\nI am a Tiger. My name is: "+this.name);
        System.out.println("I have speed: " + this.speed +"\n");
    }
}
