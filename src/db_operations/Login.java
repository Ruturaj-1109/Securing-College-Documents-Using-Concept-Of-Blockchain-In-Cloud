/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Login
{
    public boolean doLogin(Statement st,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="select * from registration_info where user_name='"+username+"' and password='"+password+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
                flag=true;
            else
                flag=false;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return flag;
    }
}
