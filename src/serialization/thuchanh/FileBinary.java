package serialization.thuchanh;


import java.io.*;
import java.nio.file.StandardCopyOption;

public abstract class FileBinary {
   private static void copyFileUsingJava7File(File source, File dest)
           throws IOException{
       File.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);


   }
    private static void copyFileUsingStream(File source, File dest)
        throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(source);
            byte[] buffer = new byte[1024];
            int length;
            while((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);
            }
        } finally {
            is.close();
            os.close();
        }
    }


}
