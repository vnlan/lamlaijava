/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedrawshape;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class PrepareDrawShape {

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

class VeHinh extends Frame implements ActionListener{
    Color co = Color.BLACK;
    int dk=30;
    Button btnRed = new Button("Red");
    Button btnBlue = new Button("Blue");
    Button btnGreen = new Button("Green");
    Choice c = new Choice();
    
    public VeHinh(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        this.add(btnRed); btnRed.addActionListener(this);
        this.add(btnBlue); btnBlue.addActionListener(this);
        this.add(btnGreen); btnGreen.addActionListener(this);
        this.add(c); 
//        c.addItemListener(this);
//        c.addItem("Red");
//        c.addItem("Blue");
//        c.addItem("Green");
    
        
    }
    
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
       
    }

}