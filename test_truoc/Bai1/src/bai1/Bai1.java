/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int num;
        List<Integer> listnum = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            System.out.print("Số thứ "+ (i+1) +": ");
            num = sc.nextInt();
            listnum.add(num);
        }
         System.out.println("Các phần tử của mảng chia hết cho 2 là: ");
        for(int i = 0; i<listnum.size(); i++){
            if(listnum.get(i)%2==0){
                System.out.print(listnum.get(i)+" ");
            }
        }
    }
    
}
