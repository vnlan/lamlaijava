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
public class MonHoc {
    private String MaMH;
    private String TenMH;
    private String MaKhoa;

    public MonHoc() {
    }

    public MonHoc(String MaMH, String TenMH, String MaKhoa) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.MaKhoa = MaKhoa;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
    
    public List<MonHoc> getMonHocWithConditions() throws SQLException{
       List<MonHoc> listmonhoc = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM MonHoc WHERE MaKhoa=N'"+this.MaKhoa+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listmonhoc.add(new MonHoc(rs.getString("MaMH"),rs.getString("TenMH"),rs.getString("MaKhoa")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listmonhoc;
   }
     public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM MonHoc WHERE MaMH=N'"+this.MaMH+"'";
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
     public void addMonHoc() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO MonHoc VALUES(N'"+this.MaMH+"', N'"+this.TenMH+"', N'"+this.MaKhoa+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
    public void updateMonHoc(){
        try {
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "UPDATE MonHoc SET MaKhoa=N'"+this.MaKhoa+"', TenMH=N'"+this.TenMH+"' WHERE MaMH=N'"+this.MaMH+"'";
            statement.executeUpdate(sql);
            statement.close();
            ConnectUtils.connect().close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void deleteMonHoc() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM MonHoc WHERE MaMH=N'"+this.MaMH+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
