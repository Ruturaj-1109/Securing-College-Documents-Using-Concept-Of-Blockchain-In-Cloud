/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;

import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class User_Registration 
{
    public boolean isUserDataInserted(Statement st,String name,String mobile,String email,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="insert into registration_info values ('"+name+"','"+mobile+"','"+email+"','"+username+"','"+password+"')";
            int x=st.executeUpdate(query);
            if(x>0)
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
