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
public class NienKhoa {
    private String MaNienKhoa;
    private String TenNienKhoa;
    private String MaHeDT;
    
    public NienKhoa() {
    }

    public NienKhoa(String MaNienKhoa, String TenNienKhoa, String MaHeDT) {
        this.MaNienKhoa = MaNienKhoa;
        this.TenNienKhoa = TenNienKhoa;
        this.MaHeDT = MaHeDT;
    }

    

    public String getMaNienKhoa() {
        return MaNienKhoa;
    }

    public void setMaNienKhoa(String MaNienKhoa) {
        this.MaNienKhoa = MaNienKhoa;
    }

    public String getTenNienKhoa() {
        return TenNienKhoa;
    }

    public void setTenNienKhoa(String TenNienKhoa) {
        this.TenNienKhoa = TenNienKhoa;
    }

    public String getMaHeDT() {
        return MaHeDT;
    }

    public void setMaHeDT(String MaHeDT) {
        this.MaHeDT = MaHeDT;
    }
    
    public List<NienKhoa> getNienKhoaWithConditions() throws SQLException{
       List<NienKhoa> listnk = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM NienKhoa WHERE MaHeDT=N'"+this.MaHeDT+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listnk.add(new NienKhoa(rs.getString("MaNienKhoa"),rs.getString("TenNienKhoa"),rs.getString("MaNienKhoa")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listnk;
   }
    
     public void addNienKhoa() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO NienKhoa VALUES(N'"+this.MaNienKhoa+"', N'"+this.TenNienKhoa+"', N'"+this.MaHeDT+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
      public void updateNienKhoa(){
        try {
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "UPDATE NienKhoa SET MaHeDT=N'"+this.MaHeDT+"', TenNienKhoa=N'"+this.TenNienKhoa+"' WHERE MaNienKhoa=N'"+this.MaNienKhoa+"'";
            statement.executeUpdate(sql);
            statement.close();
            ConnectUtils.connect().close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
      public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM NienKhoa WHERE MaNienKhoa=N'"+this.MaNienKhoa+"'";
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
       public void deleteNienKhoa() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM NienKhoa WHERE MaNienKhoa=N'"+this.MaNienKhoa+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
