/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

/**
 *
 * @author Admin
 */
public class Employee {
    private String firstName;
    private String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        if(salary<0){
            salary = 0;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void inLuong(){
        System.out.println("Lương của nhân viên "+ firstName + " là: " + (double) salary);
    }
} 
