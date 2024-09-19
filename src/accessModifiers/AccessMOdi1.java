package accessModifiers;

public class AccessMOdi1 {


    public  String name = "Naveen"  ;

    public  void printEmp(){
        System.out.println(1234);
    }



    /*
    protected   String name = "Naveen"  ;

    protected   void printEmp(){
        System.out.println(1234);
    }

     */

    /*
               String name = "Naveen"  ;

    void printEmp(){
        System.out.println(1234);
    }


     */

  /*
    private    String name = "Naveen"  ;

    private    void printEmp(){
        System.out.println(1234);
    }

    //private only works within the class
   */



    public static void main(String[] args) {

        AccessMOdi1 obj = new AccessMOdi1() ;

        obj.printEmp();
        System.out.println(obj.name);
    }
}
