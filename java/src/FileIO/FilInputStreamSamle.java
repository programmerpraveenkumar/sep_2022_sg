package FileIO;

import java.io.FileInputStream;

public class FilInputStreamSamle {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("/Volumes/softwares/projects/sample.txt");
            int read ;
            //-1 refers to last character of the file in java.
            while((read = fin.read()) != -1){
                System.out.println(read+" "+(char)read);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
