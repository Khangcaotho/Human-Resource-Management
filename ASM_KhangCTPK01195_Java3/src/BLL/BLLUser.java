/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.DAOUsers;
import DTO.Users;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KhangCao
 */
public class BLLUser {
    //Hàm đổ dữ liệu User vào JTable 
    public static void DoDuLieu(JTable tbl){
        //Tạo 1 DefaultTableModel 
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        //Xóa các dòng trong table
        tbModel.setRowCount(0);
        //Tạo 1 mảng Object có 5 phần tử
        Object obj[] = new Object[5];
        //Lấy dữ liệu từ tầng DAO
        ResultSet rs = DAO.DAOUsers.GetAllUser();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("fullname");
                obj[2] = rs.getString("username");
                obj[3] = rs.getString("email");
                obj[4] = rs.getString("createddate");

                //Thêm obj vào table
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu Users", "Thông báo");
        }
    }
    public static void DoDuLieu(JTable tbl, String tuKhoa){
        //Tạo 1 DefaultTableModel 
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        //Xóa các dòng trong table
        tbModel.setRowCount(0);
        //Tạo 1 mảng Object có 5 phần tử
        Object obj[] = new Object[5];
        
        //Lấy dữ liệu từ tầng DAO
        java.sql.ResultSet rs = DAO.DAOUsers.Search(tuKhoa);
        
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("fullname");
                obj[2] = rs.getString("username");
                obj[3] = rs.getString("email");
                obj[4] = rs.getString("createddate");

                //Thêm obj vào table
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu Users", "Thông báo");
        }
    }
    public static boolean KiemTraVaLuu(String usernameEdit, String Fullname,
            String email, String password, String role){
        
        //Kiểm tra Fullname >6 và <50
        if(Fullname.length() < 6 || Fullname.length() > 50){
            ThongBao.ThongBao("Họ và tên có độ dài từ 6 đến 50 ký tự", "Thông báo");
            return false;
        }
        
        //Kiểm tra email >6 và <50
        if(email.length() < 6 || email.length() > 50){
            ThongBao.ThongBao("Email có độ dài từ 6 đến 50 ký tự", "Thông báo");
            return false;
        }
        
        //Kiểm tra email không đúng định dạng (Dùng regex)
        
        //Kiểm tra trùng email
        ResultSet rs = DAOUsers.KiemTraEmail(email);
        try {
            if(rs.next()){ //Chưa đủ
                if(!rs.getString("username").equals(usernameEdit)){
                    ThongBao.ThongBao("Email đã được sử dụng!", "Thông báo"); 
                    return false;
                }
                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy User theo Email", "Thông báo");
            return false;
        }
        
        //Kiểm tra password
        //Nếu khác rỗng thì mới kiểm tra độ dài và định dạng...
        if(!password.isEmpty()){
            if(password.length() < 6 || password.length() > 50){
                ThongBao.ThongBao("Password có độ dài từ 6 đến 50 ký tự", "Thông báo");
                return false;
            }
        }
        //Lấy thông tin của user dựa vào Username
        ResultSet rsUser = DAOUsers.DangNhap(usernameEdit);
        try {
            if(rsUser.next()){
                Users user = new Users(); //Tạo mới user
                user.setUsername(rsUser.getString("username")); //Set lại các thông tin
                user.setEmail(email);
                user.setFullname(Fullname);
                user.setRole(role);
                if(!password.isEmpty()){  //Mật khẩu khác rỗng thì set mk mới
                    user.setPassword(password);
                }else{
                    user.setPassword(rsUser.getString("password"));
                }
                user.setCreatedDate(rsUser.getDate("createddate"));
                //Gọi hàm sửa user bên DAO
                int kq = DAOUsers.Update(user);
                if(kq > 0){
                    return true;
                }else{
                    return false;
                }
                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy và gán thông tin user", "Thông báo");
            return false;
        }
        return false;
    }   
    
}
