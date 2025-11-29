/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class DBDriver 
{
      public Statement createConnection()
    {
        Statement st=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://shubhdatabase-1.czuo0ouoodfa.ap-south-1.rds.amazonaws.com:3306/cldb?characterEncoding=utf8","admin","admin123");
            st=con.createStatement();
         
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return st;
    }
}
