package learningNonaccessModifiers;

public class Synchronized1 {

    String name = "Naveen";

    public  synchronized void printName(){

        System.out.println(name);

        //synchronized is a systematic manner which allows one after the other
        //exectuion is parrel


    }
}
