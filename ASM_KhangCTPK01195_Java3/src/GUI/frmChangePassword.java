/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DAOUsers;
import DAO.DBConnection;

/**
 *
 * @author KhangCao
 */
public class frmChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form frmChangePassword
     */
    public frmChangePassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNhanTen = new javax.swing.JLabel();
        lblTenNguoiDung = new javax.swing.JLabel();
        lblMatKhauCu = new javax.swing.JLabel();
        lblMatKhauMoi = new javax.swing.JLabel();
        lblNhapLaiMK = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        txtMatKhauCu = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtNhapLaiMK = new javax.swing.JPasswordField();
        lbldangnhap = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblhinhnen = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thay đổi mật khẩu");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        lblNhanTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNhanTen.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanTen.setText("Tên người dùng :");
        jPanel2.add(lblNhanTen);
        lblNhanTen.setBounds(160, 120, 150, 22);

        lblTenNguoiDung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTenNguoiDung.setForeground(new java.awt.Color(255, 204, 204));
        lblTenNguoiDung.setText("Nguyễn Văn A");
        jPanel2.add(lblTenNguoiDung);
        lblTenNguoiDung.setBounds(320, 120, 160, 22);

        lblMatKhauCu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMatKhauCu.setForeground(new java.awt.Color(255, 255, 255));
        lblMatKhauCu.setText("Mât khẩu cũ :");
        jPanel2.add(lblMatKhauCu);
        lblMatKhauCu.setBounds(190, 170, 120, 22);

        lblMatKhauMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMatKhauMoi.setForeground(new java.awt.Color(255, 255, 255));
        lblMatKhauMoi.setText("Mật khẩu mới :");
        jPanel2.add(lblMatKhauMoi);
        lblMatKhauMoi.setBounds(180, 230, 130, 22);

        lblNhapLaiMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNhapLaiMK.setForeground(new java.awt.Color(255, 255, 255));
        lblNhapLaiMK.setText("Nhập lại mật khẩu :");
        jPanel2.add(lblNhapLaiMK);
        lblNhapLaiMK.setBounds(140, 290, 160, 22);

        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel2.add(btnDoiMatKhau);
        btnDoiMatKhau.setBounds(300, 341, 140, 40);
        jPanel2.add(txtMatKhauCu);
        txtMatKhauCu.setBounds(320, 160, 230, 30);
        jPanel2.add(txtMatKhauMoi);
        txtMatKhauMoi.setBounds(320, 220, 230, 30);
        jPanel2.add(txtNhapLaiMK);
        txtNhapLaiMK.setBounds(320, 280, 230, 30);

        lbldangnhap.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbldangnhap.setForeground(new java.awt.Color(255, 255, 255));
        lbldangnhap.setText("Thay Đổi Mật Khẩu");
        jPanel2.add(lbldangnhap);
        lbldangnhap.setBounds(40, 30, 340, 50);

        lblMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });
        jPanel2.add(lblMin);
        lblMin.setBounds(630, 20, 10, 29);

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel2.add(lblClose);
        lblClose.setBounds(660, 20, 16, 29);

        lblhinhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nendangnhap3.jpg"))); // NOI18N
        jPanel2.add(lblhinhnen);
        lblhinhnen.setBounds(0, 0, 720, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblTenNguoiDung.setText(BLL.Register.user.getFullname());
    }//GEN-LAST:event_formWindowOpened

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        //Lấy thông tin từ trên form và từ user đã đăng nhập
        String username = BLL.Register.user.getUsername();
        String passwordcu = String.valueOf(txtMatKhauCu.getPassword());
        String passwordmoi = String.valueOf(txtMatKhauMoi.getPassword());
        
        //Hàm kiểm tra hợp lệ (Tự viết)
        
        //Nếu kiểm tra hợp lệ thì gọi hàm đổi mật khẩu
        int kq = DAOUsers.ThayDoiMatKhau(username, passwordcu, passwordmoi);
        if(kq > 0){
            ThongBao.ThongBao("Đổi mật khẩu thành công!", "Thông báo");
            this.dispose();
            frmLogin frm = new frmLogin();
            frm.setVisible(true);
        }else{
            ThongBao.ThongBao("Đổi mật khẩu thất bại!", "Thông báo");
        }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked

    }//GEN-LAST:event_lblMinMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMatKhauCu;
    private javax.swing.JLabel lblMatKhauMoi;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNhanTen;
    private javax.swing.JLabel lblNhapLaiMK;
    private javax.swing.JLabel lblTenNguoiDung;
    private javax.swing.JLabel lbldangnhap;
    private javax.swing.JLabel lblhinhnen;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMK;
    // End of variables declaration//GEN-END:variables
}
