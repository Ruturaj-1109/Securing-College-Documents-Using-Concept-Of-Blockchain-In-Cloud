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
public class Edit_Profile 
{
     public boolean isUserDataUpdated(Statement st,String name,String mobile,String email,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="update registration_info set name='"+name+"', mobile_number='"+mobile+"', email_id='"+email+"', password='"+password+"' where user_name='"+username+"'";
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
