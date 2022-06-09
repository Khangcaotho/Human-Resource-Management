/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.Luong;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khang Cao
 */
public class BLLLuong {
     public static DTO.Luong luong = new Luong();
    public static void LayDuLieu(JTable jtbl){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[4];
        ResultSet rs = DAO.DAOLuong.GetAllLuong();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("LuongCB");
                obj[2] = rs.getString("LuongThuong");
                obj[3] = rs.getString("MaLuong");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu Luong", "Thông báo");
        }
    }
    public static void TimDuLieu(JTable jtbl,String tuKhoa){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[4];
        ResultSet rs = DAO.DAOLuong.Search(tuKhoa);
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("LuongCB");
                obj[2] = rs.getString("LuongThuong");
                obj[3] = rs.getString("MaLuong");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Không tìm thấy từ khóa","ThongBao");
        }
    }
    public static boolean KiemTra(String LuongCB, String LuongThuong) {
        
        try {
            if (LuongCB.length() == 0) {
                ThongBao.ThongBao("Lương cơ bản không được để trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm LươngCB ", "Thông báo");
        }
        try {
            if (LuongThuong.length() == 0) {
                ThongBao.ThongBao("Lương thưởng không được để trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm Lương Thưởng", "Thông báo");
        }
        
        
        luong.setLuongCB(LuongCB);
        luong.setLuongThuong(LuongThuong);
        int kq = DAO.DAOLuong.ThemLuong(luong);
        if (kq > 0) {
            ThongBao.ThongBao("Thêm thành công","Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Thêm thất bại","Thông báo");
            return false;
        }
    }
    public static boolean KiemTraSua(String LuongCB, String LuongThuong, String MaLuong){
                try {
            if (LuongCB.length() == 0) {
                ThongBao.ThongBao("Địa chỉ không được bỏ trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm địa chỉ", "Thông báo");
        }
        try {
            if (LuongThuong.length() == 0) {
                ThongBao.ThongBao("Địa chỉ không được bỏ trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm địa chỉ", "Thông báo");
        }
        luong.setLuongCB(LuongCB);
        luong.setLuongThuong(LuongThuong);
        luong.setMaLuong(MaLuong);       
        int kq = DAO.DAOLuong.UpdateLuong(luong);
        if (kq>0) {
            ThongBao.ThongBao("Sửa thành công", "Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Sửa thất bại","Thông báo");
            return false;
        }
    }
}
