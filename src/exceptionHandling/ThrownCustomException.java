package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class ThrownCustomException {
    public static void main(String[] args) throws Exception {

        int age = 15;

        if (age < 18 ){
           // System.out.println("not eligible to vote");
            throw new Exception("not eligible to vote");
        }else{
            System.out.println("can vote");
        }
        //more over we should not encourage the default exceptions like arrayoutofboundindex
        //directly we should not use the throw exception in java instead we can use the Assertions

       /* List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.set(1, "C");
        list.add("D");
        System.out.println(list);


        try {
            int a = 10 / 0;
            System.out.println("This will not be printed");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }

        int a = 5;
        int b = 10;
        if ((a = 3) == b) {
            System.out.println(a);
        } else {
            System.out.println(a + b);
        }

        int A = 0;
        System.out.println(A++ == ++A);


        String s1 = new String("xyz");
        String s2 = "xyz";
        System.out.println(s1.intern() == s2);
*/
    }

}
