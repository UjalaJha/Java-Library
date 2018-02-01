/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
/**
 *
 * @author Ujala Jha
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class javaconnect {
    Connection conn;
    
    
    public static Connection ConnecrDb(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java","root", "");
            System.out.print("Database is connected !");
            return conn;
            
        }
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - Error:"+e);
            return null;
        }     
        
}

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

