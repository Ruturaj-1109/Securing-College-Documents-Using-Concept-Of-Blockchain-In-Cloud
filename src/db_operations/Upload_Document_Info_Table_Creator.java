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
public class Upload_Document_Info_Table_Creator 
{
     public boolean create_Upload_Document_Table_Creator(Statement st)
    {
        boolean flag=false;
        try
        {
            int x=0;
            int count=0;
            
            String query="create table IF NOT EXISTS document_info"+"(doc_id VARCHAR(45), "
                   + " user_name VARCHAR(45), "
                    + " file_name  VARCHAR(45), " 
                    + " date_time VARCHAR(45), " 
                    + " hashkey VARCHAR(45), "
                    + " PRIMARY KEY (doc_id)) ";
            
            x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
             
                    
                 
        }
          catch(Exception e)
        {
            System.out.println("Exception in AWSTableCreator Class is: "+e);
            flag=false;
        }
        
        return flag;
    }
}
