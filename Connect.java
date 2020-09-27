/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package connect;

/**
 *
 * @author User
 */
import java.sql.*;
public class Connect {
Connection con = null;
public Connection start()throws ClassNotFoundException, SQLException
{
   Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happysmile","root","");
    return con;
}
public void stop()throws SQLException{
con.close();
}

  
}
