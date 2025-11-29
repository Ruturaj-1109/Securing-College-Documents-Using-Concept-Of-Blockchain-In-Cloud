/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsfileoperation;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import db_operations.Datakeeper;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import secure_college_documents.Upload_Document_Frame;



/**
 *
 * @author lenovo
 */
public class FileDownload
{
     public boolean awsFileDownload(AWSCredentials credentials, String bucketname, String filename) throws IOException
    {
        boolean flag=false;
        try
        {
         AmazonS3 s3Client = AmazonS3Client.builder().withRegion(Regions.AP_SOUTH_1)
                .withCredentials(new AWSStaticCredentialsProvider(credentials)).build();

        

            S3Object object = s3Client.getObject(new GetObjectRequest(bucketname, filename));
            S3ObjectInputStream objectContent = object.getObjectContent();
             IOUtils.copy(objectContent, new FileOutputStream(Datakeeper.path+"//" + filename));

            objectContent.close();
            flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return flag;
    }
}
