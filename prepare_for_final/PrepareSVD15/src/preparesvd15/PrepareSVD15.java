/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparesvd15;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PrepareSVD15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SVPTIT> listsv = new ArrayList<>();
        SVD15 svD15_1 = new SVD15("Vo Ngoc Lan", 20, "D15PT01", 8.0);
        SVD15 svD15_2 = new SVD15("Nguyen Van A", 21, "D15PT02", 8.5);
        SVD15 svD15_3 = new SVD15("Nguyen Van B", 21, "D15PT03", 7.2);
        SVD16 svD16_1 = new SVD16("Vu Thi Ha", 19, "D16PT01", 5.5);
        SVD16 svD16_2 = new SVD16("Doan Van Hau", 21, "D16PT02", 8.9);
        SVD16 svD16_3 = new SVD16("Nguyen Thi Linh", 21, "D16PT03", 1.6);
        
        listsv.add(svD15_1);
        listsv.add(svD15_2);
        listsv.add(svD15_3);
        listsv.add(svD16_1);
        listsv.add(svD16_2);
        listsv.add(svD16_3);
        
//        for (int i = 0; i < listsv.size(); i++) {
//           
//            if(listsv.get(i) instanceof SVD15){
//                System.out.println(((SVD15)listsv.get(i)).toString());
//            }else if(listsv.get(i) instanceof SVD16){
//                System.out.println(((SVD16)listsv.get(i)).toString());
//            }
//        }
       
        
        //sap xep danh sach SV tu lon den be
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

        if(listsv.get(0) instanceof SVD15){
            System.out.println(((SVD15)listsv.get(0)).toString());
        }else if(listsv.get(0) instanceof SVD16){
            System.out.println(((SVD16)listsv.get(0)).toString());
        }
    }
    
}

abstract class SVPTIT {
     
    protected String name;
    protected int age;
    protected String id;
    protected double point;

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

class SVD15 extends SVPTIT{
    private double point;

    public SVD15( String name, int age, String id, double point) {
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
        return "Name: "+this.name+"; Age: "+this.age+"; MSV: "+this.id+"; Diem: "+this.point;
    }
}

class SVD16 extends SVPTIT{
    private double point;

    public SVD16( String name, int age, String id, double point) {
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
        return "Name: "+this.name+"; Age: "+this.age+"; MSV: "+this.id+"; Diem: "+this.point;
    }
}