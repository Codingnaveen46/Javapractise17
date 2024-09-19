package learningConstructor;

public class Constructor1 {

    int empId;
    Constructor1(int id){
        empId =id;
    }
    public static void main(String[] args) {
    //constructor method is default method created by java to initialize the object

        //in constructor two types
        //1default by java
        //2 parametrized constructor

    }

    void printEmployeesRole( String empRole){
        System.out.println("emp id" + empId );
        System.out.println("emp role"+ empRole);

    }

    void printEmployeesaddress( String empAddress,String empEmail){
        System.out.println("emp id" + empId );
        System.out.println("emp role"+ empAddress);
        System.out.println("emp email" + empEmail);

    }

    void printEmployeesdetails( String empName){
        System.out.println("emp id" + empId );
        System.out.println("emp role"+ empName);

    }
}
