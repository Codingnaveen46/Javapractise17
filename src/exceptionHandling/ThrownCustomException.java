package exceptionHandling;

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

    }
}
