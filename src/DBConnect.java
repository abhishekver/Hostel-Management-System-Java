
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tripp
 */
public class DBConnect extends javax.swing.JFrame {
    
                             String dbName = "database1";
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/"+dbName;
	String user = "root";
	String password = "root";
        
                             String data="UserID";
	
	Connection con = null;
                              Statement stmt, stmt2;
	PreparedStatement ps = null, ps2 = null, ps3=null, ps4=null;
	ResultSet rs = null,rs1=null, rs2=null, rs3=null;


}