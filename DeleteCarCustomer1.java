
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class DeleteCarCustomer1 extends javax.swing.JFrame {
    static String id;
    /**
     * Creates new form DeleteCarCustomer1
     */
    public DeleteCarCustomer1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Car");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 10, 200, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LicNo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 190, 60, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(350, 190, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Return");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 310, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("<Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 370, 90, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 250, 190, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Work\\Desktop\\Project\\wallpapers\\car_interior_39-wallpaper-960x540.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 890, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        try {
            getres();
            delcar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteCarCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
           RentCar1 rc = new RentCar1();
           rc.setVisible(true);
           rc.pack();
           rc.setLocationRelativeTo(null);
           rc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(DeleteCarCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCarCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCarCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCarCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteCarCustomer1().setVisible(true);
        });
    }
    public void delcar()
    {
        String licno = jTextField1.getText();
        String SQL = "DELETE FROM payment WHERE RESID = '"+id+"' ";
        String SQL1 = "DELETE FROM reservation WHERE RESID = '"+id+"' ";
        String SQL2 = "DELETE FROM customer WHERE LICNO = '"+licno+"' ";
        

        try {
           Class.forName("oracle.jdbc.OracleDriver");
       }  catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
       }

        Statement stmt = null;
        Connection con = null;

       
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }

        
        try {
            stmt.executeUpdate(SQL);
            stmt.executeUpdate(SQL1);
            stmt.executeUpdate(SQL2);
            jLabel3.setText("Return Successful!");
        } catch (HeadlessException | SQLException e) {
            
        }
    }
    public void getres() throws ClassNotFoundException, SQLException
    {
        String licno = jTextField1.getText();
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement("select resid FROM reservation WHERE LICNO = '"+licno+"' ");
        ResultSet rs = st.executeQuery();
        if (rs.next())
        {
            
            id=rs.getString(1);
            System.out.println(id);
           
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}