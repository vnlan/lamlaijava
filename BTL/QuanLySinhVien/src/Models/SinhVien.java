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
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String MaSV;
    private String MaLop;
    private String TenSV;
    private String GioiTinh;
    private String NgaySinh;
    private String QueQuan;
    private String SDT;
    private String Email;

    public SinhVien() {
    }

    
    public SinhVien(String MaSV, String MaLop, String TenSV, String GioiTinh, String NgaySinh, String QueQuan, String SDT, String Email) {
        this.MaSV = MaSV;
        this.MaLop = MaLop;
        this.TenSV = TenSV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void addSV() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "INSERT INTO SinhVien VALUES(N'"+this.MaSV+"', N'"+this.MaLop+"', N'"+this.TenSV+"', N'"+this.GioiTinh+"', N'"+this.NgaySinh+"', N'"
                +this.QueQuan+"', N'"+this.SDT+"', N'"+this.Email+"')";
        statement.executeUpdate(sql);
        
        
        
        statement.close();
        ConnectUtils.connect().close();
    }
     public void updateSV(){
        try {
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "UPDATE SinhVien SET MaLop=N'"+this.MaLop+"', TenSV=N'"+this.TenSV+"', GioiTinh=N'"+this.GioiTinh+"', NgaySinh=N'"+this.NgaySinh+"', QueQuan=N'"
                    +this.QueQuan+"', SDT=N'"+this.SDT+"', Email=N'"+this.Email+"' WHERE MaSV=N'"+this.MaSV+"'";
            statement.executeUpdate(sql);
            statement.close();
            ConnectUtils.connect().close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public void deleteSV() throws SQLException{
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "DELETE FROM SinhVien WHERE MaSV=N'"+this.MaSV+"'";
        statement.executeUpdate(sql);
        statement.close();
        ConnectUtils.connect().close();
    }
     
     public int checkExist() throws SQLException{
        int row = 0;
            Statement statement = ConnectUtils.connect().createStatement();
            String sql = "SELECT * FROM SinhVien WHERE MaSV=N'"+this.MaSV+"'";
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
     public List<SinhVien> getSinhVienWithConditions() throws SQLException{
       List<SinhVien> listsv = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM SinhVien WHERE MaLop=N'"+this.MaLop+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listsv.add(new SinhVien(rs.getString("MaSV"),rs.getString("MaLop"),rs.getString("TenSV"),rs.getString("GioiTinh"),rs.getString("NgaySinh"),rs.getString("QueQuan"),rs.getString("SDT"),rs.getString("Email")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listsv;
   }
       public SinhVien getSinhVienByMaSV() throws SQLException{
        SinhVien sv = new SinhVien();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM SinhVien WHERE MaSV=N'"+this.MaSV+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            
            sv = new SinhVien(rs.getString("MaSV"),rs.getString("MaLop"),rs.getString("TenSV"),rs.getString("GioiTinh"),rs.getString("NgaySinh"),rs.getString("QueQuan"),rs.getString("SDT"),rs.getString("Email"));
         }
         statement.close();
         ConnectUtils.connect().close();
       return sv;
   }
   public List<SinhVien> findSV() throws SQLException{
       List<SinhVien> listsv = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM SinhVien WHERE MaSV LIKE N'%"+this.MaSV+"%' OR TenSV LIKE N'%"+this.TenSV+"%'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listsv.add(new SinhVien(rs.getString("MaSV"),rs.getString("MaLop"),rs.getString("TenSV"),rs.getString("GioiTinh"),rs.getString("NgaySinh"),rs.getString("QueQuan"),rs.getString("SDT"),rs.getString("Email")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listsv;
   }
   public List<SinhVien> showAll() throws SQLException{
       List<SinhVien> listsv = new ArrayList<>();
        Statement statement = ConnectUtils.connect().createStatement();
        String sql = "SELECT * FROM SinhVien";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            listsv.add(new SinhVien(rs.getString("MaSV"),rs.getString("MaLop"),rs.getString("TenSV"),rs.getString("GioiTinh"),rs.getString("NgaySinh"),rs.getString("QueQuan"),rs.getString("SDT"),rs.getString("Email")));
         }
         statement.close();
         ConnectUtils.connect().close();
       return listsv;
   }
}
