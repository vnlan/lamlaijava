/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Firm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int len,age;
        String name;
        int wkday;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so nhan vien muon tao: ");
        len = sc.nextInt();
        sc.nextLine();
        ArrayList<StaffMember> listsm = new ArrayList<>();
        
        for(int i = 0; i<len; i++){
            Employer emp = new Employer();
            System.out.print("\nNhap ten nhan vien " + (i+1) +": ");
            name = sc.nextLine();
            emp.setName(name);
            System.out.print("Nhap tuoi nhan vien " + (i+1) +": ");
            age = sc.nextInt();
            sc.nextLine();
            emp.setAge(age);
            System.out.print("Nhap ngay lam viec nhan vien " + (i+1) +": ");
            wkday = sc.nextInt();
            sc.nextLine();
            emp.setWorkingDay(wkday);
            listsm.add(emp);
        }
        for(int i = 0; i<len; i++){
             if(listsm.get(i) instanceof Employer){
                ((Employer)listsm.get(i)).inTT(i+1);
            }
        }
               
    }
    
}

abstract class StaffMember{
    protected String name;
    protected int age;

    public StaffMember() {
    }
    
    public StaffMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract double Payment();
}

class Employer extends StaffMember{

    private int workingDay ;

    public Employer(int workingDay, String name, int age) {
        super(name, age);
        this.workingDay = workingDay;
    }
    
    public Employer() {
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double Payment() {
        int pay;
        pay = this.workingDay * 10;
        return pay;
    }
    public void inTT(int num){
        System.out.print("\nTen nhan vien "+num+ " la: " + this.name + "; Tuoi nhan vien " +num+ " = "+this.age+ " ; Luong nhan vien " +num+ " la: "+ this.Payment());
    }
    

}