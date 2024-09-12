package Assignment2Arrays;

public class ArraysAssignment {

    public static void main(String[] args) {

        /*
        1. Create a 1D array of integers with a length of 5. Populate the array with values of
your choice and print each element of the array to the console. For the 1D array of
integers, you could use: {4, 7, 2, 9, 5}.
         */

        int [] numbers1 = new int[5];
        numbers1[0]  = 4;
        numbers1[1]  = 7;
        numbers1[2]  = 2;
        numbers1[3]  = 9;
        numbers1[4]  = 5;

        System.out.println(numbers1[0]);
        System.out.println(numbers1[1]);
        System.out.println(numbers1[2]);
        System.out.println(numbers1[3]);
        System.out.println(numbers1[4]);




        /*
        2. Create a 1D array of strings with a length of 3. Populate the array with your favorite
colors and print each element of the array to the console.For the 1D array of
strings, you could use: {"red", "green", "blue"}.
         */


    String [] colours = new String[3];
    colours[0]  = "Red";
    colours[1]  = "green";
    colours[2]  = "blue";

        System.out.println(colours[0]);
        System.out.println(colours[1]);
        System.out.println(colours[2]);


     /*
    3. Create a 2D array of integers with a size of 3x3. Populate the array with values of
your choice and print each element of the array to the console.For the 2D array of
integers, you could use: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}.
     */

        int[][] populateNUm = new int[3][3];

        populateNUm[0][0] = 1;
        populateNUm[0][1] = 2;
        populateNUm[0][2] = 3;

        populateNUm[1][0] = 4;
        populateNUm[1][1] = 5;
        populateNUm[1][2] = 6;

        populateNUm[2][0] = 7;
        populateNUm[2][1] = 8;
        populateNUm[2][2] = 9;

        System.out.println(populateNUm[0][0]);
        System.out.println( populateNUm[0][1]);
        System.out.println(populateNUm[0][2]);

        System.out.println(populateNUm[1][0]);
        System.out.println( populateNUm[1][1]);
        System.out.println(populateNUm[1][2]);

        System.out.println(populateNUm[2][0]);
        System.out.println( populateNUm[2][1]);
        System.out.println(populateNUm[2][2]);


        /*

        4. Create a 2D array of strings with a size of 2x2. Populate the array with your favorite
foods and print each element of the array to the console.For the 2D array of strings,
you could use: {{"pizza", "pasta"}, {"burger", "fries"}}.
         */


        String [][] foods = new String[2][2];
            foods[0][0] = "Pizza";
            foods[0][1] = "Pasta";
            foods[1][0] = "burger";
            foods[1][1] = "fries";

        System.out.print(foods[0][0]);
        System.out.print(foods[0][1]);

        System.out.println(foods[1][0]);
        System.out.println(foods[1][1]);



    }










}
