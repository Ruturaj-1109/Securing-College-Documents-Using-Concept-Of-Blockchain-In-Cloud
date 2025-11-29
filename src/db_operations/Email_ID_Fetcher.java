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
 * @author welcome
 */
public class Email_ID_Fetcher
{
    public ArrayList getEmailID(Statement st)
    {
        ArrayList email=new ArrayList();
        try
        {
            String query="select * from registration_info";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                email.add(rs.getString(3));
            }
            System.out.println("Email is: "+email);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return email;
    }
}
