/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_on;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class Bai1_on {

    public static boolean chiahet2(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Collections.sort(arr);
//        Collections.sort(arr,Collections.reverseOrder());
        
        System.out.print("\nDay sau sap xep tang la: ");
        for(int i=0; i<n; i++){
            System.out.print( arr.get(i)+ " ") ;
        }
        
        System.out.print("\nCac phan tu chia het cho 2 la: ");
        for(int i=0; i<n; i++){
            if(chiahet2(arr.get(i))){
                 System.out.print( arr.get(i)+ " ") ;
            } 
        }
        
    }
    
}
