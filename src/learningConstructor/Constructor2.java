package learningConstructor;

public class Constructor2 {

    public static void main(String[] args) {

        Constructor1 obj = new Constructor1(1234);
     //   Constructor1 OBJ2 = new Constructor1(1234);

        obj.printEmployeesdetails("naveen");
        obj.printEmployeesaddress("chennai","jjdf@");
        obj.printEmployeesRole("sdet");

        obj.printEmployeesdetails("naveen2");
        obj.printEmployeesaddress("chennaid","jjdf@");
        obj.printEmployeesRole("sdet3");


    }
}
