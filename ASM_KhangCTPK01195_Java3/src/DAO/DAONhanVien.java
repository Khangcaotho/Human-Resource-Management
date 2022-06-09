/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author KhangCao
 */
public class DAONhanVien {
     public static ResultSet GetAllDG(){
        String cauTruyVan = "Select * from QLNV ";
        return DBConnection.GetData(cauTruyVan);
    }
     public static ResultSet DangNhap(String username){
        //Tạo câu truy vấn 
        String cauTruyVan = "Select * from [dbo].[QLNV] " +
        "where [TenNV] = N'"+username+"'";
        //Thực thi câu truy vấn
        ResultSet rs = DBConnection.GetData(cauTruyVan);
        
        return rs; //Trả về bảng kết quả
    }
     public static int ThemNV(DTO.NhanVien nhanVien){
         String cauTruyVan = " Set dateformat DMY  "+
                 " INSERT INTO [dbo].[QLNV]  " +
"           ([TenNV]  " +
"           ,[DiaChi]  " +
"           ,[CMND]  " +
"           ,[NgayVaoLam]  " +
"           ,[ChucVu])  " +
"     VALUES  " +
"           (N'"+nhanVien.getTenNV()+"'" +
"           ,N'"+nhanVien.getDiaChi()+"'" +
"           ,'"+nhanVien.getCMND()+"'  " +
"           ,'"+nhanVien.getNgayVaoLam()+"'  " +
"           ,N'"+nhanVien.getChucVu()+"')";
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
     public static ResultSet Search(String tuKhoa){
         String cauTruyVan = "select * from QLNV where TenNV like N'%"+tuKhoa+"%' or DiaChi like N'%"+tuKhoa+"%' or CMND like '%"+tuKhoa+"%'";
         return DBConnection.GetData(cauTruyVan);
    }
     public static int Delete(String tenDG){
        String cauTruyVan = "delete QLNV where TenNV = N'"+tenDG+"'";
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
     public static int UpdateNV(DTO.NhanVien suaNhanVien){
         String cauTruyVan = " Set dateformat DMY  "+
                 "UPDATE [dbo].[QLNV]  " +
"   SET [TenNV] = N'"+suaNhanVien.getTenNV()+"'  " +
"      ,[DiaChi] = N'"+suaNhanVien.getDiaChi()+"'  " +
"      ,[CMND] = '"+suaNhanVien.getCMND()+"'  " +
"      ,[NgayVaoLam] = '"+suaNhanVien.getNgayVaoLam()+"'  " +
"      ,[ChucVu] = N'"+suaNhanVien.getChucVu()+"'  " +
" WHERE MaNV = "+suaNhanVien.getMaNV();
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
}
