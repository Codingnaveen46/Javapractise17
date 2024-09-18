package conditionalStatements;

public class ConditionalStatements {

    //if else statement

    /*
    if(Condition)   {
    }else if(condition){
    }else if(condition){
    }else{
        statement
       }

       //switch statement

            switch (expression){

            case 1:
            code
            break;
            case 2:
            code
            break;
            case 3:
            code
            break;
            default:
            default code
     */

    public static void main(String[] args) {

        //conditional statements : conditions along with statements
        //1 if else ==> when we don't know the result of the condition
        //2 if-else-if statement
        //nested if -else
        //3 switch statement  ==> when we want to choose one option among multiple
        /*
            double percentage = 90;
            if (percentage >= 70){
                System.out.println("first class");
            } else if (percentage < 70 && percentage >= 40) {
                System.out.println("second class");
            } else if (percentage <50 && percentage >= 40) {
                System.out.println("third class");
            }else {
                System.out.println("fail");
            }
            */

        //switch-case
        String day = "fddddgdfg";

        switch (day){
            case "monday":
                System.out.println("today is weekday");
                break;
            case "tuesday":
                System.out.println("today is weekday");
                break;
            case "wednesday":
                System.out.println("today is wednesday");
                break;
            case "thrusday":
                System.out.println("today is thrusday");
                break;
            case "friday":
                System.out.println("today is friday");
                break;
            case "saturday":
                System.out.println("today is saturday");
                break;
            default:
                System.out.println("wrong day");
        }



        switch (day){
            case "monday":


            case "tuesday":


            case "wednesday":


            case "thrusday":

            case "friday":
                System.out.println("today is friday");
                break;
            case "saturday":
                System.out.println("today is saturday");
                break;
            case "sunday":

            default:
                System.out.println("wrong day");
        }

    }
}
