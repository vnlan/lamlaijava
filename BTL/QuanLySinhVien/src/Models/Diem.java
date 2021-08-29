/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Connect.ConnectUtils;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Diem {
   private String MaSV;
   private String MaMH;
   private String MaHK;
   private float DiemCC=-1;
   private float DiemKT=-1;
   private float DiemBTL=-1;
   private float DiemThi=-1;
   private float DiemTK=-1;
   private String DiemChu="NULL";

    public Diem() {
    }

    public Diem(String MaSV, String MaMH, String MaHK, float DiemCC, float DiemKT, float DiemBTL, float DiemThi) {
        this.MaSV = MaSV;
        this.MaMH = MaMH;
        this.MaHK = MaHK;
        this.DiemCC = DiemCC;
        this.DiemKT = DiemKT;
        this.DiemBTL = DiemBTL;
        this.DiemThi = DiemThi;
    }

    public Diem(String MaSV, String MaMH, String MaHK, float DiemCC, float DiemKT, float DiemBTL, float DiemThi, float DiemTK, String DiemChu) {
        this.MaSV = MaSV;
        this.MaMH = MaMH;
        this.MaHK = MaHK;
        this.DiemCC = DiemCC;
        this.DiemKT = DiemKT;
        this.DiemBTL = DiemBTL;
        this.DiemThi = DiemThi;
        this.DiemTK = DiemTK;
        this.DiemChu = DiemChu;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getMaHK() {
        return MaHK;
    }

    public void setMaHK(String MaHK) {
        this.MaHK = MaHK;
    }

    public float getDiemCC() {
        return DiemCC;
    }

    public void setDiemCC(float DiemCC) {
        this.DiemCC = DiemCC;
    }

    public float getDiemKT() {
        return DiemKT;
    }

    public void setDiemKT(float DiemKT) {
        this.DiemKT = DiemKT;
    }

    public float getDiemBTL() {
        return DiemBTL;
    }

    public void setDiemBTL(float DiemBTL) {
        this.DiemBTL = DiemBTL;
    }

    public float getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(float DiemThi) {
        this.DiemThi = DiemThi;
    }

    public float getDiemTK() {
        return DiemTK;
    }
 public void setDiemTK() {
     DecimalFormat df = new DecimalFormat("#.##");
        this.DiemTK = (float) ((this.DiemCC*0.1)+(this.DiemKT*0.1)+(this.DiemBTL*0.2)+(this.DiemThi*0.6));
        df.format(this.DiemTK);
    }
    public void setDiemTK(Float DiemTK) {
//        this.DiemTK = (float) ((this.DiemCC*0.1)+(this.DiemKT*0.1)+(this.DiemBTL*0.2)+(this.DiemThi*0.6));
        this.DiemTK= DiemTK;
    }
 public void setDiemChu() {
     if(this.DiemTK<4){
         this.DiemChu = "F";
     }else if(this.DiemTK>=4 && this.DiemTK <5){
         this.DiemChu = "D";
     }else if(this.DiemTK>=5 && this.DiemTK <6){
         this.DiemChu = "D+";
     }else if(this.DiemTK>=6 && this.DiemTK <6.5){
         this.DiemChu = "C";
     }else if(this.DiemTK>=6.5 && this.DiemTK <7){
         this.DiemChu = "C+";
     }else if(this.DiemTK>=7 && this.DiemTK <8){
         this.DiemChu = "B";
     }else if(this.DiemTK>=8 && this.DiemTK <8.5){
         this.DiemChu = "B+";
     }else if(this.DiemTK>=8.5 && this.DiemTK <9){
         this.DiemChu = "A";
     }else{
      this.DiemChu = "A+";
     }
        
    }
    public String getDiemChu() {
        return DiemChu;
    }

    public void setDiemChu(String DiemChu) {
        this.DiemChu = DiemChu;
    }
   
   public void addDiem() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO Diem VALUES(N'"+this.MaSV+"', N'"+this.MaMH+"', N'"+this.MaHK+"',"+this.DiemCC+","+this.DiemKT+","+this.DiemBTL+","+this.DiemThi+","+this.DiemTK+", N'"+this.DiemChu+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
    public void updateDiem(){
        try {
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "UPDATE Diem SET DiemCC="+this.DiemCC+", DiemKT="+this.DiemKT+", DiemBTL="+this.DiemBTL+", DiemThi="
                    +this.DiemThi+", DiemTK="+this.DiemTK+", DiemChu=N'"+this.DiemChu+"' WHERE MaSV=N'"+this.MaSV+"' AND MaMH=N'"+this.MaMH+"' AND MaHK=N'"+this.MaHK+"'";
            statement.executeUpdate(sql);
            statement.close();
            ConnectUtils.connect().close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void deleteDiem() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM Diem WHERE MaSV=N'"+this.MaSV+"' AND MaMH=N'"+this.MaMH+"' AND MaHK=N'"+this.MaHK+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
    public Diem getDiemWithConditions() throws SQLException{
      Diem d= new Diem();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM Diem WHERE MaSV=N'"+this.MaSV+"' AND MaMH=N'"+this.MaMH+"' AND MaHK=N'"+this.MaHK+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
           d = new Diem(rs.getString("MaSV"),rs.getString("MaMH"),rs.getString("MaHK"),rs.getFloat("DiemCC"),rs.getFloat("DiemKT"),rs.getFloat("DiemBTL"),rs.getFloat("DiemThi"),rs.getFloat("DiemTK"),rs.getString("DiemChu"));
         }
         statement.close();
         ConnectUtils.connect().close();
       return d;
   }
    public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM Diem WHERE MaSV=N'"+this.MaSV+"' AND MaMH=N'"+this.MaMH+"' AND MaHK=N'"+this.MaHK+"'";
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                row = 1;
            }else{
                row = 0;
            }
            statement.close();
            ConnectUtils.connect().close();
        return row;
    }
}
