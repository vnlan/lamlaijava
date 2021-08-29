Create database QuanLySinhVien
GO
Use QuanLySinhVien
GO
Create Table HeDT
 (
   MaHeDT NVARCHAR(50) primary key not null,
   TenHeDT NVARCHAR(255)
 )
 Create table NienKhoa
 (
   MaNienKhoa NVARCHAR(50) primary key not null,
   TenNienKhoa NVARCHAR(255),
   MaHeDT NVARCHAR(50) not null,
 )
  ALTER TABLE NienKhoa ADD CONSTRAINT FK_NienKhoa_HeDT FOREIGN KEY (MaHeDT) REFERENCES HeDT(MaHeDT)
  Create table HocKy
 (
  MaHK NVARCHAR(50) primary key NOT NULL,
  TenHK NVARCHAR(255)
 )

  Create Table Khoa
 (
   MaKhoa NVARCHAR(50) primary key not null,
   MaHeDT NVARCHAR(50) not null,
   TenKhoa NVARCHAR(255) ,
   DiaChi NVARCHAR(MAX),
   SDT NVARCHAR(11),
 )
 ALTER TABLE Khoa ADD CONSTRAINT FK_Khoa_HeDT FOREIGN KEY (MaHeDT) REFERENCES HeDT(MaHeDT)

  Create Table Lop
 (
   MaLop NVARCHAR(50) primary key not null,
   TenLop NVARCHAR(255),
   MaNienKhoa NVARCHAR(50) not null,
   MaKhoa NVARCHAR(50) not null
 )

 ALTER TABLE Lop ADD CONSTRAINT FK_Lop_NienKhoa FOREIGN KEY (MaNienKhoa) REFERENCES NienKhoa(MaNienKhoa)
 ALTER TABLE Lop ADD CONSTRAINT FK_Lop_Khoa FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa)

Create table MonHoc(
 MaMH NVARCHAR(50) primary key not null,
 TenMH NVARCHAR (255),
 MaKhoa NVARCHAR (50) NOT NULL
 )
 ALTER TABLE MonHoc ADD CONSTRAINT FK_MonHoc_Khoa FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa)

 Create Table SinhVien 
 (
   MaSV NVARCHAR(50) primary key not null,
   MaLop NVARCHAR(50) not null,
   TenSV NVARCHAR(255) ,
   GioiTinh NVARCHAR(10) ,
   NgaySinh DATE,
   QueQuan NVARCHAR(MAX),
   SDT NVARCHAR(11),
   Email NVARCHAR(255)
 )
 ALTER TABLE SinhVien ADD CONSTRAINT FK_SinhVien_Lop FOREIGN KEY (MaLop) REFERENCES Lop(MaLop)

 Create Table Diem
 (
   MaSV NVARCHAR(50) not null,
   MaMH NVARCHAR(50) not null,
   MaHK NVARCHAR(50) NOT NULL,
   DiemCC FLOAT,
   DiemKT FLOAT,
   DiemBTL FLOAT,
   DiemThi FLOAT,
   DiemTK FLOAT,
   DiemChu NVARCHAR(2)
)

ALTER TABLE Diem ADD CONSTRAINT FK_Diem_SinhVien FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV)
ALTER TABLE Diem ADD CONSTRAINT FK_Diem_MonHoc FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
ALTER TABLE Diem ADD CONSTRAINT FK_Diem_HocKy FOREIGN KEY (MaHK) REFERENCES HocKy(MaHK)

---INSERT DATA

INSERT INTO HeDT VALUES
('DHCQ',N'Ðại Học Chính Quy'),
('DTTX',N'Đào tạo từ xa'),
('DTCN',N'Đào tạo Cử nhân')

INSERT INTO NienKhoa VALUES
('D17',N'Đại học chính quy năm 2017',N'DHCQ'),
('D18',N'Đại học chính quy năm 2018',N'DHCQ'),
('D19',N'Đại học chính quy năm 2019',N'DHCQ'),
('CD17',N'Đào tạo cử nhân 2017',N'DTCN'),
('TX18',N'Hệ đào tạo từ xa 2018',N'DTTX')

INSERT INTO HocKy VALUES
('HK01',N'Học Kỳ 1'),
('HK02',N'Học Kỳ 2'),
('HKH',N'Học Kỳ Hè')

