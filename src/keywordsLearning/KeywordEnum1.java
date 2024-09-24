package keywordsLearning;

enum Priority {
    HIGH,MEDIUM,LOW
}

//enum is used to store all the values in the same place

public class KeywordEnum1 {

    enum Severity {
        MINOR   ,MAJOR,CRITICAL
    }

    public static void main(String[] args) {

        System.out.println(Priority.HIGH);

    }
}
