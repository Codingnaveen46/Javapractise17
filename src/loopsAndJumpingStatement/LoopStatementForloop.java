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

    }
}
