package methodsLearning;

public class MethodsClass {

    //method / functions  is nothing but a block of code or collection of statements having common purpose
    // initialization of method inside another is not allowed

    public static void main(String[] args) {

    }

    void launchbroweser(){

        System.out.println("this is method");

    }

    void launchapplication(){

        System.out.println("enter user name");
    }

    int getbalance(){
        System.out.println("balance");
        return getbalance();
    }
}

