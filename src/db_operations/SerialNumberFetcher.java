/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class SerialNumberFetcher
{
    public ArrayList getSid()
    {
        ArrayList a1=new ArrayList();
        
        try
        {
             Statement st=new DBDriver().createConnection();
            String query="select * from document_info";
             ResultSet rs=st.executeQuery(query);
             while(rs.next())
             {
                 a1.add(rs.getString(1));
             }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        System.out.println("A1 is: "+a1);
        return a1;
    }
}
