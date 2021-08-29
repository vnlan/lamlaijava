/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */

class rwFile{
    
     public void writeToFile(ArrayList<SVPTIT> listsv){
        try {
           File svfile = new File("sinhvien.dat");
           FileWriter fw = new FileWriter(svfile);
           BufferedWriter bw = new BufferedWriter(fw);
           for (int i = 0; i < listsv.size(); i++) {
                if(listsv.get(i) instanceof SVD17){
                    bw.write(((SVD17)listsv.get(i)).mapToFile());
                    bw.newLine();
                }else if(listsv.get(i) instanceof SVD18){
                    bw.write(((SVD18)listsv.get(i)).mapToFile());
                    bw.newLine();
                }
                             
           }
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SVPTIT> listsv = new ArrayList<>();
        SVD17 svD17_1 = new SVD17("Vo Ngoc Lan", 20, "D17PT01", 8.0);
        SVD17 svD17_2 = new SVD17("Nguyen Van A", 21, "D17PT02", 8.5);
        SVD17 svD17_3 = new SVD17("Nguyen Van B", 21, "D17PT03", 7.2);
        SVD18 svD18_1 = new SVD18("Vu Thi Ha", 19, "D18PT01", 5.5);
        SVD18 svD18_2 = new SVD18("Doan Van Hau", 21, "D18PT02", 8.9);
        SVD18 svD18_3 = new SVD18("Nguyen Thi Linh", 21, "D18PT03", 10);
        
        listsv.add(svD17_1);
        listsv.add(svD17_2);
        listsv.add(svD17_3);
        listsv.add(svD18_1);
        listsv.add(svD18_2);
        listsv.add(svD18_3);
        
        rwFile rwf = new rwFile();
        rwf.writeToFile(listsv);
        
        //tu be den lon
        for(int i=0; i<listsv.size()-1; i++){
            for(int j=i; j<listsv.size(); j++){
                if(listsv.get(i).getPoint()>listsv.get(j).getPoint()){
                   SVPTIT sv;
                   sv = listsv.get(i);
                   listsv.set(i, listsv.get(j));
                   listsv.set(j, sv);
                }
            }
        }
        
        System.out.println("Sinh vien co diem thap nhat la: ");
        if(listsv.get(0) instanceof SVD17){
            System.out.println(((SVD17)listsv.get(0)).toString());
        }else if(listsv.get(0) instanceof SVD18){
            System.out.println(((SVD18)listsv.get(0)).toString());
        }

    }
    
}
abstract class SVPTIT {
     
    protected String name;
    protected int age;
    protected String id;


    protected SVPTIT() {
    }

    protected SVPTIT(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    protected abstract String getName();
    protected abstract int getAge();
    protected abstract String getID();
    protected abstract double getPoint();
}

class SVD17 extends SVPTIT{
    private double point;

    public SVD17( String name, int age, String id, double point) {
        super(name, age, id);
        this.point = point;
    }
    
    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    protected int getAge() {
        return this.age;
    }

    @Override
    protected String getID() {
       return this.id;
    }

    @Override
    protected double getPoint() {
       return this.point;
    }
    @Override
    public String toString(){
        return "Ho va ten: "+this.name+"; Tuoi: "+this.age+"; MSV: "+this.id+"; Diem: "+this.point;
    }
    public String mapToFile(){
        return this.name+";"+this.age+";"+this.id+";"+this.point;
    }
}

class SVD18 extends SVPTIT{
    private double point;

    public SVD18( String name, int age, String id, double point) {
        super(name, age, id);
        this.point = point;
    }
    
    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    protected int getAge() {
        return this.age;
    }

    @Override
    protected String getID() {
       return this.id;
    }

    @Override
    protected double getPoint() {
       return this.point;
    }
    @Override
    public String toString(){
        return "Ho va ten: "+this.name+"; Tuoi: "+this.age+"; MSV: "+this.id+"; Diem: "+this.point;
    }
    
    public String mapToFile(){
        return this.name+";"+this.age+";"+this.id+";"+this.point;
    }
}


