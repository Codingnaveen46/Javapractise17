package Assignment2Arrays;

public class EmpGroup {

    public static void main(String[] args) {

        Employees empDetails = new Employees();

        String[] EmployeeNames = new String[3];
        EmployeeNames[0] = empDetails.EmployeeName1;
        EmployeeNames[1] = empDetails.EmployeeName2;
        EmployeeNames[2] = empDetails.EmployeeName3;

        int[] EmployeeIds = new int[3];
        EmployeeIds[0] = empDetails.EmployeeID1;
        EmployeeIds[1] = empDetails.EmployeeID2;
        EmployeeIds[2] = empDetails.EmployeeID3;


        System.out.println("Employee Name:" + " " + empDetails.EmployeeName1 + "," + "Employee ID:" + empDetails.EmployeeID1);
        System.out.println("Employee Name:" + " " + empDetails.EmployeeName2 + "," + "Employee ID:" + empDetails.EmployeeID2);
        System.out.println("Employee Name:" + " " + empDetails.EmployeeName3 + "," + "Employee ID:" + empDetails.EmployeeID3);








    }
}
