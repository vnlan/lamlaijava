/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Admin
 */
public class Quanlynhanvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> listEmp = new ArrayList<Employee>();
        Employee emp1 = new Employee("Lân","Võ",-10);
        Employee emp2 = new Employee("Hoàng","Nguyễn",108.96);
        Employee emp3 = new Employee("ABC","ki",10899);
        Employee emp4 = new Employee("ahihi","ki",5656);
        Employee emp5 = new Employee("Hoà","ki",923);
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        listEmp.add(emp5);
        System.out.println("Tổng lương: "+ (double) (emp1.getSalary()+emp2.getSalary()));
         
        emp1.setSalary(emp1.getSalary()*1.1);
        emp2.setSalary(emp2.getSalary()*1.1);
       
        for(int i =0; i<listEmp.size();i++){
            listEmp.get(i).inLuong();
        }
        for(int i =0; i<listEmp.size();i++){
            if(listEmp.get(i).getSalary()>10){
                listEmp.remove(i);
                i--;
            } 
        }
        System.out.println("Danh sách đã xoá");
        for(int i = 0; i<listEmp.size();i++){
            listEmp.get(i).inLuong();
        }
    }
    
}
