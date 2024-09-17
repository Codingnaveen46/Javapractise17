package learningAboutOperators;

public class Operators {

    public static void main(String[] args) {

        //datatype variable = datavalue;
        // = special characters used in programming to perform specific operation

        //1 Arithmetic operators == > special characters used in arithmetic operation
        //2 Assignment operator == > to assign value to the variable
        //3 Comparison operator ==> to compare two values.
        //4 Logical operator ==> to build logics
        //5 Ternary operator ==>  ? used it as conditional operator

        // 1 Arithmetic operator = +,-,*,/,%.

            int a = 10;
            int b = 20;
    /*
        System.out.println(b%a);
        System.out.println(a++); //a++ post increment
        //execute the statement first and then increase the value by 1 (post execution)
        System.out.println(a);
        System.out.println(++a);
        System.out.println(++b); //++b ==> pre-increment increase the value by 1 first the execute the statement (before the execution)
        System.out.println(b++);
        System.out.println(a--);  // 10
        System.out.println(a);
      */

        // 1 Assignment operator = +,-,*,/,%.
        //special character used to assign the value to variable

        // =,+=,-=,*=,/=,%=
        /*
        int c = 20;

        c+= 10;

        System.out.println(c);

        c-=5;

        System.out.println(c);

        c-= 20;

        System.out.println(c);

        c%=5;

        System.out.println(c);

        */

        // 3 Conditional operator = special char used to compare the values

        // > , < , >=, <= , ==, !=

        int x = 10;
        int y = 20;

        System.out.println(x<=y);

        // 4 Logical operator
        //special character used to build the logics
        //and (&&) ampersent , or (||) , not (!);

        int creditScore = 751;

        boolean havepan = true;
        int minSala = 20000;

        System.out.println( (creditScore >= 750) && (havepan) && (minSala >= 20000));


        //5 ternary operator
        int i = 10;
        int j = 5;

        int maxValue = (i > j) ? i : j ;  //(10 > 5) ? 10 : 5 ; (true) ?10
        int minValue = (i < j) ? i : j;

        System.out.println(maxValue);
        System.out.println(minValue);








    }
}
