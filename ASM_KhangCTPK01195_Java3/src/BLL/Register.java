/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.Users;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KhangCao
 */
public class Register {
    //Tạo 1 đối tượng user toàn cục
    public static DTO.Users user = new Users(); //khởi tạo user rỗng
    
    public static boolean KiemTra(String fullname, String username,
            String quyen, String email, String password, String repassword){
        //Kiểm tra thông tin đã đầy đủ và đúng chưa
        //TỰ LÀM
        
        //Kiểm tra trùng username
        ResultSet rs = DAO.DAOUsers.DangNhap(username);
        try {
            if(rs.next()){
                ThongBao.ThongBao("Tên đăng nhập đã tồn tại", "Thông báo");
                return false;
            }            
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi câu lệnh SQL", "Thông báo");
            return false;
        }
        
        //Kiểm tra trùng email
        ResultSet rsemail = DAO.DAOUsers.KiemTraEmail(email);
        try {
            if(rsemail.next()){
                ThongBao.ThongBao("Email đã được sử dụng", "Thông báo");
                return false;
            }            
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi câu lệnh SQL", "Thông báo");
            return false;
        }
        
        //Tạo 1 đối tượng Users chứa tất cả thông tin ở trên để đẩy xuống 
        // tầng DAL (CSDL)
        
        //Gán toàn bộ thông tin sau khi kiểm tra và user rỗng
        user.setEmail(email);
        user.setFullname(fullname);
        user.setPassword(password);
        user.setRole(quyen);
        user.setUsername(username);
        
        //Thêm user trên vào CSDL
        int kq =  DAO.DAOUsers.Them(user);
        if(kq > 0 ){
            ThongBao.ThongBao("Đăng ký thành công!", "Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Đăng ký thất bại!", "Thông báo");
            return false;
        }       
    }
}
