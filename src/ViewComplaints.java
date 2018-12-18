import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author MUJ
 */
public class ViewComplaints extends DBConnect {

    /**
     * Creates new form ViewComplaints
     */
    
    public void showdb()
    {          
        
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
    }
    
  
    
    public ViewComplaints() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              ViewComplaints vc= new ViewComplaints();
              vc.setVisible(false);
              vc.showdb();
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
