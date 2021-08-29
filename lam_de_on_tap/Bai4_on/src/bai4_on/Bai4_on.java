/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_on;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4_on {
//        public static void clrscr(){
//           //Clears Screen in java
//           try {
//               if (System.getProperty("os.name").contains("Windows"))
//                   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//               else
//                   Runtime.getRuntime().exec("clear");
//           } catch (IOException | InterruptedException ex) {}
//        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ArrayList<SinhVien> listsv = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        boolean quit = false;
        String stop;
        
        while(quit == false){
            System.out.println("========= Chuong trinh quan ly sinh vien =========");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Tim kiem sinh vien theo ten");
            System.out.println("3. Tim kiem sinh vien theo lop");
            System.out.println("4. Xoa danh sach sinh vien");
            System.out.println("5. Thoat");
            System.out.println("--------------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    int sosv;
                    String name;
                    String classname;
                    System.out.print("\nNhap so sinh vien muon them: " );
                    sosv = sc.nextInt();
                    sc.nextLine();

                    for(int i=0; i<sosv; i++){
                        SinhVien sv = new SinhVien();
                        System.out.print("\nNhap ten sinh vien " +(i+1)+": ");
                        name = sc.nextLine();
                        sv.setName(name);

                        System.out.print("Nhap lop sinh vien " +(i+1)+": ");
                        classname = sc.nextLine();
                        sv.setClassname(classname);

                        listsv.add(sv);
                        
                    }
                    System.out.println("\nDanh sach sinh vien sau khi them: ");
                    
                    for(int i=0; i<listsv.size(); i++){
                         System.out.print((i+1)+". ");
                         listsv.get(i).showInfo();
                    }
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                        
                      
                case 2:
                    System.out.print("\nNhap ten sinh vien muon tim kiem: ");
                    name = sc.nextLine();
                    System.out.println("\nDanh sach sinh vien trung khop: ");
                    for(int i=0; i<listsv.size(); i++){
                        if(listsv.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                            System.out.print((i+1)+". ");
                            listsv.get(i).showInfo();
                        } 
                    }
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                    
                case 3:
                    int sott = 0;
                    System.out.print("\nNhap lop sinh vien muon tim kiem: ");
                    classname = sc.nextLine();
                    System.out.println("\nDanh sach sinh vien trung khop: ");
                    for(int i=0; i<listsv.size(); i++){
                        if(listsv.get(i).getClassname().toLowerCase().contains(classname.toLowerCase())){
//                            System.out.print((i+1)+". ");
                            System.out.print((sott+=1)+". ");
                            listsv.get(i).showInfo();
                        } 
                    }
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                case 4:
                    
                    System.out.print("\nBan co chac muon xoa danh sach sinh vien (Y or N)?: ");
                    String cf = sc.nextLine();
                    if(cf.equalsIgnoreCase("Y")){
                        listsv.clear();
                        System.out.println("\nXoa danh sach thanh cong!");
                    }else{
                        System.out.println("\nBan da huy tac vu.");
                    }
                    System.out.print("\n--- Nhan Enter de quay lai ---");
                    stop =  sc.nextLine();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }
}

class SinhVien{
    String name;
    String classname;

    public SinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
    public void showInfo(){
        System.out.println("Ho va ten: "+this.name+", Lop: "+this.classname);
    }
    
}