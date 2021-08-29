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
public class HocKy {
    private String MaHK;
    private String TenHK;

    public HocKy() {
    }

    public HocKy(String MaHK, String TenHK) {
        this.MaHK = MaHK;
        this.TenHK = TenHK;
    }

    public String getMaHK() {
        return MaHK;
    }

    public void setMaHK(String MaHK) {
        this.MaHK = MaHK;
    }

    public String getTenHK() {
        return TenHK;
    }

    public void setTenHK(String TenHK) {
        this.TenHK = TenHK;
    }
    
    public List<HocKy> showAll() throws SQLException{
       List<HocKy> listhk = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM HocKy";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listhk.add(new HocKy(rs.getString("MaHK"),rs.getString("TenHK")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listhk;
   }
    
    public void addHocKy() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO HocKy VALUES(N'"+this.MaHK+"', N'"+this.TenHK+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
      public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM HocKy WHERE MaHK=N'"+this.MaHK+"'";
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
      public void updateHocKy() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "UPDATE HocKy SET TenHK=N'"+this.TenHK+"' WHERE MaHK=N'"+this.MaHK+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
    public void deleteHocKy() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM HocKy WHERE MaHK=N'"+this.MaHK+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
