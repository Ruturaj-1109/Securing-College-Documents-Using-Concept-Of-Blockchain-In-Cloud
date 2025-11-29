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
public class Document_Info_Inserter 
{
    public boolean isDocument_Info_inserted(Statement st,String docid,String username,String filename,String datetime,String hashkey)
    {
        boolean flag=false;
        try
        {
            String query="insert into document_info values ('"+docid+"','"+username+"','"+filename+"','"+datetime+"','"+hashkey+"')";
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
