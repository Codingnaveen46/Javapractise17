package LearningArrays;

import java.util.Arrays;

public class ArrayInJava {
    //Array is a non-primitive data type
    //Array can store multiple values with the same data type together at one place
    //Array is fixed in length.
    //Array cannot be modified
    //array won't allow modification;

    public static void main(String[] args) {

        // naveen is going to start a new startup company

      /*
        String emp1Name = "Naveen";
        int emp1Age = 20;
        int emp1Id  = 1;

        String emp2Name = "Ashwani";
        int emp2Age = 20;
        int emp2Id  = 2;

        String emp3Name = "Mamatha";
        int emp3Age = 20;
        int emp3Id  = 3;

        String emp4Name = "Akhil";
        int emp4Age = 20;
        int emp4Id  = 4;

        String emp5Name = "Rahul";
        int emp5Age = 20;
        int emp5Id  = 5;

        String emp6Name = "Raj";
        int emp6Age = 20;
        int emp6Id  = 6;

*/

        /*
        syntax for creating new arrays
        DataType []  variable = new datatype [length];
        //syntax to store value in arrays : variable [index] = value ;
        //syntax to get the value from array : variable [index];
        //syntax to get the count of the total values from the array : variable.length
        //syntax to store the fixed values : datatypes[] variable = {value1,value2};

        1D Array meaning 1dimentionla array
        till 2d array we are going to use in automation;

        array is a data type which can store multiple values with the same data type is called array.


        */

        // 1 Dimensional array

        String [] empNames = new String[6];
        empNames[0] = "Naveen";
        empNames[1] = "Ashwani";
        empNames[2] = "Mamatha";
        empNames[3] = "Akhil";
        empNames[4] = "Rahul";
        empNames[5] = "Raj";


        // 2 Dimensional array

        String [] group1 = {"naveen","ashwani"};
        String [] group2 = {"akhil","rahul"};
        String [] group3 = {"mamatha","raj"};
        String [] group4 = {"nav","ash"};

        String [][]  empgroup = new String[4][2];
        empgroup[0][0] = "naveen";
        empgroup[0][1] = "ashwani";
        empgroup[1][0] = "akhil";
        empgroup[1][1] = "rahul";
        empgroup[2][0] = "mamatha";
        empgroup[2][1] = "raj";
        empgroup[3][0] = "nav";
        empgroup[3][1] = "ash";

       // System.out.println(empgroup.length);

        //3D Arrays ==> multiple of 2d arrays is called 3d arrays
        //it is rarely used.

        // ArrayIndexOfBoundsExceptions will come when we are trying to store value with the invalid index.


        String [][][]  empdetails = new String[1][2][2];
        empdetails[0][0][0] = "naveen";
        empdetails[0][0][1] = "ashwani";
        empdetails[0][1][0] = "akhil";
        empdetails[0][1][1] = "rahul";

        System.out.println(empdetails.length);















    }
}
