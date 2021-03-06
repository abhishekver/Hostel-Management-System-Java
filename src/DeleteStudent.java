
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUJ
 */
public class DeleteStudent extends DBConnect {

    /**
     * Creates new form AddStudent
     */
            
    public DeleteStudent() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Student");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 204, 51));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration No");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Delete Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         //deleting from block table
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt= con.createStatement();

            String d_studentID=(jTextField1.getText());
            if(!d_studentID.contains("ST"))    {
               d_studentID="ST_"+d_studentID; 
            }
            String d_block, sql3,sql2;
            int d_RoomNo, d_floor;
            
              sql2="select name from studentdb where StudentID = ?";
              ps2=con.prepareStatement(sql2);
              ps2.setString(1,d_studentID);
              rs2=ps2.executeQuery();
              if(!rs2.next()) {
                  JOptionPane.showMessageDialog(null,"No student found with the given details!");
              }
            
              else  {
            sql2="select Block, Floor, RoomNo from studentdb where StudentID = ?";
              ps2=con.prepareStatement(sql2);
              ps2.setString(1,d_studentID);
              rs2=ps2.executeQuery();
              
                  try { if(rs2.next())
                            {   d_block=(rs2.getString(1));
                                d_floor=Integer.parseInt(rs2.getString(2));
                                d_RoomNo=Integer.parseInt(rs2.getString(3));
                                
                                //further changes
                                 int occ;             
                  sql3="select Status, NoOfOccupants from "+d_block+" where Floor= ? and Room = ?";
                  //sql="SELECT COUNT(*) FROM "+d_block+" WHERE STATUS= 'Vacant' ";
                  ps3=con.prepareStatement(sql3);
                  ps3.setInt(1,d_floor);
                  ps3.setInt(2,d_RoomNo);
                  rs3=ps3.executeQuery();
                    
                    String sql4, d_status;
                    try { if(rs3.next())
                           { if(rs3.getString(2).equals("0")==false)
                              {
                                occ=Integer.parseInt(rs3.getString(2));
                               occ=occ-1;
                               System.out.println(occ);
                                                        
                                 d_status="Vacant";
                             
                                sql4="update "+d_block+" set NoOfOccupants = ?, Status= ? where Room = ? and Floor = ?";//
                                ps4=con.prepareStatement(sql4);
                                 ps4.setInt(1,occ);
                                 ps4.setString(2,d_status);
                                 ps4.setInt(3,d_RoomNo);
                                 ps4.setInt(4,d_floor);
                                 ps4.executeUpdate();
                              } 
                            }
                         } 
               
               catch (SQLException ex) {
                    Logger.getLogger(AddStudent2.class.getName()).log(Level.SEVERE, null, ex);}  
                                //further changes end
                                                                
                             }
                         } 
               
               catch (SQLException ex) {
                    Logger.getLogger(AddStudent2.class.getName()).log(Level.SEVERE, null, ex);}  
                        
       //deletion from block ends
            
           //deleting from studentdb
            String sql="delete from studentdb where StudentID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, d_studentID);
            ps.executeUpdate();
            //deleting from studentdb ends
            
            JOptionPane.showMessageDialog(null,"Deleted Successfully!");

            con.close();

        }
        }
        catch(RoomFullException e)
              { System.out.println(e);
            JOptionPane.showMessageDialog(null, "Room Already Full!","Book another Room!!",
                JOptionPane.ERROR_MESSAGE );  }

        catch(Exception e)
        { 
            
           System.out.println(e);
            JOptionPane.showMessageDialog(null, "Update failed!","Failed!!",
                JOptionPane.ERROR_MESSAGE );  
        }    // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
             DeleteStudent ds = new DeleteStudent();
             ds.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
