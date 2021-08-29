/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosanhchuoi;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class SoSanhChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoSanh ss = new SoSanh("So sanh hai chuoi");
        ss.setVisible(true);
        ss.setSize(650, 150);
    }
    
}

class SoSanh extends Frame implements ActionListener{
    Label lb1 = new Label("Chuoi so thu 1:");
    Label lb2 = new Label("Chuoi so thu 2:");
    Label lb3 = new Label("Moi nhap 2 chuoi de so sanh");
    TextField txt1 = new TextField(20);
    TextField txt2 = new TextField(20);
    Button btnSoSanh = new Button("So sanh");

    public SoSanh() {
    }
    
    public SoSanh(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.add(lb1); 
        this.add(txt1);
        this.add(lb2);
        this.add(txt2); 
  
        this.add(btnSoSanh); btnSoSanh.addActionListener(this);
        this.add(lb3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnSoSanh){
          if(txt1.getText().equals("") && txt2.getText().equals("")){
              lb3.setText("Ban chua nhap 2 chuoi!");
          }else if(txt1.getText().equals(txt2.getText())){
              lb3.setText("Hai chuoi giong nhau");
          }else if(!(txt1.getText().equals(txt2.getText()))){
              lb3.setText("Hai chuoi khac nhau");
          }
       }
       
    }

    
}
