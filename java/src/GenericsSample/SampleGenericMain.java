package GenericsSample;

public class SampleGenericMain {
    public static void main(String[] args) {
        SampleGeneric<String> obj1 =  new SampleGeneric<>("stsring");
        obj1.printVal("test string ");
        obj1.age = 45;

        SampleGeneric<Integer> obj2 =  new SampleGeneric<>(5);
        obj2.printVal(10);

        SampleGeneric<Double> obj3 =  new SampleGeneric<>();
        obj3.printVal(45.25);

    }
}

class SampleGeneric<T>{
    SampleGeneric(T val){
        this.val = val;
    }
    SampleGeneric(){

    }

   T val;
   int age;
   public void printVal(T val){
        this.val = val;
       System.out.println(this.val);
   }
}


