/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author Khang Cao
 */
public class DAOPhongBan {
     public static ResultSet GetAllPB(){
        String cauTruyVan = "Select * from PhongBan ";
        return DBConnection.GetData(cauTruyVan);
    }
     public static int ThemPB(DTO.PhongBan phongBan){
         String cauTruyVan =" INSERT INTO [dbo].[PhongBan]  " +
"           ([TenPB]  " +
"           ,[DiaChi]  " +
"           ,[SDT])  " +
"     VALUES  " +
"           (N'"+phongBan.getTenPB()+"'" +
"           ,N'"+phongBan.getDiaChi()+"'" +
"           ,'"+phongBan.getSDT()+"')";
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
     public static ResultSet Search(String tuKhoa){
         String cauTruyVan = "select * from PhongBan where TenPB like N'%"+tuKhoa+"%' or DiaChi like N'%"+tuKhoa+"%' or SDT like '%"+tuKhoa+"%'";
         return DBConnection.GetData(cauTruyVan);
    }
     public static int Delete(String tenPB){
        String cauTruyVan = "delete PhongBan where TenPB = N'"+tenPB+"'";
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
     public static int UpdatePB(DTO.PhongBan suaPhongBan){
         String cauTruyVan = "UPDATE [dbo].[PhongBan]  " +
"   SET [TenPB] = N'"+suaPhongBan.getTenPB()+"'  " +
"      ,[DiaChi] = N'"+suaPhongBan.getDiaChi()+"'  " +
"      ,[SDT] = "+suaPhongBan.getSDT()+
" WHERE MaPB = "+suaPhongBan.getMaPB();
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
}
