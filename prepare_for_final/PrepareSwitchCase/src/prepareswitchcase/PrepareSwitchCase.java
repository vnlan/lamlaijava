/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepareswitchcase;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class PrepareSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SVPTIT> listsv = new ArrayList();
        
        SVPTIT sv1 = new SVPTIT("Lan", 20, 8.2);
        SVPTIT sv2 = new SVPTIT("Minh", 20, 8.0);
        SVPTIT sv3 = new SVPTIT("Manh", 20, 8.2);

        
        listsv.add(sv1);
        listsv.add(sv2);
        listsv.add(sv3);

        System.out.println(listsv.size());
        
        System.out.print("Nhap so sinh vien muon them: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            
        }
        
        boolean quit = false;
        String stop;
        String option;
        
        while(quit == false){
            System.out.println("\n========= Quan ly sinh vien =========");
            System.out.println("a. Nhap thong tin sinh vien");
            System.out.println("c. Tim kiem sinh vien theo ten");
            System.out.println("t. Tim kiem sinh vien theo lop");
            System.out.println("e. Thoat");
            System.out.println("--------------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            
            option = sc.nextLine();
            switch(option){
                case "a":
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                case "b":
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                case "c":
                    // tu cao den thap
                    for(int i=0; i<listsv.size()-1; i++){
                        for(int j=i; j<listsv.size(); j++){
                            if(listsv.get(i).getPoint()<listsv.get(j).getPoint()){
                               SVPTIT sv;
                               sv = listsv.get(i);
                               listsv.set(i, listsv.get(j));
                               listsv.set(j, sv);
                            }
                        }
                    }
                    
                    //nhung sv co diem cao nhat
                    listsv.get(0).toStr();
                    for(int i=1; i<listsv.size(); i++){
                       if(listsv.get(0).getPoint() == listsv.get(i).getPoint()){
                           listsv.get(i).toStr();
                       }
                    }
                 
                    
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                case "e":
                    quit = true;
                    break;
            }
        }
    }
}

class SVPTIT{
    private String name;
    private int age;
    private double point;

    public SVPTIT() {
    }

    public SVPTIT(String name, int age, double point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    

    public void toStr() {
        System.out.println("Ho ten: "+this.name+"; Tuoi: "+this.age+"; Diem: "+this.point);
    }
    public void searchName(String name){
        if(name.toLowerCase().contains(this.name.toLowerCase())){
            this.toStr();
        }
    }
    public void searchAge(int age){
        if(age == this.age){
            this.toStr();
        }
    }
    public void searchPoint(double point){
        if(point == this.point){
            this.toStr();
        }
    }
}
class Student{
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ho ten: "+this.name+"; Tuoi: "+this.age+"; ID: "+this.id;
    }
    public void searchName(String name){
        if(name.toLowerCase().contains(this.name.toLowerCase())){
            System.out.println(this.toString());
        }
    }
    public void searchAge(int age){
        if(age == this.age){
            System.out.println(this.toString());
        }
    }
     public void searchID(String id){
        if(id.equals(this.id)){
            System.out.println(this.toString());
        }
    }
}