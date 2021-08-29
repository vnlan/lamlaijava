/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Connect.ConnectUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Lop {
   private String MaLop;
   private String TenLop;
   private String MaNienKhoa;
   private String MaKhoa;
   
    public Lop() {
    }

    public Lop(String MaLop, String TenLop, String MaNienKhoa, String MaKhoa) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.MaNienKhoa = MaNienKhoa;
        this.MaKhoa = MaKhoa;
    }

   

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public String getMaNienKhoa() {
        return MaNienKhoa;
    }

    public void setMaNienKhoa(String MaNienKhoa) {
        this.MaNienKhoa = MaNienKhoa;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
   
   public List<Lop> showAll() throws SQLException{
       List<Lop> listlop = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM Lop";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listlop.add(new Lop (rs.getString("MaLop"),rs.getString("TenLop"),rs.getString("MaNienKhoa"),rs.getString("MaKhoa")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listlop;
   }
   
    public List<Lop> getLopWithConditions() throws SQLException{
       List<Lop> listlop = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM Lop WHERE MaKhoa=N'"+this.MaKhoa+"' AND MaNienKhoa=N'"+this.MaNienKhoa+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listlop.add(new Lop (rs.getString("MaLop"),rs.getString("TenLop"),rs.getString("MaNienKhoa"),rs.getString("MaKhoa")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listlop;
   }
    public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM Lop WHERE MaLop=N'"+this.MaLop+"'";
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
     public void addLop() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO Lop VALUES(N'"+this.MaLop+"', N'"+this.TenLop+"', N'"+this.MaNienKhoa+"', N'"+this.MaKhoa+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
     public void updateLop() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "UPDATE Lop SET TenLop= N'"+this.TenLop+"', MaNienKhoa= N'"+this.MaNienKhoa+"', MaKhoa= N'"+this.MaKhoa+"' WHERE MaLop=N'"+this.MaLop+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
      public void deleteLop() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM Lop WHERE MaLop=N'"+this.MaLop+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
