/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;


import DTO.NhanVien;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KhangCao
 */
public class BLLNV {
    public static DTO.NhanVien nhanVien = new NhanVien();
    public static void LayDuLieu(JTable jtbl){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[7];
        ResultSet rs = DAO.DAONhanVien.GetAllDG();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenNV");
                obj[2] = rs.getString("DiaChi");
                obj[3] = rs.getString("CMND");
                obj[4] = DAO.ChuyenDoi.GetNgay(rs.getDate("NgayVaoLam"));
                obj[5] = rs.getString("ChucVu");
                obj[6] = rs.getString("MaNV");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu ĐG", "Thông báo");
        }
    }
    public static void TimDuLieu(JTable jtbl,String tuKhoa){
        DefaultTableModel tbModel = (DefaultTableModel)jtbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAONhanVien.Search(tuKhoa);
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenNV");
                obj[2] = rs.getString("DiaChi");
                obj[3] = rs.getString("CMND");
                obj[4] = DAO.ChuyenDoi.GetNgay(rs.getDate("NgayVaoLam"));
                obj[5] = rs.getString("ChucVu");
                tbModel.addRow(obj);
            } 
        } catch (SQLException ex) {
            ThongBao.ThongBao("Không tìm thấy từ khóa","ThongBao");
        }
    }
    public static boolean KiemTra(String CMND, String tenNV, String diaChi,String ChucVu, String ngayVaoLam) {
        try {
            if (tenNV.length() < 6) {
                ThongBao.ThongBao("Tên đọc giả tối thiểu 6 chữ số", "Thông báo");
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
            if (CMND.trim().length() < 9) {
                ThongBao.ThongBao("Số CMND phải bằng 9 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm CMND", "Thông báo");
            return false;
        }
        nhanVien.setCMND(CMND);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setTenNV(tenNV);
        nhanVien.setChucVu(ChucVu);
        nhanVien.setNgayVaoLam(ngayVaoLam);
        int kq = DAO.DAONhanVien.ThemNV(nhanVien);
        if (kq > 0) {
            ThongBao.ThongBao("Thêm thành công","Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Thêm thất bại","Thông báo");
            return false;
        }
    }
    public static boolean KiemTraSua(String CMND,String tenNV,String diaChi,String chucVu,String ngayVaoLam,String maNV){
        try {
            if (CMND.trim().length() < 9) {
                ThongBao.ThongBao("Số CMND phải bằng 9 chữ số", "Thông báo");
                return false;
            }
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi thêm CMND", "Thông báo");
            return false;
        }
        try {
            if (tenNV.length() < 6) {
                ThongBao.ThongBao("Tên đọc giả tối thiểu 6 chữ số", "Thông báo");
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
        nhanVien.setCMND(CMND);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setTenNV(tenNV);
        nhanVien.setChucVu(chucVu);
        nhanVien.setNgayVaoLam(ngayVaoLam);
        nhanVien.setMaNV(maNV);
        int kq = DAO.DAONhanVien.UpdateNV(nhanVien);
        if (kq>0) {
            ThongBao.ThongBao("Sửa thành công", "Thông báo");
            return true;
        }else{
            ThongBao.ThongBao("Sửa thất bại","Thông báo");
            return false;
        }
    }     
}
