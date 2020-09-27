/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import java.sql.*;
/**
 *
 * @author User
 * 
 */
public class Demo {
    private static int x;
 public static void main(String a[]){
     try{
 Class.forName("com.mysql.jdbc.Driver");
 
 Connection con = DriverManager.getConnection("jdbc:mysql"
         + "://localhost:3306/happysmile","root","");
 
 Statement st = con.createStatement();
         String sql = "select* from supp";
     //   ResultSet rs = st.executeQuery(sql);
         boolean b = st.execute(sql);
         
         System.out.println(b);
 /*if(x!= 0)
      while(rs.next()){
         System.out.println(rs.getInt(1));
         System.out.println(rs.getString(2));
         System.out.println(rs.getString(3));
         System.out.println(rs.getString(4));
         System.out.println(rs.getString(5));
         System.out.println(rs.getString(6));
         System.out.println(rs.getString(7));
         System.out.println(rs.getString(8));
         System.out.println(rs.getString(9));
         }
         */
     System.out.print("Data inserted");
 con.close();
 
  }catch(ClassNotFoundException e){
            System.out.println(e);
}catch(SQLException e){
            System.out.println(e);
}
}
}