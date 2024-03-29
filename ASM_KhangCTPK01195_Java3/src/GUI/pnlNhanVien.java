/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLLNV;
import DTO.NhanVien;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KhangCao
 */
public class pnlNhanVien extends javax.swing.JPanel {

    private NhanVien nhanVien;

    /**
     * Creates new form pnlDG
     */
    public pnlNhanVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jDialog1 = new javax.swing.JDialog();
        scpNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlDieuHuong = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        btntk = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblcmnd = new javax.swing.JLabel();
        lblNgayVaoLam = new javax.swing.JLabel();
        lbldtut = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        txtcmnd = new javax.swing.JTextField();
        txtNgayVaoLam = new javax.swing.JTextField();
        cbbChucVu = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên Nhân Viên", "Địa chỉ", "CMND", "Ngày Vào Làm", "Chức Vụ", "Mã Nhân Viên"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        scpNhanVien.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setMinWidth(10);
            tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        add(scpNhanVien);
        scpNhanVien.setBounds(10, 389, 773, 197);

        pnlDieuHuong.setBackground(new java.awt.Color(255, 255, 255));
        pnlDieuHuong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnthem.setBackground(new java.awt.Color(255, 255, 255));
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 255, 255));
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btntk.setText("Tìm kiếm");
        btntk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDieuHuongLayout = new javax.swing.GroupLayout(pnlDieuHuong);
        pnlDieuHuong.setLayout(pnlDieuHuongLayout);
        pnlDieuHuongLayout.setHorizontalGroup(
            pnlDieuHuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDieuHuongLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btntk, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        pnlDieuHuongLayout.setVerticalGroup(
            pnlDieuHuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDieuHuongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDieuHuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDieuHuongLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlDieuHuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlDieuHuongLayout.createSequentialGroup()
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(pnlDieuHuong);
        pnlDieuHuong.setBounds(10, 315, 773, 63);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTenNhanVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTenNhanVien.setText("Tên Nhân Viên :");

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDiaChi.setText("Địa chỉ :");

        lblcmnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcmnd.setText("CMND :");
        lblcmnd.setToolTipText("");

        lblNgayVaoLam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNgayVaoLam.setText("Ngày Vào Làm:");

        lbldtut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldtut.setText("Chức Vụ :");

        txtcmnd.setToolTipText("");

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhân Viên", "Giám Đốc ", "Thư Ký", "Quản Lý" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcmnd)
                            .addComponent(lblDiaChi)
                            .addComponent(lblTenNhanVien))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(lblNgayVaoLam))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbldtut)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgayVaoLam)
                                    .addComponent(cbbChucVu, 0, 240, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayVaoLam)
                    .addComponent(txtNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcmnd)
                    .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtut)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(13, 13, 770, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nenkhoidong3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        
            
            String tenNV=txtTenNV.getText();
            String diaChi=txtdc.getText();
            String CMND=txtcmnd.getText();
            String ngayVaoLam=txtNgayVaoLam.getText();
            String ChucVu=cbbChucVu.getSelectedItem().toString();

        boolean kq = BLLNV.KiemTra(CMND,tenNV,diaChi,ChucVu, ngayVaoLam);
            if (kq) {
            BLLNV.LayDuLieu(tblNhanVien);
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btntkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkActionPerformed
        String tuKhoa = txttimkiem.getText();
        BLLNV.TimDuLieu(tblNhanVien, tuKhoa);
    }//GEN-LAST:event_btntkActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
      int kq = JOptionPane.showConfirmDialog(new JFrame(), "Bạn có chắc chắn xóa không?", "Thông báo xác nhận",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION){
            //Thực hiện xóa
            //Lấy các dòng được chọn
            int cacdong[] = tblNhanVien.getSelectedRows();
            for(int i = cacdong.length-1; i >= 0; i--){
               String tenDG = tblNhanVien.getValueAt(cacdong[i],1).toString();
               DAO.DAONhanVien.Delete(tenDG);
            }
            BLL.BLLNV.LayDuLieu(tblNhanVien);
        }
    }//GEN-LAST:event_btnxoaActionPerformed
    public static String DocGiaEdit;
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int soDongDuocChon = tblNhanVien.getSelectedRowCount();
        if(soDongDuocChon < 1){
            ThongBao.ThongBao("Bạn cần chon 1 dòng để sửa", "Thông báo");
            return;
        }
        String tenNV = txtTenNV.getText();
            String diaChi = txtdc.getText();
            String cMND = txtcmnd.getText();
            String ngayVaoLam = txtNgayVaoLam.getText();
            String chucVu = cbbChucVu.getSelectedItem().toString();
            int viTri=tblNhanVien.getSelectedRow();
            String maNV = tblNhanVien.getValueAt(viTri,6).toString();
            boolean kq = BLLNV.KiemTraSua(cMND, tenNV, diaChi, chucVu, ngayVaoLam,maNV);
            if (kq) {
            BLLNV.LayDuLieu(tblNhanVien);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
         if(tblNhanVien.getSelectedRowCount()>=1){
          btnxoa.setEnabled(true); 
        }
        if(tblNhanVien.getSelectedRowCount()>=1){
            btnSua.setEnabled(true);
            // lấy vị trí đc chọn
            int viTri = tblNhanVien.getSelectedRow();
            txtTenNV.setText(tblNhanVien.getValueAt(viTri,1).toString());
            txtdc.setText(tblNhanVien.getValueAt(viTri, 2).toString());
            txtcmnd.setText(tblNhanVien.getValueAt(viTri, 3).toString());
            txtNgayVaoLam.setText(tblNhanVien.getValueAt(viTri, 4).toString());
            cbbChucVu.setSelectedItem(tblNhanVien.getValueAt(viTri,5));
        }else{ 
            btnSua.setEnabled(false);
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntk;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox cbbChucVu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblNgayVaoLam;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblcmnd;
    private javax.swing.JLabel lbldtut;
    private javax.swing.JPanel pnlDieuHuong;
    private javax.swing.JScrollPane scpNhanVien;
    public javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtNgayVaoLam;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
