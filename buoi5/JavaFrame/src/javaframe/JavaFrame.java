/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaframe;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.Graphics;
/**
 *
 * @author Admin
 */
public class JavaFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TinhTong tinhtong = new TinhTong("Chuong trinh tinh tong AWT");
        tinhtong.setVisible(true);
        tinhtong.setSize(600, 200);
  
    }
    
}
class TinhTong extends Frame implements ActionListener{
    Label lb1 = new Label("So thu nhat");
    Label lb2 = new Label("So thu hai");
    Label lb3 = new Label("Tong hai so");
    TextField txt1 = new TextField(20);
    TextField txt2 = new TextField(20);
    TextField txt3 = new TextField(20);
    Button btntinh = new Button("Tinh");

    public TinhTong() {
    }
    
    public TinhTong(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.add(lb1); 
        this.add(txt1);
        this.add(lb2);
        this.add(txt2); 

        this.add(btntinh); btntinh.addActionListener(this);
        this.add(lb3);
        this.add(txt3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btntinh){
          int num1 = Integer.parseInt(txt1.getText());
          int num2 = Integer.parseInt(txt2.getText());
          txt3.setText(String.valueOf(num1 + num2));
       }
       
    }

    
}