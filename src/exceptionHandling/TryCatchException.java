package exceptionHandling;

public class TryCatchException {

    public static void main(String[] args) {

        String [] empNames = new String[4]  ;
        try {
            empNames[0] = "Naveen"  ;
            empNames[1] = "ashwani";
            empNames[2] = "Mamatha";
            empNames[3] = "bharath";
            empNames[4] = "bharath2";

        }catch (Exception e){
            System.out.println("Unable to save values");
            empNames[0] = "Naveen"  ;
            empNames[1] = "ashwani";
            empNames[2] = "Mamatha";
            empNames[3] = "bharath";
        } finally {
            System.out.println(empNames[1]);
            System.out.println("Execution completed");

        }
            // for popups we can use try catch block
    }
}
