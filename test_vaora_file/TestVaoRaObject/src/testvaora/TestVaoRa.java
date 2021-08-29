/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvaora;

import com.sun.corba.se.impl.io.IIOPInputStream;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Student;



/**
 *
 * @author Admin
 */
public class TestVaoRa {
    public static void writeFile(ArrayList<Student> listsv) throws FileNotFoundException, IOException{
       File svfile = new File("sv.dat");
       FileOutputStream fos = new FileOutputStream(svfile,true);
       ObjectOutputStream oss = new ObjectOutputStream(fos);
      for(int i = 0; i<listsv.size(); i++){
          oss.writeObject(listsv.get(i));
          
      }
       
       oss.close();
       fos.close();
    }
    public static void readFile() throws FileNotFoundException, IOException, ClassNotFoundException{
       File svfile = new File("sv.dat");
       int sott = 0;
       FileInputStream fis = new FileInputStream(svfile);
       ObjectInputStream ois = new ObjectInputStream(fis);
       while(fis.available()>0){
           sott++;
           Student sv = (Student) ois.readObject();
           System.out.println(sott+ ". "+sv);
       }
       ois.close();
       fis.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
        ArrayList<Student> listsv = new ArrayList<>();
        Student s1 = new Student("Vo Ngoc Lan", 10);
        Student s2 = new Student("Nguyen Van Hung", 20);
        Student s3 = new Student("Le Hung", 25);
        Student s4 = new Student("Nhat Hoang", 34);
       listsv.add(s1);
       listsv.add(s2);
       listsv.add(s3);
       listsv.add(s4);
       writeFile(listsv);
       readFile();
       
//        File f2 = new File("Temp.txt");
//        try{
//        FileOutputStream fos = new FileOutputStream(f2);
//        DataOutputStream dos = new DataOutputStream(fos);
//        dos.write(100);
//        dos.writeDouble(3.4);
//        dos.close();
//        fos.close();
//        }catch(IOException ex){
//            System.out.println(ex.toString());
//        }
//        
//        try{
//        FileInputStream fis = new FileInputStream(f2);
//        DataInputStream dis = new DataInputStream(fis);
//        int n = dis.read();
//        double d = dis.readDouble();
//        System.out.println("Nội dung file: " + n + " " + d);
//        dis.close();
//        fis.close();
//        }catch(IOException ex){
//            System.out.println(ex.toString());
//        }
    }
    
}
