/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package secure_college_documents;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class FileByteReader
{


     public  String readContentIntoByteArray(File file)
   {
      FileInputStream fileInputStream = null;
      byte[] bFile = new byte[(int) file.length()];
      String text="";
      try
      {
         //convert file into array of bytes
         fileInputStream = new FileInputStream(file);
         fileInputStream.read(bFile);
         fileInputStream.close();
         
         for (int i = 0; i < bFile.length; i++)
         {
             text=text+(char) bFile[i];
            // System.out.print((char) bFile[i]);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return text;
   }
}
