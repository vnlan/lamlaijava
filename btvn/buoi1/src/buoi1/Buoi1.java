/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = null;
        int age;
        float GPA;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhvien> listsv = new ArrayList<sinhvien>(10);
        for (int i = 0; i < 2; i++) {
            System.out.print("Nhap ten sinh vien " + (i + 1) + ": ");
            name = sc.nextLine();
            System.out.print("Nhap tuoi sinh vien " + (i + 1) + ": ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap GPA sinh vien " + (i + 1) + ": ");
            GPA = sc.nextFloat();
            sc.nextLine();
            System.out.print("\n");
            sinhvien sv = new sinhvien(name, age, GPA);
            listsv.add(sv);
        }
       
       for (int i = 0; i < 2; i++) {
           listsv.get(i).inRa();
       }
    }
    
}
