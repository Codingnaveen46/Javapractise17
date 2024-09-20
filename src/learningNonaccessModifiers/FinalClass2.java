package learningNonaccessModifiers;

public class FinalClass2 extends FinalClass1{
    public void printName(){
        System.out.println("naveen2");
    }

    public static void main(String[] args) {
        FinalClass2 obj = new FinalClass2();

        obj.printName();
        obj.changeName("fsdfsdf");
    }

}
