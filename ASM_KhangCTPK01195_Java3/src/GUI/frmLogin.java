/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DBConnection;
import javax.swing.JFrame;

/**
 *
 * @author KhangCao
 */
public class frmLogin extends javax.swing.JFrame {

    //Tạo 1 biến toàn cục để lưu quyền
    public static String quyen;
    //Tạo đối tượng kết nối CSDL
    public static DAO.DBConnection conn = new DBConnection();
    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
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

        pnlChuaThongTin = new javax.swing.JPanel();
        lblTenDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lbldangnhap = new javax.swing.JLabel();
        lblhinhnen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập hệ thống chương trình");
        setUndecorated(true);

        pnlChuaThongTin.setBackground(new java.awt.Color(255, 255, 255));
        pnlChuaThongTin.setLayout(null);

        lblTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblTenDangNhap.setText("Tên đăng nhập :");
        pnlChuaThongTin.add(lblTenDangNhap);
        lblTenDangNhap.setBounds(170, 140, 130, 20);

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblMatKhau.setText("Mật khẩu :");
        pnlChuaThongTin.add(lblMatKhau);
        lblMatKhau.setBounds(220, 210, 90, 20);
        pnlChuaThongTin.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(320, 140, 247, 30);
        pnlChuaThongTin.add(txtMatKhau);
        txtMatKhau.setBounds(320, 210, 247, 28);

        btnDangNhap.setBackground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        pnlChuaThongTin.add(btnDangNhap);
        btnDangNhap.setBounds(200, 290, 140, 40);

        btnDangKy.setBackground(new java.awt.Color(0, 153, 51));
        btnDangKy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        pnlChuaThongTin.add(btnDangKy);
        btnDangKy.setBounds(400, 290, 140, 40);

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlChuaThongTin.add(lblClose);
        lblClose.setBounds(660, 20, 16, 29);

        lblMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });
        pnlChuaThongTin.add(lblMin);
        lblMin.setBounds(630, 20, 10, 29);

        lbldangnhap.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbldangnhap.setForeground(new java.awt.Color(255, 255, 255));
        lbldangnhap.setText("Đăng Nhập");
        pnlChuaThongTin.add(lbldangnhap);
        lbldangnhap.setBounds(60, 40, 200, 50);

        lblhinhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nendangnhap3.jpg"))); // NOI18N
        pnlChuaThongTin.add(lblhinhnen);
        lblhinhnen.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChuaThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String username = txtTenDangNhap.getText();
        String password = String.valueOf(txtMatKhau.getPassword());
        boolean kq = BLL.Login.KiemTra(username, password);
        if(kq){
            this.dispose();
            frmMain frm = new frmMain();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        jdlRegister jdl = new jdlRegister(this, true);
        jdl.setVisible(true);
        boolean kq = BLL.Login.KiemTra(BLL.Register.user.getUsername(), 
                BLL.Register.user.getPassword());
        if(kq){
            this.dispose();
            frmMain frm = new frmMain();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked

        this.setState(JFrame.ICONIFIED);

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lbldangnhap;
    private javax.swing.JLabel lblhinhnen;
    private javax.swing.JPanel pnlChuaThongTin;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
