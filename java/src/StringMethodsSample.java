import java.util.Arrays;

public class StringMethodsSample {
    public static void main(String[] args) {
        String name = "first_name last_name";//immutable
        name = "udpate new name";//11
        System.out.println(name.length());
        System.out.println(name.startsWith("z"));
        String splName[] = name.split(" ");
       for(String tmp :splName){
           System.out.println(tmp);
       }

       StringBuilder build = new StringBuilder();
       build.append("appending new value");
       System.out.println(build);

        StringBuffer buf = new StringBuffer("starting string");//can be used in thread.
        buf.append("new data");
        System.out.println(buf);

    }
}
