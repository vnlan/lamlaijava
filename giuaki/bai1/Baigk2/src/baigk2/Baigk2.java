/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baigk2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Admin
 */
public class Baigk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TinhTong TT = new TinhTong("Tinh tong");
        TT.setVisible(true);
        TT.setSize(400, 400);
       
    }
    class TinhTong extends Frame implements ActionListener,MouseListener{
    Label lb1 = new Label("So thu nhat");
    Label lb2 = new Label("So thu hai");
    TextField txt1 = new TextField(20);
    TextField txt2 = new TextField(20);

    Button btn1 = new Button("Button 1");
    Button btn2 = new Button("Button 2");
    public TinhTong() {
    }
    
    public TinhTong(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.add(lb1); 
        this.add(txt1);
        this.add(lb2);
        this.add(txt2); 

        this.add(btn1); btn1.addActionListener(this);
        this.add(btn2); btn2.addActionListener(this);
        addMouseListener(this);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

}
