package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        try{
            String path = "/Volumes/softwares/projects/sample1.txt";
          // FileOutputStream fout =  new FileOutputStream(path,true);
            FileOutputStream fout =  new FileOutputStream(path);
           //String message = "\nanother\t new contnet ";
            String message = "hi file was written on oct10 ";
           fout.write(message.getBytes());//convert the string to bytes.
//
//            FileInputStream fin = new FileInputStream(path);
//            int read ;
//            //-1 refers to last character of the file in java.
//            while((read = fin.read()) != -1){
//                System.out.println(read+" "+(char)read);
//            }
           ;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
