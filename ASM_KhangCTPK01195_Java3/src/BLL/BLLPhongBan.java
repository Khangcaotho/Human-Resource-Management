/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.PhongBan;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khang Cao
 */
public class BLLPhongBan {
    public static DTO.PhongBan phongBan = new PhongBan();
    public static void LayDuLieu(JTable jtbl){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        ResultSet rs = DAO.DAOPhongBan.GetAllPB();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenPB");
                obj[2] = rs.getString("DiaChi");
                obj[3] = rs.getString("SDT");
                obj[4] = rs.getString("MaPB");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu PB", "Thông báo");
        }
    }
    public static void TimDuLieu(JTable jtbl,String tuKhoa){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        ResultSet rs = DAO.DAOPhongBan.Search(tuKhoa);
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenPB");
                obj[2] = rs.getString("DiaChi");
                obj[3] = rs.getString("SDT");
                obj[4] = rs.getString("MaPB");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Không tìm thấy từ khóa","ThongBao");
        }
    }
    public static boolean KiemTra(String SDT, String tenPB, String diaChi) {
        try {
            if (tenPB.length() < 6) {
                ThongBao.ThongBao("Tên phong ban thiểu 6 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm NV","Thông báo");
        }
        try {
            if (diaChi.length() == 0) {
                ThongBao.ThongBao("Địa chỉ không được bỏ trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm địa chỉ", "Thông báo");
        }
        try {
            if (SDT.trim().length() <= 9) {
                ThongBao.ThongBao("Số CMND phải bằng 9 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm CMND", "Thông báo");
            return false;
        }
        phongBan.setTenPB(tenPB);
        phongBan.setDiaChi(diaChi);
        phongBan.setSDT(SDT);
        
        int kq = DAO.DAOPhongBan.ThemPB(phongBan);
        if (kq > 0) {
            ThongBao.ThongBao("Thêm thành công","Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Thêm thất bại","Thông báo");
            return false;
        }
    }
    public static boolean KiemTraSua(String SDT,String tenPB,String diaChi,String MaPB){
        try {
            if (tenPB.length() < 6) {
                ThongBao.ThongBao("Tên phong ban thiểu 6 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm NV","Thông báo");
        }
        try {
            if (diaChi.length() == 0) {
                ThongBao.ThongBao("Địa chỉ không được bỏ trống","Thông Báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm địa chỉ", "Thông báo");
        }
        try {
            if (SDT.trim().length() <= 9) {
                ThongBao.ThongBao("Số CMND phải bằng 9 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm CMND", "Thông báo");
            return false;
        }
        phongBan.setTenPB(tenPB);
        phongBan.setDiaChi(diaChi);
        phongBan.setSDT(SDT);
        phongBan.setMaPB(MaPB);
        int kq = DAO.DAOPhongBan.UpdatePB(phongBan);
        if (kq>0) {
            ThongBao.ThongBao("Sửa thành công", "Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Sửa thất bại","Thông báo");
            return false;
        }
    } 
}
