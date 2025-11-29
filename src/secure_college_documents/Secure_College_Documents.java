/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure_college_documents;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author welcome
 */
public class Secure_College_Documents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Login_Frame lf=new Login_Frame();
       Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
       lf.setVisible(true);
       lf.setSize(d);
    }
    
}
