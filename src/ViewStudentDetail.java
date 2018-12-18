/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tripp
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.sql.DriverManager;

public class ViewStudentDetail extends DBConnect    {

     private JTextField id;
     private JButton submit;
     private JLabel message;


     public ViewStudentDetail()   {
          createView();
          setTitle("Check Student Details");
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setSize(400,150);
         //̥̥̥pack();
          setLocationRelativeTo(null);
          setResizable(false);
     }

     public void createView()      {
          JPanel panel = new JPanel();
          getContentPane().add(panel);

          JLabel label = new JLabel("Enter the student Id: ");
          panel.add(label);

          id = new JTextField();
          id.setPreferredSize(new Dimension(150,30));
          panel.add(id);

          submit = new JButton("Submit");
          submit.addActionListener(new ActionListener()     {
               @Override
               public void actionPerformed(ActionEvent e)      {
                    String studID = id.getText();
                    if(studID.equals(null))  {
                         message.setText("This feild can't be empty");
                    }
                    else      {
                          if(!studID.contains("ST"))    {
                                studID="ST_"+studID; 
                        }        
                          try   {
                              
                                Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection(url, user, password);
                                String sql="Select name from studentdb where StudentID=?";
                                ps = con.prepareStatement(sql);
                                ps.setString(1,studID);
                                rs = ps.executeQuery(); 
                                
                                if(!rs.next())  {
                                    JOptionPane.showMessageDialog(null,"No student found with the given details!");
                                }
                                
                                else    {
                                    ViewPersonalInfo vpc =new ViewPersonalInfo(studID);
                                        vpc.setVisible(true);
                                }
                          }
                          catch(Exception exc)    {
                              message.setText("Something wrong happened at our end !");
                          }
                          
                    }
               }
          });
          panel.add(submit);

          message = new JLabel("Please Enter the student id.");
          panel.add(message);
     }

     public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable()    {
               @Override
               public void run()   {
                    new ViewStudentDetail().setVisible(true);
               }
          });
     }

}
