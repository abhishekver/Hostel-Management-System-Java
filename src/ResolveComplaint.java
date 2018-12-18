
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
public class ResolveComplaint extends DBConnect {

    /**
     * Creates new form ResolveComplaint
     */
    public static DefaultTableModel model2;
     public static JScrollPane scroll1;
      
    public ResolveComplaint() {
        initComponents();
       
       
String dbName = "database1";
             String driver = "com.mysql.jdbc.Driver";
	     String url = "jdbc:mysql://localhost:3306/"+dbName;
	     String user = "root";
	     String password = "root";
             String data=null;
	
	Connection con = null;
        Statement stmt;
	PreparedStatement ps = null, ps2 = null, ps3=null, ps4=null;
	ResultSet rs = null,rs1=null, rs2=null, rs3=null;
        try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services ";
            ps = con.prepareStatement(sql);            
            
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
              model2.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
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
				  JOptionPane.ERROR_MESSAGE);
          }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 414));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service Id");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 110, 25);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 10, 100, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Resolve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 70, 110, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("View Pending");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 70, 150, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 70, 120, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("View Resolved");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(620, 70, 150, 30);

        model2=new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Service ID","Block","Floor","Room","Service_Type","Details","Created On","Complaint Status"});
        jTable2.setModel(model2);
        jTable2.setFillsViewportHeight(true);
        jTable2.setFillsViewportHeight(true);
        TableColumnModel columnModel = jTable2.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(5);
        columnModel.getColumn(2).setPreferredWidth(5);
        columnModel.getColumn(3).setPreferredWidth(5);
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 930, 220);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-1, -3, 1160, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int service_id=Integer.parseInt(jTextField1.getText());  
               /*JTable jTable1;      
        JScrollPane scroll;
        JFrame frame,frame1;
            
        String [] columnNames ={"ServiceID","Block","Floor","Room","Service Type","Details","Created On","Complaint Status"};
         
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
           jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jTable1.setFillsViewportHeight(true);
              
            
            scroll = new JScrollPane(jTable1);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            */
        try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql2="UPDATE services SET Complaint_Status=\"Resolved\" WHERE ServiceID=?";
            ps2=con.prepareStatement(sql2);
              ps2.setInt(1,service_id);  
              ps2.executeUpdate();
               model2.setRowCount(0);
               
                
          
                
                 try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services ";
            ps = con.prepareStatement(sql);            
            
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
              model2.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
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
				  JOptionPane.ERROR_MESSAGE);
          }
JOptionPane.showMessageDialog(null,"Complaint Resolved","Alert",JOptionPane.WARNING_MESSAGE);
                
                
                
                /*String sql="Select * from services where ServiceID=?";
            ps = con.prepareStatement(sql);      
            ps.setInt(1,service_id);

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
              */
                  
           }  
           catch(Exception e)
          {            
              System.out.println(e);
           JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
				  JOptionPane.ERROR_MESSAGE);}
           // frame1.add(scroll);
            //frame1.setVisible(true);
            //frame1.setSize(800,300);
            //frame1.setLocationRelativeTo(null);	
        //show Table data enda        // TODO add your handling code here:
                                              

   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
                       model2.setRowCount(0);
               
                
          
                
                 try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services where Complaint_Status=? ";
           
            ps = con.prepareStatement(sql);            
            ps.setString(1,"Pending");
            
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
              model2.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
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
				  JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
                       model2.setRowCount(0);
               
                
          
                
                 try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services ";
           
            ps = con.prepareStatement(sql);            
                    
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
              model2.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
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
				  JOptionPane.ERROR_MESSAGE);
          }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
                       model2.setRowCount(0);
                           
          
                
                 try
          { 
          
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, user, password);
            String sql="Select * from services where Complaint_Status=? ";
           
            ps = con.prepareStatement(sql);            
            ps.setString(1,"Resolved");
            
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
              model2.addRow(new Object[]{d_ServiceID,d_Block,d_Floor,d_Room,d_Service_Type,d_Details,d_Created_On,d_status});
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
				  JOptionPane.ERROR_MESSAGE);
          }          // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ResolveComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResolveComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResolveComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResolveComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResolveComplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
