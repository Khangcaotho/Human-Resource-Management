/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import GUI.frmLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KhangCao
 */
public class Login {
    public static boolean KiemTra(String username, String password){
        if(username.trim().length() < 5){
            //Thông báo
            ThongBao.ThongBao("Tên đăng nhập chưa hợp lệ", "Thông báo đăng nhập");
            return false;
        }        
        if(password.trim().length() < 5){
            ThongBao.ThongBao("Mật khẩu chưa hợp lệ", "Thông báo đăng nhập");
            return false;
        }        
        //Gọi hàm kiểm tra đăng nhập với SQL từ tầng DAO
        ResultSet rs = DAO.DAOUsers.DangNhap(username);
        
        try {
            if(!rs.next()){
                ThongBao.ThongBao("Tên đăng nhập không đúng", "Thông báo");
                return false;
            }else{
                if(!rs.getString("password").equals(password)){
                    ThongBao.ThongBao("Mật khẩu không đúng", "Thông báo");
                    return false;
                }else{
                    //Khi đăng nhập thành công
                    frmLogin.quyen = rs.getString("role");  //Lấy quyền
                    //Lấy toàn bộ thông tin của user vừa đăng nhập
                    Register.user.setCreatedDate(rs.getDate("createddate"));
                    Register.user.setEmail(rs.getString("email"));
                    Register.user.setFullname(rs.getString("fullname"));
                    Register.user.setPassword(rs.getString("password"));
                    Register.user.setRole(rs.getString("role"));
                    Register.user.setUsername(rs.getString("username"));
                    
                    
                }
                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi câu lệnh SQL", "Thông báo lỗi");
            return false;
        }
        
        return true; //Nếu thông tin hợp và khớp username + password
    }
}
