/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Sehan Iroshana
 */
public class DB {
    private static Connection c;
    
    private static void setUpConnection()throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
       
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawningCenterdb","root","123");
      
    }
    
    public static void IUD(String sql)throws Exception{
      if(c==null){
        setUpConnection();
      }
      c.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet SEARCH(String sql)throws Exception{
      if(c==null){
        setUpConnection();
      }
      return c.createStatement().executeQuery(sql);
    }
    
    public static Connection getConnection()throws Exception{
      if(c==null){
       setUpConnection();
      }
      return c;
    }
}
