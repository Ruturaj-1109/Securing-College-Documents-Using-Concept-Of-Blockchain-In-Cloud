/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure_college_documents;

import db_operations.SerialNumberFetcher;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Serial_Number 
{
    public int GetSId()
    {
        int sid=0;
        ArrayList serial_num=new SerialNumberFetcher().getSid();
        
        if (serial_num.isEmpty())
        {
            sid=0;
        }
        else
        {
            String big=(String)serial_num.get(0);
            int bg=Integer.parseInt(big);
            for (int i = 0; i < serial_num.size(); i++) 
            {
                String fi=(String)serial_num.get(i);
                int f=Integer.parseInt(fi);
                
                if(f>bg)
                {
                    bg=f;
                }
             sid=bg;
            }
              
        }
        System.out.println("File Id is: "+sid);
        return sid;
    }
}
