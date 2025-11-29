/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsfileoperation;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;



/**
 *
 * @author lenovo
 */
public class FileUpload 
{
     public boolean awsFileUpload(AWSCredentials credentials, String bucketname, String filepath)
    {
        boolean flag=false;
      try
      {
        AmazonS3 s3client = new AmazonS3Client(credentials);
        
        
        
           
            File file = new File(filepath);
            String filename=file.getName();
            s3client.putObject(new PutObjectRequest(bucketname, filename, file));
            System.out.println("file uploaded sucessfully to " + bucketname);
            flag=true;
      }
        catch(Exception ex)
        {
            System.out.println("Ecxption is: "+ex);
        }
    
    return flag;
    }
}
