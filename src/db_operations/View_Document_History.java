/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;

import java.sql.ResultSet;
import java.sql.Statement;
import secure_college_documents.View_Uploaded_History_Frame;

/**
 *
 * @author welcome
 */
public class View_Document_History
{
    public void getViewDocumentHistory(String username)
    {
        try
        {
             Statement st1= new DBDriver().createConnection();
             Statement st2= new DBDriver().createConnection();
             
             String query="select * from document_info where user_name='"+username+"'";
             
             ResultSet rs1=st1.executeQuery(query);
             ResultSet rs2=st2.executeQuery(query);
             
             int row=0;
             while(rs1.next())
             {
                 row++;
             }
             
             int i=0;
             String data[][]=new String[row][5];
             while(rs2.next())
             {
                 String docid=rs2.getString(1);
                 data[i][0]=docid;
                 username=rs2.getString(2);
                 data[i][1]=username;
                 String filename=rs2.getString(3);
                 data[i][2]=filename;
                 String date_time=rs2.getString(4);
                 data[i][3]=date_time;
                 String hashkey=rs2.getString(5);
                 data[i][4]=hashkey;
                 i++;
             }
             View_Uploaded_History_Frame.data1=data;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
    }
}
