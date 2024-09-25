package exceptionHandling;

public class ExceptionHandling {

    //Exception ==> we can control // ExceptionHandling ==> Handling the exception ==>
    //3technique

    //1 throws declaration ==> when we know the exception details before itself
    //2 try-catch exception handling mechanism ==> when we are not sure about exception
    //3 threw a customized the exception ==> when there is no exception we will create one


    //Error ==> we cannot control

    //both are unexpected behaviour for program failure

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Naveen");
        Thread.sleep(2000);
        System.out.println("akhil");
        Thread.sleep(3000);
        System.out.println("mamatha");

        //throws declaration

        //Thread is a class
        //sleep is a method



    }
}
