package CollectionSample;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;


public class ArrayListSteamFilter {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();//will accept only integer.
       nameList.add("Abc");
        nameList.add("cat");
        nameList.add("college");
        nameList.add("school");
        nameList.add("syllabus");
        nameList.add("bat");
        nameList.add("apple");
        System.out.println(nameList);
        List<String> filterList = nameList.stream().filter((obj)->obj.startsWith("ab")).collect(Collectors.toList());
        System.out.println(filterList);



    }
}
