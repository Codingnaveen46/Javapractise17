package loopsAndJumpingStatement;

public class WhileLoop {
    //syntax to write while loop

    // while (condition){
    //code
//}
    public static void main(String[] args) {

        int ab = 99;
        boolean pageLoad = false;

        while (ab > 55){
            if (pageLoad || ab >100){
                break; // break is called jumping statement
            }
            System.out.println("it is great");
            ab++;

        }


    }
}
