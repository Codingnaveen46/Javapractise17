package keywordsLearning;

public  class Keywordclass2 extends  KeywordClass1{

    String name = "NAvenue3";

/*    public  void printName(String name){
        System.out.println(name);
        System.out.println(new KeywordClass1().name);
        System.out.println(new Keywordclass2().name);
        printempid();
        new KeywordClass1().printempid();
    }*/


    //super is  a keyword which refers parent class
    // this is a keyword which refers to current class

    public  void printName(String name){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        printempid();
         super.printempid();
    }

    public  void printempid(){
        System.out.println(12345);
    }


    public static void main(String[] args) {
        Keywordclass2 obj = new Keywordclass2();
        obj.printName("Mamatha");

        KeywordClass0 obj1 = new KeywordClass0();
        System.out.println(obj1.name);

    }


}
