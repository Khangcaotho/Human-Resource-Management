/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KhangCao
 */
public class DAOUsers {
    //Hàm thực hiện lệnh SQL cho chức năng đăng nhập
    public static ResultSet DangNhap(String username){
        //Tạo câu truy vấn 
        String cauTruyVan = "Select * from USERs " +
        "where username = N'"+username+"'";
        //Thực thi câu truy vấn
        ResultSet rs = DBConnection.GetData(cauTruyVan);
        
        return rs; //Trả về bảng kết quả
    }
    //Hàm thực hiện lệnh SQL cho chức năng đăng nhập
    public static ResultSet KiemTraEmail(String email){
        //Tạo câu truy vấn 
        String cauTruyVan = "Select * from USERs " +
        "where email = N'"+email+"'";
        //Thực thi câu truy vấn
        ResultSet rs = DBConnection.GetData(cauTruyVan);
        
        return rs; //Trả về bảng kết quả
    }
    
    public static int Them(DTO.Users user){
        String cauTruyVan = "INSERT INTO [dbo].[Users]  " +
"           ([username]  " +
"           ,[password]  " +
"           ,[role]  " +
"           ,[fullname]  " +
"           ,[email]  " +
"          )  " +
"     VALUES  " +
"           (N'"+user.getUsername()+"'  " +
"           ,N'"+user.getPassword()+"'  " +
"           ,N'"+user.getRole()+"'  " +
"           ,N'"+user.getFullname()+"'  " +
"           ,N'"+user.getEmail()+"'  " +
"           )";
        int kq = DBConnection.ExecuteTruyVan(cauTruyVan);
        return kq;
        
    }
    
    //Tạo 1 hàm đổi mật khẩu (có 3 tham số)
    public static int ThayDoiMatKhau(String username,
            String password, String newpassword) {
        String cauTruyVan = "update Users set password = N'" + newpassword + "' "
                + "where username = N'" + username + "' and password = N'" + password + "'";
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
    
   
    public static ResultSet GetAllUser(){
        String cauTruyVan = "Select * from Users";
        return DBConnection.GetData(cauTruyVan);
    }
   public static ResultSet Search(String tukhoa) {
        //Tạo câu truy vấn
        String cauTruyVan = "Select * from users where username like N'%" + tukhoa + "%'  "
                + " or fullname like N'%" + tukhoa + "%'  or email like N'%" + tukhoa + "%' ";
        //Thực thi câu truy vấn trả về kết quả
        ResultSet rs = DBConnection.GetData(cauTruyVan);

        return rs; //Trả về toàn bộ dữ liệu lấy được từ CSDL
    }

    //Hàm Update user
    public static int Update(DTO.Users user) {
        String cauTruyVan = "UPDATE [dbo].[Users] "
                + "   SET [password] = N'" + user.getPassword() + "' "
                + "      ,[role] = N'" + user.getRole() + "' "
                + "      ,[fullname] = N'" + user.getFullname() + "' "
                + "      ,[email] = N'" + user.getEmail() + "'       "
                + " WHERE username = N'" + user.getUsername() + "'";

        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
     public static int Del(String username) {
        String cauTruyVan =" delete users where username = N'"+username+"' "; 
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
}
