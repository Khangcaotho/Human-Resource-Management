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
public class DAOLuong {
     public static ResultSet GetAllLuong(){
        String cauTruyVan = "Select * from Luong ";
        return DBConnection.GetData(cauTruyVan);
    }
     public static int ThemLuong(DTO.Luong luong){
         String cauTruyVan = "INSERT INTO [dbo].[Luong] " +
"           ([LuongCB] " +
"           ,[LuongThuong]) " +
"     VALUES " +
"           (" +luong.getLuongCB()+
"           ,"+luong.getLuongThuong()+")";
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
      public static ResultSet Search(String tuKhoa){
         String cauTruyVan = "select * from Luong where MaLuong like N'%"+tuKhoa+"%' or LuongCB like N'%"+tuKhoa+"%'";
         return DBConnection.GetData(cauTruyVan);
    }
     public static int Delete(String MaLuong){
        String cauTruyVan = "delete Luong where MaLuong = N'"+MaLuong+"'";
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
     public static int UpdateLuong(DTO.Luong suaLuong){
         String cauTruyVan = " Set dateformat DMY  "+
                 "UPDATE [dbo].[Luong]  " +
                "   SET [LuongCB] = N'"+suaLuong.getLuongCB()+"'  " +
                "      ,[LuongThuong] = N'"+suaLuong.getLuongThuong()+"'  " +
                " WHERE MaLuong = "+suaLuong.getMaLuong();
         int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
         return kq;
     }
}
