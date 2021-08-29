/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_on;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Admin
 */
public class Bai6_on {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VeHinh vh = new VeHinh("Chuong trinh ve hinh");
        vh.setVisible(true);
        vh.setSize(400, 280);
    }
    
}
class VeHinh extends Frame implements ItemListener{
    int dk=80;
    Choice c = new Choice();
    Color co = Color.RED;
    Label l1=new Label("Your favourite color: "); 
    
    public void paint(Graphics g){
        g.setColor(co);
        g.fillOval(100, 100, dk, dk);
    }
    
    public VeHinh(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        l1.setForeground(co);
        this.add(l1);
        this.add(c); c.addItemListener(this);
        c.addItem("Red");
        c.addItem("Blue");
        c.addItem("Green");
         
    }
  
  

    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getItem()=="Red"){
            co = Color.RED;
           l1.setForeground(co);
            repaint();
            
        }
         if(e.getItem()=="Blue"){
            co = Color.BLUE;
            l1.setForeground(co);
            repaint();
        }
         if(e.getItem()=="Green"){
            co = Color.GREEN;
            l1.setForeground(co);
            repaint();
        }
    }
}
