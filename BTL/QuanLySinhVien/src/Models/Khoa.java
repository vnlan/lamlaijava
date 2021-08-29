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
public class Khoa {
   private String MaKhoa;
   private String MaHeDT;
   private String TenKhoa;
   private String DiaChi;
   private String SDT;

    public Khoa() {
    }

    public Khoa(String MaKhoa, String MaHeDT, String TenKhoa, String DiaChi, String SDT) {
        this.MaKhoa = MaKhoa;
        this.MaHeDT = MaHeDT;
        this.TenKhoa = TenKhoa;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getMaHeDT() {
        return MaHeDT;
    }

    public void setMaHeDT(String MaHeDT) {
        this.MaHeDT = MaHeDT;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
   public List<Khoa> getKhoaWithConditions() throws SQLException{
       List<Khoa> listkhoa = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM Khoa WHERE MaHeDT=N'"+this.MaHeDT+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listkhoa.add(new Khoa(rs.getString("MaKhoa"),rs.getString("MaHeDT"),rs.getString("TenKhoa"),rs.getString("DiaChi"),rs.getString("SDT")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listkhoa;
   }
     public void addKhoa() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO Khoa VALUES(N'"+this.MaKhoa+"', N'"+this.MaHeDT+"', N'"+this.TenKhoa+"', N'"+this.DiaChi+"', N'"+this.SDT+"')";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
        public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM Khoa WHERE MaKhoa=N'"+this.MaKhoa+"'";
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
    public void updateKhoa() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "UPDATE Khoa SET MaHeDT=N'"+this.MaHeDT+"', TenKhoa=N'"+this.TenKhoa+"', DiaChi=N'"+this.DiaChi+"', SDT=N'"+this.SDT+"' WHERE MaKhoa=N'"+this.MaKhoa+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
    public void deleteKhoa() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM Khoa WHERE MaKhoa=N'"+this.MaKhoa+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
}
