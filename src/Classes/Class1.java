package Classes;

public class Class1 {

     //class is a template / data type that can store methods class,objects.
    //Object is new instance of class

    //syntax of object is  using new class1() keyword

    String myName = "John";
    int myAge = 20;

    public static void main(String[] args) {
        // in the same class also we can use the class by creating an object.

        Class1 Obj = new Class1();
        Obj.myName = "John2";
        Obj.myAge = 20;
        System.out.println(Obj.myName);

    }
}