INSERT INTO Khoa VALUES
('DPT',N'DHCQ',N'Công nghệ Đa phương tiện',N'Số 1 Nguyễn Trãi',N'012345789'),
('CNTT',N'DHCQ',N'Công nghệ Thông tin',N'Số 2 Nguyễn Trãi',N'092155789'),
('MAR',N'DHCQ',N'Marketing',N'Số 19 Nguyễn Trãi',N'055445596'),
('QTKD',N'DHCQ',N'Quản Trị Kinh Doanh',N'Số 2 Nguyễn Trãi',N'092155789'),
('CNTT-TX',N'DTTX',N'Công nghệ thông tin chương trình đào tạo từ xa',N'Số 15 Nguyễn Trãi',N'056488989'),
('CN-TT',N'DTCN',N'Cử nhân Toán-Tin',N'Số 27 Nguyễn Trãi',N'0551546555')

INSERT INTO Lop VALUES
('D17CQPT01',N'D17CQPT01',N'D17',N'DPT'),
('D18CQPT02',N'D18CQPT02',N'D18',N'DPT'),
('D19CQPT05',N'D18CQPT05-B',N'D19',N'DPT'),
('D17CQCN01',N'D17CQCN01',N'D17',N'CNTT'),
('D18CQCN02',N'D18CQCN02',N'D18',N'CNTT'),
('D19CQCN01',N'D19CQCN01',N'D19',N'CNTT'),
('D17CQMR01',N'D17CQMR01',N'D17',N'MAR'),
('D18CQMR01',N'D18CQMR01',N'D18',N'MAR'),
('D19CQMR01',N'D19CQMR01',N'D19',N'MAR'),
('D17CQQT01',N'D17CQQT01',N'D17',N'QTKD'),
('D18CQQT01',N'D18CQQT01',N'D18',N'QTKD'),
('D19CQQT01',N'D19CQQT01',N'D19',N'QTKD'),
('CN17-01',N'CN17-01',N'CD17',N'CN-TT'),
('TX18-01',N'TX18-01',N'TX18',N'CNTT-TX')


INSERT INTO MonHoc VALUES
(N'MUL001',N'Thiết kế đồ hoạ', N'DPT'),
(N'MUL002',N'Ngôn ngữ lập trình Java', N'DPT'),
(N'CNTT001',N'Ngôn ngữ lập trình C++', N'CNTT'),
(N'CNTT002',N'Toán rời rạc 1', N'CNTT'),
(N'MR001',N'Nguyên lý Marketing', N'MAR'),
(N'MR002',N'Marketing trực tuyến', N'MAR'),
(N'QTKD001',N'Kinh tế vĩ mô', N'QTKD'),
(N'QTKD002',N'Kinh doanh kết hợp', N'QTKD'),
(N'CNH001',N'Nguyên lý Toán và Công nghệ', N'CN-TT'),
(N'CNH002',N'Thuật toán nâng cao', N'CN-TT'),
(N'CNTT-TX001',N'Cấu trúc dữ liệu và giải thuật', N'CNTT-TX'),
(N'CNTT-TX002',N'Cơ sở dữ liệu', N'CNTT-TX')


insert into SinhVien values
('B17DCPT001','D17CQPT01',N'Nguyễn Công An',N'Nam','02/08/1999',N'Nam Định','0355664884',N'123@gmail.com'),
('B17DCPT002','D17CQPT01',N'Đặng Tuấn Anh',N'Nam','03/07/1999',N'Nam Định','0355664884',N'123@gmail.com'),
('B17DCPT003','D17CQPT01',N'Trần Văn An',N'Nam','04/08/1999',N'Nam Định','0355664884',N'123@gmail.com'),
('B17DCMR009','D17CQMR01',N'Nguyen Alice',N'Nữ','04/08/2001',N'Hà Nội','054545539',N'99999@gmail.com'),
('B17DCQT029','D17CQQT01',N'Nguyen ABC',N'Nữ','04/12/2002',N'Hà Nội','0326999',N'lan@gmail.com'),
('B18DCPT025','D18CQPT02',N'Vo Ngoc',N'Nữ','04/12/2002',N'Hà Nội','032625564',N'lan666@gmail.com')

INSERT INTO Diem VALUES
('B17DCPT001',N'MUL001',N'HK01',10,10,10,10,10,N'A+'),
('B17DCPT001',N'MUL002',N'HK01',8,8,8,8,8,N'B+'),
('B17DCPT002',N'MUL001',N'HK01',7,7,7,7,7,N'B'),
('B17DCPT002',N'MUL002',N'HK01',6.5,6.5,6.5,6.5,6.5,N'C+')

SELECT * FROM Diem WHERE MaSV = 'B17DCPT001' AND MaMH = 'MUL001' AND MaHK='HK01'

INSERT INTO Lop VALUES
('D17CQPT09',N'D17CQPT09',N'D17',N'DPT')
