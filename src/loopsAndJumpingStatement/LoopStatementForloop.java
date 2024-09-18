package loopsAndJumpingStatement;

public class LoopStatementForloop {

    //loops are

    // for loop ==> when we know total number of iterations to be executed before itself
    //while loop ==> when we dont know the number of iterations to be executed before itself
    //do-while-loop ==>
    //enhanced for loop (for-each-loop)

    // syntax for for loop
    /*
    for (condition1 ; condition2 ; condition 3){
        //condition1 ==> where to start,
        //condition2==> where to stop,
        //condition3 ==> interval
        code repeat
    }

     */

    public static void main(String[] args) {

        String name = "knavish";

        for (int i = 1; i < 10 ; i++){
            System.out.println(i + " " + name);
        }


        //for each loop

        String [] empNames = new String[6];
        empNames[0] = "Naveen";
        empNames[1] = "Ashwani";
        empNames[2] = "Mamatha";
        empNames[3] = "Akhil";
        empNames[4] = "Rahul";
        empNames[5] = "Raj";


        // syntax for foreach loop

        // (datatype variable: list){
        //code }
/*
        for (String empName : empNames) {
            System.out.println(empName);
        }

        for (int i = 0; i<empNames.length ; i++){
            System.out.println(empNames[i]);
        }
*/

        //do while loop

        //do while condition ids written at the end
 /*       int i = 1;
        do {
            System.out.println("Naveen");
            i++;
        }while(i >2 );

*/

        //jumping statements

        // 3jumping statements
        //1 break  ==> break the loop
        // 2 continue ==> skip current iteration only
        // return

        for (int i =1; i <= 10 ; i++){
            if (i % 2 == 1){
               // break;
                continue;
            }
            System.out.println(i);
        }


    }
}
