public class ArrayDeclarationSample {
    //collections.
    public static void main(String[] args) {
        // name = [];
        int[] name = {45,4589,32,984};//declare the array in java
        float[] price = {45.56f,4556.58f,78787.58f};

        String[] nameList = {"asdf","asdf","asd","asdfasdf"};

        int[] age= new int[10];//stores upto 10 size.
        age [0] = 47;//store the data in 0th position.
        age [1] = 4;//store the data in 1st position.
       // age[12] = 5;will throw the eror as it is declared with ony 10.
        //array iteration.
        for(int tmpName:name){
            System.out.println(tmpName);
        }
        for(String tmp :nameList){
            System.out.println(tmp);
        }

    }
}
