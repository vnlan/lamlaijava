/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.Scanner;
import lab4.Bird;
import lab4.Fish;
import lab4.Food;
import lab4.Tiger;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       Bird bird1 = new Bird();
       Tiger tiger1 = new Tiger();
       Fish fish1 = new Fish();
       Food food = new Food();
       
       Bird birdbaby = new Bird();
       Tiger tigerbaby = new Tiger();
       Fish fishbaby = new Fish();
       
       Scanner sc =new Scanner(System.in);
       boolean quit = false;
       int option;
       String name;
       int speed;
       String stop;
       
       while(quit == false){
            System.out.println("================ Animal Program ================");
            System.out.println("1. Create a Bird, a Fish, a Tiger");
            System.out.println("2. Show their abilities");
            System.out.println("3. Feed the animals until run out of food");
            System.out.println("4. Let they have babies");
            System.out.println("5. Show babies' abilities");
            System.out.println("6. Exit");
            System.out.println("-------------------------------------------------");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    System.out.print("\nEnter your bird name: ");
                    name  = sc.nextLine();
                    bird1.setName(name);
                    System.out.println("\nA bird created with name: " + bird1.getName() + "\n");
                    System.out.print("\nEnter your fish name: ");
                    name  = sc.nextLine();
                    fish1.setName(name);
                    System.out.println("\nA fish created with name: " + fish1.getName() + "\n");
                    System.out.print("\nEnter your tiger name: ");
                    name  = sc.nextLine();
                    tiger1.setName(name);
                    System.out.print("\nEnter your tiger speed: ");
                    speed = sc.nextInt();
                    sc.nextLine();
                    tiger1.setSpeed(speed);
                    System.out.println("\nA tiger created with name: " + tiger1.getName() 
                            + " and speed: " + tiger1.getSpeed());
                    System.out.print("\n---Press Enter to go back---");
                    stop =  sc.nextLine();
                    break;
                case 2:
                    bird1.fly();
                    fish1.dive();
                    fish1.swim();
                    tiger1.run(tiger1.getSpeed());
                    System.out.print("\n---Press Enter to go back---");
                    stop =  sc.nextLine();
                    break;
                case 3:
                    int m;
                    System.out.println("\nYou have total "+ food.getMass() + " food\n");
                    
                       while(food.getMass()>0){
                           
                        System.out.print("\nEnter quantity to feed bird " + bird1.getName() + ": ");
                        m = sc.nextInt();
                        sc.nextLine();
                        food.setMass(bird1.eat(food, m));
                        System.out.println("You have "+ food.getMass() + " food left\n");
                        if(food.getMass()==0 || food.getMass()<0){
                            break;
                        }
                        
                        System.out.print("Enter quantity to feed fish " + fish1.getName() + ": ");
                        m = sc.nextInt();
                        sc.nextLine();
                        food.setMass(fish1.eat(food, m));
                        System.out.println("You have "+ food.getMass() + " food left\n");
                        if(food.getMass()==0 || food.getMass()<0){
                            break;
                        }
                        
                        System.out.print("Enter quantity to feed tiger " + tiger1.getName() + ": ");
                        m = sc.nextInt();
                        sc.nextLine();
                        food.setMass(tiger1.eat(food, m));
                        System.out.println("You have "+ food.getMass() + " food left");
                       }
                       
                     System.out.print("\n---Press Enter to go back---");
                     stop =  sc.nextLine();
                     break;
                
                case 4:
                    
                    System.out.print("\nEnter baby bird name: ");
                    name = sc.nextLine();
                    birdbaby = bird1.haveBaby(name);
                    
                    System.out.print("\nEnter baby fish name: ");
                    name = sc.nextLine();
                    fishbaby = fish1.haveBaby(name);
                    
                    System.out.print("\nEnter baby tiger name: ");
                    name = sc.nextLine();
                    System.out.print("\nEnter baby tiger speed: ");
                    speed = sc.nextInt();
                    sc.nextLine();
                    tigerbaby = tiger1.haveBaby(name);
                    tigerbaby.setSpeed(speed);
                    System.out.print("\n---Press Enter to go back---");
                    stop =  sc.nextLine();
                    break;
                case 5:
                    birdbaby.fly();
                    fishbaby.dive();
                    fishbaby.swim();
                    tigerbaby.run(tigerbaby.getSpeed());
                    System.out.print("\n---Press Enter to go back---");
                    stop =  sc.nextLine();
                    break;
                case 6:
                    quit = true;
                    break;
            }
       }
    }
}
