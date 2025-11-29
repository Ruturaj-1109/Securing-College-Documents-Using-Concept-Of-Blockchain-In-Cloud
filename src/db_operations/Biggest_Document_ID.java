/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_operations;

import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class Biggest_Document_ID 
{
    public String getBigDocid()

    {
        int bigsi=0;
        ArrayList doc_id=new SerialNumberFetcher().getSid();
        
        String big=(String)doc_id.get(0);
            int bg=Integer.parseInt(big);
            for (int i = 0; i < doc_id.size(); i++) 
            {
                String fi=(String)doc_id.get(i);
                int f=Integer.parseInt(fi);
                
                if(f>bg)
                {
                    bg=f;
                }
              
            }
             bigsi=bg;
             String big_doc=Integer.toString(bigsi);
             System.out.println("Biggest File Id: "+big_doc);
             return big_doc;
    }
}
