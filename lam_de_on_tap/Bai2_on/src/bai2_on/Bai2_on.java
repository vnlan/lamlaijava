/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_on;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2_on {

    public static boolean chiahet3(int a){
        if(a % 3 == 0){
            return true;
        }else{
            return false;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n,a;
        // TODO code application logic here
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Nhap so phan tu cua mang: ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a = sc.nextInt();
            arr.add(a);
        }
        System.out.print("\nCac phan tu chia het cho 3 la: ");
        for(int i=0; i<n; i++){
            if(chiahet3(arr.get(i))){
                 System.out.print( arr.get(i)+ " ") ;
            } 
        }
    }
    
}
