
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class TotalAmount1 extends javax.swing.JFrame {
    static String cid;
    static String total;
    static String r;
    /**
     * Creates new form TotalAmount1
     */
    public TotalAmount1() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 290, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lic No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 160, 60, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(370, 160, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Get Total");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 230, 95, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 370, 100, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 20, 260, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Total is");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 290, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Work\\Desktop\\Project\\wallpapers\\mercedes_benz_c_coupe-wallpaper-960x540.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 900, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            String licno  = jTextField1.getText(); 
           try {
               getCID(licno);
               getTotal(licno);
               //insert();
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(TotalAmount.class.getName()).log(Level.SEVERE, null, ex);
           }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
            LoginForm1 lf = new LoginForm1();
           lf.setVisible(true);
           lf.pack();
           lf.setLocationRelativeTo(null);
           lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TotalAmount1().setVisible(true);
        });
    }
   public void getCID(String licno) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement("select cid FROM reservation WHERE LICNO = '"+licno+"' ");
        ResultSet rs = st.executeQuery();
        if (rs.next())
        {
            
            cid=rs.getString(1);
           
        }
    }
     public void getTotal(String licno) throws SQLException, ClassNotFoundException
    {   System.out.print(cid);
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement(" select c.priceperday * r.noofdays\n" +
" as totalamount\n" +
" from car c,reservation r where c.cid='"+cid+"' and r.licno='"+licno+"' ");
        ResultSet rs = st.executeQuery();
        if (rs.next())
        {   
            total = rs.getString(1);
            System.out.println(total);
            jLabel1.setText(total);
            insertvalues(total,licno);
           
        }
    }
    public void insertvalues(String total,String licno) throws ClassNotFoundException, SQLException
    {
        getresid(licno);
        System.out.println(r);
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        String sql = "update payment set totalamount =  '"+total+"'  where resid = '"+r+"' ";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
  
        
        int a = pst.executeUpdate();
        if(a>0)
        {
            System.out.println("Row Updated Successfully");
        }
    }
    public void getresid(String licno) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement("select resid FROM reservation WHERE LICNO = '"+licno+"' ");
        ResultSet rs = st.executeQuery();
        if (rs.next())
        {
            
            r=rs.getString(1);
           
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}