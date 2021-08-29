/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author Admin
 */
public class sinhvien {
    private String name;
    private int age;
    private float GPA;

    public sinhvien(String name, int age, float GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public sinhvien() {
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

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    public void inRa(){
        System.out.print("name: "+name);
    }
}
