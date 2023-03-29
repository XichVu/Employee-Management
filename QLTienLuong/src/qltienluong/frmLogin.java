/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qltienluong;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    
    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDangNhap = new javax.swing.JPanel();
        titleDangNhap = new javax.swing.JLabel();
        imgDangNhap = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");

        panelDangNhap.setBackground(new java.awt.Color(247, 247, 247));

        titleDangNhap.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        titleDangNhap.setForeground(new java.awt.Color(4, 170, 109));
        titleDangNhap.setText("ĐĂNG NHẬP");

        imgDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoginG.png"))); // NOI18N

        lblTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(4, 170, 109));
        lblTaiKhoan.setText("Tài Khoản:");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(4, 170, 109));
        lblMatKhau.setText("Mật Khẩu:");

        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(3, 170, 109));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(4, 170, 109));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDangNhapLayout = new javax.swing.GroupLayout(panelDangNhap);
        panelDangNhap.setLayout(panelDangNhapLayout);
        panelDangNhapLayout.setHorizontalGroup(
            panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDangNhapLayout.createSequentialGroup()
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDangNhapLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(titleDangNhap))
                    .addGroup(panelDangNhapLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaiKhoan)
                            .addComponent(lblMatKhau))
                        .addGap(18, 18, 18)
                        .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDangNhapLayout.createSequentialGroup()
                                .addComponent(btnDangNhap)
                                .addGap(29, 29, 29)
                                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                            .addComponent(txtTaiKhoan)
                            .addComponent(txtMatKhau)))
                    .addGroup(panelDangNhapLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(imgDangNhap)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panelDangNhapLayout.setVerticalGroup(
            panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDangNhapLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imgDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleDangNhap)
                .addGap(33, 33, 33)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaiKhoan)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        // Code Đăng nhập -- Liên kết CSDL
        // Thông báo nếu Tài khoản trống
        if (txtTaiKhoan.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Tài khoản!");
        } else if (txtMatKhau.getPassword().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mật khẩu!");
        } else {
            try {
                String dbUrl = "jdbc:sqlserver://CHIEN-20210609J\\SQLEXPRESS:1433;databaseName=QuanLyTaiKhoan;user=sa;password=123456";
                Connection conn = DriverManager.getConnection(dbUrl);
           
                String sql = "SELECT * FROM QuanLyTaiKhoan\n" + "WHERE TaiKhoan=? AND MatKhau=?";
                PreparedStatement qltk = conn.prepareStatement(sql);
                qltk.setString(1, txtTaiKhoan.getText());
                qltk.setString(2, txtMatKhau.getText());
                
                ResultSet rs = qltk.executeQuery();
                if (rs.next()){
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                    frmMain fm = new frmMain();
                    fm.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu bạn nhập không đúng!");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel imgDangNhap;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JPanel panelDangNhap;
    private javax.swing.JLabel titleDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
