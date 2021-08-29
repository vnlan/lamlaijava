/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_2_on;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4_2_on {
    public static void negativeCheck(int n) throws SoAmException{
           if(n<0){
               throw new SoAmException();
           }else{
               System.out.println("So vua nhap khong phai so am");
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
            negativeCheck(num);
        } catch (SoAmException ex) {
            ex.printEx();
        }
    }
    
}

class SoAmException  extends Exception{
    public void printEx(){
        System.out.println("Loi, so vua nhap la so am!");
    }
}