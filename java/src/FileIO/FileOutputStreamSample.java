package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        try{
            String path = "/Volumes/softwares/projects/sample1.txt";
           FileOutputStream fout =  new FileOutputStream(path,true);
           String message = "\nanother\t new contnet ";
           fout.write(message.getBytes());

            FileInputStream fin = new FileInputStream(path);
            int read ;
            //-1 refers to last character of the file in java.
            while((read = fin.read()) != -1){
                System.out.println(read+" "+(char)read);
            }
           ;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
