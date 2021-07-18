
package BillingManagementSystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;


public class Registration extends javax.swing.JFrame {

     Connection con=null;
     ResultSet rs = null;
     PreparedStatement ps = null;
    
    public Registration() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMob = new javax.swing.JTextField();
        txtAdhar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtPost = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        txtPin = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDist = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtVill = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1580, 910));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO OUR SHOP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 20, 314, 61);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1570, 0);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register Here ");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(454, 10, 229, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("District:");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(820, 230, 70, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtEmail);
        txtEmail.setBounds(720, 110, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email Id");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(640, 110, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mobile No");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(970, 110, 90, 30);

        txtMob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtMob);
        txtMob.setBounds(1070, 110, 220, 30);

        txtAdhar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAdhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdharActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtAdhar);
        txtAdhar.setBounds(1280, 230, 220, 30);
        kGradientPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 52, 1570, 2);
        kGradientPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 182, 1570, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Name");
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(300, 110, 60, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name & contact Details:");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(20, 60, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password:");
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(480, 410, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Pin code:");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(120, 290, 80, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("State:");
        kGradientPanel1.add(jLabel12);
        jLabel12.setBounds(350, 290, 50, 30);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtName);
        txtName.setBounds(370, 110, 220, 30);

        txtState.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtState);
        txtState.setBounds(410, 290, 180, 30);

        txtPost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtPost);
        txtPost.setBounds(560, 230, 220, 30);

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtUserId);
        txtUserId.setBounds(250, 410, 160, 30);

        txtPin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtPin);
        txtPin.setBounds(200, 290, 100, 30);
        kGradientPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 410, 0, 2);
        kGradientPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 382, 1570, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Adreess:");
        kGradientPanel1.add(jLabel13);
        jLabel13.setBounds(20, 200, 70, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Create Account: ");
        kGradientPanel1.add(jLabel14);
        jLabel14.setBounds(10, 400, 130, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Post Office:");
        kGradientPanel1.add(jLabel15);
        jLabel15.setBounds(460, 230, 90, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Adhaar Number:");
        kGradientPanel1.add(jLabel16);
        jLabel16.setBounds(1140, 230, 130, 30);

        txtDist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtDist);
        txtDist.setBounds(890, 230, 220, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Village:");
        kGradientPanel1.add(jLabel17);
        jLabel17.setBounds(120, 230, 70, 30);

        txtVill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kGradientPanel1.add(txtVill);
        txtVill.setBounds(200, 230, 220, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("User_Id:");
        kGradientPanel1.add(jLabel18);
        jLabel18.setBounds(170, 410, 70, 30);
        kGradientPanel1.add(txtPass);
        txtPass.setBounds(580, 410, 140, 30);
        kGradientPanel1.add(jSeparator5);
        jSeparator5.setBounds(0, 490, 1570, 20);

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnCreate);
        btnCreate.setBounds(280, 530, 120, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnBack);
        btnBack.setBounds(550, 530, 120, 30);

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnClose);
        btnClose.setBounds(1090, 530, 120, 30);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        kGradientPanel1.add(btnReset);
        btnReset.setBounds(820, 530, 120, 30);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 100, 1570, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostActionPerformed

    private void txtAdharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdharActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        try{
            String sql="insert into user_reg(name, email, mob, village, post, district, adhar, pincode, state "
                    + " userId, password) values(?,?,?,?,?,?,?,?,?,?,?)";
            
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, txtName.getText());
            ps.setString(2, txtEmail.getText());
            ps.setString(3, txtMob.getText());
            ps.setString(4, txtVill.getText());
            ps.setString(5, txtPost.getText());
            ps.setString(6, txtDist.getText());
            ps.setString(7, txtAdhar.getText());
            ps.setString(8, txtPin.getText());
            ps.setString(9, txtState.getText());
            ps.setString(10, txtUserId.getText());
            ps.setString(11, txtPass.getText());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "registration successfull");
            setVisible(false);
            
        }catch(HeadlessException | SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error occured during registration");
        
        }
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtAdhar;
    private javax.swing.JTextField txtDist;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMob;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPin;
    private javax.swing.JTextField txtPost;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtVill;
    // End of variables declaration//GEN-END:variables
}
