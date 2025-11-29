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

public class Filename_Fetcher 
{
    public ArrayList getFilename(Statement st)
    {
        ArrayList filename=new ArrayList();
        try
        {
            String query="select * from document_info";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                ArrayList in=new ArrayList();
                String did=rs.getString(1);
                String file_name=rs.getString(3);
                String hash=rs.getString(5);
                in.add(did);
                in.add(file_name);
                in.add(hash);
                filename.add(in);
            }
            System.out.println("file names are: "+filename);
            for (int i = 0; i < filename.size()-1; i++)
        {
           
            for (int j = i+1; j < filename.size(); j++) 
            {
                 ArrayList row1=(ArrayList)filename.get(i);
           
            String num1=(String)row1.get(0);
            int n=Integer.parseInt(num1);
                System.out.println("num1: "+num1);
                ArrayList row2=(ArrayList)filename.get(j);
                String num2=(String)row2.get(0);
                int m=Integer.parseInt(num2);
                System.out.println("num1: "+num1);
                if(n > m)
                {
                    filename.set(i, row2);
                    filename.set(j, row1);
                }  
            }
        }
             System.out.println(" After Sorting file names are: "+filename);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return filename;
    }
        
}
