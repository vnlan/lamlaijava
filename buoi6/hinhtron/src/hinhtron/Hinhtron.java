/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhtron;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 *
 * @author Admin
 */
public class Hinhtron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VeHinh vh = new VeHinh("Chuong trinh VH");
        vh.setVisible(true);
        vh.setSize(600, 600);
       
    }
   
    
}
class VeHinh extends Frame implements ActionListener,ItemListener,TextListener{
    int dk=30;
    Button btntin = new Button("Zoom in");
    Button btnout = new Button("Zoom out");
    Choice c = new Choice();
    Color co = Color.BLACK;
    int ran = (int)(Math.random()*6+1); //Số từ 1 - 6
    TextField tf = new TextField(20);
    TextField tf2 = new TextField(20);
    Button pl1 = new Button("Player 1");
    Button pl2 = new Button("Player 2");
    
//    public void drawRectangles(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.drawRect(30, 50, 420, 120);
//        // code to draw rectangles goes here...
// 
//    }
    @Override
    public void paint(Graphics g){
        g.setColor(co);
        g.fillOval(200, 200, dk, dk);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(200, 200, 55, 20);
        g2d.drawPolygon(new int[] {200, 150, 250}, new int[] {200, 300, 300}, 3);
        g2d.drawOval(150, 150, 100, 100);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btntin){
         dk = dk + 10;
         repaint();
        }
        if(e.getSource()==btnout){
         dk = dk - 10;
         repaint();
       }
    }

    public VeHinh(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        this.add(btntin); btntin.addActionListener(this);
        this.add(btnout); btnout.addActionListener(this);
        this.add(c); c.addItemListener(this);
        c.addItem("Red");
        c.addItem("Blue");
        c.addItem("Green");
        this.add(tf); tf.addTextListener(this);
        this.add(tf2);
        
    }
    
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getItem()=="Red"){
            co = Color.RED;
            
            repaint();
        }
         if(e.getItem()=="Blue"){
            co = Color.BLUE;
            repaint();
        }
         if(e.getItem()=="Green"){
            co = Color.GREEN;
            repaint();
        }
    }

//    @Override
//    public void textValueChanged(TextEvent e) {
//        if(tf.=="ppp"){
//            tf2.setText("LOL");
//        }
//    }

    @Override
    public void textValueChanged(TextEvent e) {
        int age = Integer.parseInt(tf.getText());
        if(age>18){
            tf2.setText("LOL");
        }
    }
    
}
