package learningNonaccessModifiers;

public interface  InterFaceClass {

    //Interface is 100% abstract class
    // no need to add abstract keyword before abstract method
    //we cannot create a object for interface
    // we cannot extent interface in normal classes
    // insted of extending we can implement unimplement methods of interface in

    default void loginapplication() {

    }

    static void printan(){
        System.out.println("Naveen");
    }


}
