/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvaoranormal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class TestVaoRaNormal {
    public static void writeFileNormal(ArrayList<Student> listsv){
        try {
           File svfile = new File("sv.dat");
           FileWriter fw = new FileWriter(svfile);
           BufferedWriter bw = new BufferedWriter(fw);
           for (Student sv : listsv) {
               bw.write(sv.to_str());
               bw.newLine();
           }
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            
        }
    }
     public static ArrayList<Student> readFileNormal(){
         ArrayList<Student> listsv = new ArrayList<>();
        try {
           
           File svfile = new File("sv.dat");
           FileReader fr = new FileReader(svfile);
           BufferedReader br = new BufferedReader(fr);
           String line = "";
           while(true){
               line = br.readLine();
               if(line == null){
                   break;
               }
               String txt[] = line.split(";");
               String name = txt[0];
               int age = Integer.parseInt(txt[1]);
               listsv.add(new Student(name, age));
           }
            
        } catch (Exception e) {
            
        }
        return listsv;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Student> listsv = new ArrayList<>();
        ArrayList<Student> listRead = new ArrayList<>();
        Student s1 = new Student("Vo Ngoc Lan", 10);
        Student s2 = new Student("Nguyen Van Hung", 20);
        Student s3 = new Student("Le Hu Hung", 25);
        Student s4 = new Student("Nhat Hoang", 34);
        
        listsv.add(s1);
        listsv.add(s2);
        listsv.add(s3);
        listsv.add(s4);
       
        
        listRead = readFileNormal();
        for (Student student : listRead) {
            if(student.getName().toLowerCase().contains("")){
                System.out.println(student.getName()+"\t"+student.getAge());
            }
        }
    }
    
}


class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String to_str() {
        return this.name+";"+this.age;
    }
    
}