/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch1;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Trycatch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        
   
        try {
            negativeCheck(-3);
        } catch (NegativeEx ex) {
            System.out.println(ex.to_str());
        }
  
     
        
        Array[] a = new Array[3];
        try {
            System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        System.out.println("Chuong trinh chay on");
    }
    public static void negativeCheck(int n) throws NegativeEx{
           if(n<0) throw new NegativeEx();
    }
}
class NegativeEx  extends Exception{
    public String to_str(){
        return "Loi so nhap vao nho hon 0";
    }
}