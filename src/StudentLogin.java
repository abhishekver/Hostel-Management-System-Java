
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUJ
 */
public class StudentLogin extends DBConnect {
     String studID="ST_5021";
     String Block;
     int Floor;
     int Room;
    /**
     * Creates new form StudentLogin
     */
    public StudentLogin(String studentID, String Block, int Floor, int Room) {
        this.studID=studentID;
        this.Block=Block;
        this.Floor=Floor;
        this.Room=Room;
    
        initComponents();
    jTextField1.setText(studID);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(849, 495));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("My Hostel ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 40, 110, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 30, 160, 30);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("View Registered Complaints");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 270, 290, 40);

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Change Password");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(350, 100, 220, 40);

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("View Personal Information");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(400, 180, 290, 40);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Register Complaint");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 90, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/student (1).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 2147483647));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     RequestService rs = new RequestService(Block,Floor,Room);
     rs.setVisible(true);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
      String d_Password=null;
       try
          {        
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select Password from login where UserID =?";
            ps = con.prepareStatement(sql);            
            ps.setString(1,studID);
            rs = ps.executeQuery();
      
              while(rs.next())
             {d_Password=rs.getString("Password");}
                             
           }  
           catch(Exception e)
          { System.out.println(e);
           JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
	   JOptionPane.ERROR_MESSAGE);
          }
        ChangePassword cp = new ChangePassword(studID,d_Password);
      cp.setVisible(true);// TODO add your handling code here:
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JTable jTable1;      
        JScrollPane scroll;
        JFrame frame,frame1;
            
        String [] columnNames ={"ServiceID","Block","Floor","Room","Service Type","Details","Created On","Complaint Status"};
       /**
     * Creates new form ViewStudents
     */     
        frame1 = new JFrame("Database Search Result");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
         
          DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
        
         jTable1= new JTable();     
                       
            jTable1.setModel(model);
            jTable1.setVisible(true);    
             TableColumnModel columnModel = jTable1.getColumnModel();
           columnModel.getColumn(0).setPreferredWidth(30);
           columnModel.getColumn(1).setPreferredWidth(5);
           columnModel.getColumn(2).setPreferredWidth(5);
           columnModel.getColumn(3).setPreferredWidth(5);
         //  jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jTable1.setFillsViewportHeight(true);
            
            scroll = new JScrollPane(jTable1);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
        try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services where Block =? and Floor=? and Room=?";
            ps = con.prepareStatement(sql);            
            ps.setString(1,Block);
            ps.setInt(2,Floor);
            ps.setInt(3,Room);
            rs = ps.executeQuery();
            int d_ServiceID, d_Floor, d_Room;
            String d_Service_Type, d_Details, d_Created_On, d_Block, d_status;
              int i=0;
              while(rs.next())
             {d_ServiceID=rs.getInt("ServiceID");
              d_Block=rs.getString("Block");
              d_Floor=rs.getInt("Floor");
              d_Room=rs.getInt("Room");
              d_Service_Type=rs.getString("Service_Type");
              d_Details=rs.getString("Details");
              d_Created_On=rs.getString("Created_On");
              d_status=rs.getString("Complaint_Status");
              model.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
              i++;           
             
             }
             
             if(i<1)
             {JOptionPane.showMessageDialog(null,"No Record Found","Error",JOptionPane.ERROR_MESSAGE);}
             
             if(i==1)
             {System.out.println(i+"Record Found");}
             
             else
             {System.out.println(i+"Records Found");}
                  
           }  
           catch(Exception e)
          {            
              System.out.println(e);
           JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
				  JOptionPane.ERROR_MESSAGE);}
            frame1.add(scroll);
            frame1.setVisible(true);
            frame1.setSize(800,300);
            frame1.setLocationRelativeTo(null);	
        //show Table data enda
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // TODO add your handling code here:
       ViewPersonalInfo vpc =new ViewPersonalInfo(studID);
       vpc.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new StudentLogin("ST_5021").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
