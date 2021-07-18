/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;

/**
 *
 * @author PANDIT
 */
public class ConnectionProvider {
    
    
    public static Connection getConnection()
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "");
            return con;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
        
    }
}
