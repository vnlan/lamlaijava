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
public class Cat extends Animal implements ratHunter{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void Eating() {
        System.out.println(this.name+" eating");
    }

    @Override
    public void ratHunting() {
        System.out.println(this.name+ " is hunting Rat!");
    }

    @Override
    public void Playing() {
        System.out.println(this.name+ " is playing!");
    }

}
