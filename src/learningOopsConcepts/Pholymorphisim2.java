package learningOopsConcepts;

public class Pholymorphisim2 extends  Polymorphisim1{

    //having multiple methods with the same name with in the same class but differnt parameters and arguments


    public  void sumofNumber(int a,int b){
        System.out.println(a+b);

    }

    public void sumofNumber(int c, int d,int e) {
        System.out.println(c+d+e);
    }

    public static void main(String[] args) {
        Pholymorphisim2 obj = new Pholymorphisim2();
        obj.sumofNumber(25,36);
    }
}
