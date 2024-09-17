package typesOfVariables;

public class Variableclass1 {

    // types of variable
    //1 local variable == > local variable is temporary variable is created temporary inside the method.
    //2 Instance variable == > the variable created at class level which is accessed by any class by creating an object reference
    //3 Global variable ==> the variable crated at class level along with the static key word



    String name = "Priyanka";

    static String newname = "Naveen reddy";


    public static void main(String[] args) {

        String nameOfEmp = "Naveen ";  // local variable within the method.local variable not allowed to access outside.

        System.out.println(newname);
        System.out.println(nameOfEmp);
    }
}
