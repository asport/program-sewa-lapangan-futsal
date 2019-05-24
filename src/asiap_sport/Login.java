package asiap_sport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    Connection con;
    Statement stt;
    ResultSet rss;

    
    public Login() {
        initComponents();
        Koneksi();
    }
   public void masuk(){
       try{
    String sql = "SELECT * FROM nama WHERE user = '"+txtusername.getText()+"' and password = '"+String.valueOf(txtpasword.getPassword())+"'";
    rss = stt.executeQuery(sql);
    if(rss.next()){    
        String user = rss.getString(1);
        String password = rss.getString(2);
        
        new Menu_Asiap_Sport().setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null, "Selamat Datang " + txtusername.getText());
    }
    }catch(Exception e){
      e.printStackTrace();
  }
   }
    public void Koneksi(){
    try{

        Class.forName("com.mysql.jdbc.Driver");
        String database = "jdbc:mysql://localhost/data";
        String userDtbs = "root";
        String passDtbs = "";
        con = DriverManager.getConnection(database,userDtbs,passDtbs);
        stt = con.createStatement();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi","Pesan",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtpasword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tblmasuk = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        minimize = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        asd = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asiap_sport");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.cyan);
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.cyan);
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 20));

        tblmasuk.setBackground(new java.awt.Color(255, 255, 255));
        tblmasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/adopsi.png"))); // NOI18N
        tblmasuk.setText("login");
        tblmasuk.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblmasukMouseMoved(evt);
            }
        });
        tblmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblmasukActionPerformed(evt);
            }
        });
        getContentPane().add(tblmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel.png"))); // NOI18N
        jButton4.setText("exit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 80, 30));

        minimize.setBackground(new java.awt.Color(0, 255, 255));
        minimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/downarrow2.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeMousePressed(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 20, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/setupuser.png"))); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/16 Pixel/001-folder.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        asd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        asd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/template/lapangan-futsal5.jpg"))); // NOI18N
        asd.setText("Jam");
        getContentPane().add(asd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void tblmasukMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmasukMouseMoved

}//GEN-LAST:event_tblmasukMouseMoved

private void tblmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblmasukActionPerformed
masuk();
    
}//GEN-LAST:event_tblmasukActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    //Memanggil Form Akun
    System.exit(0);
}//GEN-LAST:event_jButton4ActionPerformed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Akun().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Menu_Asiap_Sport().setVisible(true);
            dispose();    
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton tblmasuk;
    private javax.swing.JPasswordField txtpasword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
