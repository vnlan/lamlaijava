/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Farming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Animal> listanimal =  new ArrayList<>();
       Dog dog1 = new Dog("Cho To");
       Cat cat1 = new Cat("Meo Den");
       Cat cat2 = new Cat("Meo Nho");
       listanimal.add(dog1);
       listanimal.add(cat1);
       listanimal.add(cat2);
       Farmer fm = new Farmer();
        for (int i = 0; i < listanimal.size(); i++) {
            fm.Feeding(listanimal.get(i));
            if(listanimal.get(i) instanceof Cat){
                ((Cat)listanimal.get(i)).ratHunting();
            }
        }
        
        
    }
    
}