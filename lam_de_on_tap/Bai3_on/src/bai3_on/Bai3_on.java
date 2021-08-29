/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_on;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3_on {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        float mark;
        
        ArrayList<SinhVien> listsv = new ArrayList<>();
        System.out.print("Nhap so sinh vien: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        
        for(int i=0; i<n; i++){
            SinhVien sv= new SinhVien();
            System.out.print("\nNhap ten sinh vien " + (i+1) + ": ");
            name = sc.nextLine();
            sv.setName(name);
            System.out.print("Nhap diem sinh vien " + (i+1) + ": ");
            mark = sc.nextFloat();
            sc.nextLine();
            sv.setMark(mark);
            listsv.add(sv);
        }
        System.out.println("----------------------------");
        System.out.println("Danh sach sinh vien da nhap: ");
        for(int i=0; i<n; i++){
            System.out.print((i+1)+". ");
            listsv.get(i).showInfo();
        }
        //sap xep tu be den lon theo diem
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(listsv.get(i).getMark()>listsv.get(j).getMark()){
                   SinhVien sv= new SinhVien();
                   sv = listsv.get(i);
                   listsv.set(i, listsv.get(j));
                   listsv.set(j, sv);
                }
            }
        }
        System.out.println("\nDanh sach sinh vien da sap xep theo diem tang dan: ");
        for(int i=0; i<n; i++){
            System.out.print((i+1)+". ");
            listsv.get(i).showInfo();
        }
    }
    
}

class SinhVien {
    private String name;
    private float mark;

    public SinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    public void showInfo(){
        System.out.println("Ho va ten: "+this.name+", Diem so: "+this.mark);
    }
}