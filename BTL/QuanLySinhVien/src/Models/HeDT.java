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
public class HeDT {
    private String MaHeDT;
    private String TenHeDT;

    public HeDT() {
    }

    public HeDT(String MaHeDT, String TenHeDT) {
        this.MaHeDT = MaHeDT;
        this.TenHeDT = TenHeDT;
    }

    public String getMaHeDT() {
        return MaHeDT;
    }

    public void setMaHeDT(String MaHeDT) {
        this.MaHeDT = MaHeDT;
    }

    public String getTenHeDT() {
        return TenHeDT;
    }

    public void setTenHeDT(String TenHeDT) {
        this.TenHeDT = TenHeDT;
    }
    
    public List<HeDT> showAll() throws SQLException{
       List<HeDT> listhdt = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM HeDT";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listhdt.add(new HeDT (rs.getString("MaHeDT"),rs.getString("TenHeDT")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listhdt;
   }
    
     public void addHeDT() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO HeDT VALUES(N'"+this.MaHeDT+"', N'"+this.TenHeDT+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
      public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM HeDT WHERE MaHeDT=N'"+this.MaHeDT+"'";
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
      public void updateHeDT() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "UPDATE HeDT SET TenHeDT=N'"+this.MaHeDT+"' WHERE MaHeDT=N'"+this.MaHeDT+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
      public void deleteHeDT() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM HeDT WHERE MaHeDT= N'"+this.MaHeDT+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
