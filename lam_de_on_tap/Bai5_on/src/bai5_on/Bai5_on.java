/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_on;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5_on {
    public static void numCheck(int n) throws SoNhoHon100Exception{
           if(n<100){
               throw new SoNhoHon100Exception();
           }else{
               System.out.println("So vua nhap lon hon hoac bang 100");
           }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap mot so: ");
        num = sc.nextInt();
        sc.nextLine();
        try {
            numCheck(num);
        } catch (SoNhoHon100Exception ex) {
            ex.printEx();
        }
    }
    
}


class SoNhoHon100Exception  extends Exception{
    public void printEx(){
        System.out.println("Loi, so vua nhap nho hon 100!");
    }
}