/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajee
 */
public class DBConection {
    
   public static Connection getDbConecton(){
       Connection con=null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
            System.out.println("db");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
       }
           
       return con;
   }
}
    

