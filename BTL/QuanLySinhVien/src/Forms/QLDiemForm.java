/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Models.Diem;
import Models.HeDT;
import Models.HocKy;
import Models.Khoa;
import Models.Lop;
import Models.MonHoc;
import Models.NienKhoa;
import Models.SinhVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QLDiemForm extends javax.swing.JFrame {
    
    
    /**
     * Creates new form QLDiemForm
     */
    public QLDiemForm() {
        initComponents();
        getHDT();
        getHocKy();
    }
public void getHDT(){
        try {
            ArrayList<HeDT> listhdt = new ArrayList<>();
            HeDT hedt = new HeDT();
            listhdt = (ArrayList<HeDT>) hedt.showAll();
            for(int i=0; i<listhdt.size(); i++){
                cboHDT.addItem(listhdt.get(i).getMaHeDT());
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
public void getHocKy(){
        try {
            ArrayList<HocKy> listhk = new ArrayList<>();
            HocKy hk = new HocKy();
            listhk = (ArrayList<HocKy>) hk.showAll();
            for(int i=0; i<listhk.size(); i++){
                cboHocKy.addItem(listhk.get(i).getMaHK());
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getNienKhoa(){
        try {
            ArrayList<NienKhoa> listnk = new ArrayList<>();
            NienKhoa nk = new NienKhoa();
            nk.setMaHeDT((String) cboHDT.getSelectedItem());
            listnk = (ArrayList<NienKhoa>) nk.getNienKhoaWithConditions();
            for(int i=0; i<listnk.size(); i++){
                cboNienKhoa.addItem(listnk.get(i).getMaNienKhoa());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void getKhoa(){
        try {
            ArrayList<Khoa> listkhoa = new ArrayList<>();
            Khoa khoa = new Khoa();
            khoa.setMaHeDT((String) cboHDT.getSelectedItem());
            listkhoa = (ArrayList<Khoa>) khoa.getKhoaWithConditions();
            for(int i=0; i<listkhoa.size(); i++){
                cboKhoa.addItem(listkhoa.get(i).getMaKhoa());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void getLop(){
        try {
            ArrayList<Lop> listlop = new ArrayList<>();
            Lop lop = new Lop();
            lop.setMaNienKhoa((String) cboNienKhoa.getSelectedItem());
            lop.setMaKhoa((String) cboKhoa.getSelectedItem());
            listlop = (ArrayList<Lop>) lop.getLopWithConditions();
            for(int i=0; i<listlop.size(); i++){
                cboMaLop.addItem(listlop.get(i).getMaLop());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void getMonHoc(){
        try {
            ArrayList<MonHoc> listmonhoc = new ArrayList<>();
            MonHoc monhoc = new MonHoc();
            monhoc.setMaKhoa((String) cboKhoa.getSelectedItem());
            listmonhoc = (ArrayList<MonHoc>) monhoc.getMonHocWithConditions();
            for(int i=0; i<listmonhoc.size(); i++){
                cboMonHoc.addItem(listmonhoc.get(i).getMaMH());
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void getSV(){
        try {
            ArrayList<SinhVien> listsv = new ArrayList<>();
            SinhVien sv = new SinhVien();
            sv.setMaLop((String) cboMaLop.getSelectedItem());
          
            listsv = (ArrayList<SinhVien>) sv.getSinhVienWithConditions();
            for(int i=0; i<listsv.size(); i++){
                cboMaSV.addItem(listsv.get(i).getMaSV());
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void getDiem(){
        try {
           
            Diem d = new Diem();
            Diem dshow = new Diem();
            d.setMaSV((String) cboMaSV.getSelectedItem());
            d.setMaMH((String) cboMonHoc.getSelectedItem());
            d.setMaHK((String) cboHocKy.getSelectedItem());
            dshow = d.getDiemWithConditions();
            txtDiemCC.setText(Float.toString(dshow.getDiemCC()));
            txtDiemKT.setText(Float.toString(dshow.getDiemKT()));
            txtDiemBTL.setText(Float.toString(dshow.getDiemBTL()));
            txtDiemThi.setText(Float.toString(dshow.getDiemThi()));
            diemTK.setText(Float.toString(dshow.getDiemTK()));
            diemChu.setText(dshow.getDiemChu());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiachi = new javax.swing.JTextArea();
        txtTenSV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboHDT = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboMaLop = new javax.swing.JComboBox<>();
        cboNienKhoa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        cboKhoa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboMaSV = new javax.swing.JComboBox<>();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDiemCC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDiemKT = new javax.swing.JTextField();
        desForMonHoc = new javax.swing.JLabel();
        cboHocKy = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cboMonHoc = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        desForHocKy = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDiemBTL = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDiemThi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        diemTK = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        diemChu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaDiachi.setColumns(20);
        txtAreaDiachi.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiachi);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Hệ ĐT:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính:");

        cboHDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHDTActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Niên Khoá:");

        cboMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaLopActionPerformed(evt);
            }
        });

        cboNienKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNienKhoaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Sinh:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Khoa:");

        cboKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SĐT: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("NHẬP ĐIỂM:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã SV:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã Lớp:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên SV:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Địa chỉ:");

        cboMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaSVActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("QUẢN LÝ ĐIỂM ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Điểm Chuyên Cần (10%):");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Điểm Kiểm Tra (10%):");

        desForMonHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desForMonHoc.setText("Description For MonHoc");

        cboHocKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHocKyActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Chọn Học Kỳ:");

        cboMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMonHocActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Chọn Môn Học:");

        desForHocKy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desForHocKy.setText("Description For HocKy");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Điểm Bài Tập Lớn (20%):");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Điểm Thi (60%):");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Điểm Tổng kết:");

        diemTK.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        diemTK.setForeground(new java.awt.Color(255, 51, 51));
        diemTK.setText("0.0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Điểm chữ:");

        diemChu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        diemChu.setForeground(new java.awt.Color(255, 51, 0));
        diemChu.setText("Null");

        jButton1.setText("Huỷ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jButton3.setText("Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel6)))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail)
                                        .addComponent(txtNgaySinh)))
                                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addComponent(cboMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(416, 416, 416)))
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(desForMonHoc)
                                .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addComponent(jLabel18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(desForHocKy))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(cboHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel16)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtDiemBTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDiemCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDiemKT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(diemTK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(diemChu)
                            .addGap(20, 20, 20)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(cboHDT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(252, 252, 252)))))
                    .addContainerGap(136, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(289, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(288, 288, 288)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cboMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cboHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desForMonHoc)
                    .addComponent(desForHocKy))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDiemCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtDiemKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDiemBTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(diemTK)
                    .addComponent(jLabel21)
                    .addComponent(diemChu))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(cboHDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cboNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(cboKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(667, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel13)
                    .addContainerGap(741, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboHDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHDTActionPerformed
        // TODO add your handling code here:
        cboNienKhoa.removeAllItems();
        cboKhoa.removeAllItems();
        getNienKhoa();
        getKhoa();

    }//GEN-LAST:event_cboHDTActionPerformed

    private void cboNienKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNienKhoaActionPerformed
        // TODO add your handling code here:
        cboMaLop.removeAllItems();
        getLop();

    }//GEN-LAST:event_cboNienKhoaActionPerformed

    private void cboKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaActionPerformed
        // TODO add your handling code here:
        cboMonHoc.removeAllItems();
        cboMaLop.removeAllItems();
        getLop();
        getMonHoc();
   
        
    }//GEN-LAST:event_cboKhoaActionPerformed

    private void cboMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaLopActionPerformed
        // TODO add your handling code here:
        cboMaSV.removeAllItems();
        getSV();
    }//GEN-LAST:event_cboMaLopActionPerformed

    private void cboMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaSVActionPerformed
        try {
            // TODO add your handling code here:
           
            SinhVien sv = new SinhVien();
            sv.setMaSV((String) cboMaSV.getSelectedItem());
            sv = sv.getSinhVienByMaSV();
            txtTenSV.setText(sv.getTenSV());
            txtGioiTinh.setText(sv.getGioiTinh());
            txtNgaySinh.setText(sv.getNgaySinh());
            txtSDT.setText(sv.getSDT());
            txtEmail.setText(sv.getEmail());
            txtAreaDiachi.setText(sv.getQueQuan());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Không có sinh viên nào!");
        }
    }//GEN-LAST:event_cboMaSVActionPerformed

    private void cboHocKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHocKyActionPerformed
        // TODO add your handling code here:
        getDiem();
        
    }//GEN-LAST:event_cboHocKyActionPerformed

    private void cboMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonHocActionPerformed
//        try {
//            // TODO add your handling code here:
//            
//            ArrayList<MonHoc> listmonhoc = new ArrayList<>();
//            MonHoc monhoc = new MonHoc();
//            monhoc.setMaKhoa((String) cboKhoa.getSelectedItem());
//            listmonhoc = (ArrayList<MonHoc>) monhoc.getMonHocWithConditions();
//            if(listmonhoc.size()>0){
//                int index = cboMonHoc.getSelectedIndex();
//                String des = listmonhoc.get(index).getTenMH();
//                desForMonHoc.setText(des);
//            }else{
//            
//            }
//            
//        } catch (SQLException ex) {
//            
//             ex.printStackTrace();
//        }

        getDiem();
    }//GEN-LAST:event_cboMonHocActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        try {
            // TODO add your handling code here:
            Diem d = new Diem();
            d.setMaSV((String) cboMaSV.getSelectedItem());
            d.setMaMH((String) cboMonHoc.getSelectedItem());
            d.setMaHK((String) cboHocKy.getSelectedItem());
            d.setDiemCC(Float.parseFloat(txtDiemCC.getText()));
            d.setDiemKT(Float.parseFloat(txtDiemKT.getText()));
            d.setDiemBTL(Float.parseFloat(txtDiemBTL.getText()));
            d.setDiemThi(Float.parseFloat(txtDiemThi.getText()));
            d.setDiemTK();
            d.setDiemChu();
            diemChu.setText(d.getDiemChu());
            diemTK.setText(Float.toString(d.getDiemTK()));
            if(d.checkExist()==0){
               
                d.addDiem();
                JOptionPane.showMessageDialog(rootPane,"Thêm điểm thành công!");
            }else if(d.checkExist()==1){
            
                d.updateDiem();
                JOptionPane.showMessageDialog(rootPane,"Cập nhật điểm thành công!");
            }
               
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane,"Không tồn tại sinh viên!");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            Diem d = new Diem();
            d.setMaSV((String) cboMaSV.getSelectedItem());
            d.setMaMH((String) cboMonHoc.getSelectedItem());
            d.setMaHK((String) cboHocKy.getSelectedItem());
            if(d.checkExist()==1){
            d.deleteDiem();
            JOptionPane.showMessageDialog(rootPane,"Xoa điểm thành công!");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"That bai! Do Không tồn tại");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        IndexForm idxf = new IndexForm();
        idxf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDiemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cboHDT;
    private javax.swing.JComboBox<String> cboHocKy;
    private javax.swing.JComboBox<String> cboKhoa;
    private javax.swing.JComboBox<String> cboMaLop;
    private javax.swing.JComboBox<String> cboMaSV;
    private javax.swing.JComboBox<String> cboMonHoc;
    private javax.swing.JComboBox<String> cboNienKhoa;
    private javax.swing.JLabel desForHocKy;
    private javax.swing.JLabel desForMonHoc;
    private javax.swing.JLabel diemChu;
    private javax.swing.JLabel diemTK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaDiachi;
    private javax.swing.JTextField txtDiemBTL;
    private javax.swing.JTextField txtDiemCC;
    private javax.swing.JTextField txtDiemKT;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}
