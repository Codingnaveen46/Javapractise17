package learningCollectionsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsConcepts {
    //Challenges facing with arrays are
    //array is  fixed in length
    //Static memory allocation
    //it allows only similar data types.

    //TO overcome all the problems which is faced in arrays java came up with the collections framework

    // concepts of collections are

    //List
    // set
    //Map

    //these are the three concepts which are used in automation

    // List (ArrayList, LinkedList)
            // ==> list can store multiple values with the similar data type together
            // ==> list is not fixed in length , no need to specify the length
            // ==> list follows dynamic memory allocation
            // ==> list allows modification
            // ==> list will allows duplicate values.

    //Set  (hashset, linked hashset, tree set)
            //  set can store multiple values with the similar data type together;
            // set is not fixed in length , no need to specify the length.
            // set follows dynamic memory allocation.
            // set will not allow the modification.
            // set will not allow the duplicate values

    //Map   (HashMap, linked hashmap, and HashTable)
            // Map can store multiple values with different data type together in the form of key and value
            // map is not fixed in length,no need to specify the length
            // map follows the dynamic memory allocation
            //map allows modification
            // map will not allow the duplicate keys but duplicate values are allows.


    // syntax to create a collection

    // collection category <datatype> variable = new collection category<datatype> ;

    public static void main(String[] args) {

        System.out.println(" **************************ArrayList******************************");
        //syntax to create arrayList: List<String> variable = new ArrayList<String>();
        //syntax to add value : variable.add(value);
        //syntax to get total value : variable.size();
        //syntax to access the values : variable.get(Index);
        //syntax tp remove values : variable.remove(value);

        //ArrayList contiguous memory allocation

        List<String> empNameArrayList = new ArrayList<String>();
        empNameArrayList.add("Naveen");
        empNameArrayList.add("Naveen2");
        empNameArrayList.add("Naveen3");
        empNameArrayList.add("Naveen");
        empNameArrayList.add("Naveen");

        System.out.println(empNameArrayList);

        System.out.println(" **************************LinkedList******************************");
        //syntax to create LinkedList: List<String> variable = new LinkedList<String>();
        //syntax to add value : variable.add(value);
        //syntax to get total value : variable.size();
        //syntax to access the values : variable.get(Index);
        //syntax tp remove values : variable.remove(value);

        //performance is better in Linked list when there is no modification
        //LinkedList is more efficient which takes O(1) times


        List<String> empLinkedLIst = new LinkedList<String>();
        empLinkedLIst.add("Naveen");
        empLinkedLIst.add("Naveen2");
        empLinkedLIst.add("Naveen3");
        empLinkedLIst.add("Naveen");
        empLinkedLIst.add("Naveen");
        empLinkedLIst.add("Naveen4");
        empLinkedLIst.remove(3);
        empLinkedLIst.add("Naveen4");
        empLinkedLIst.remove(1);
        empLinkedLIst.add("Apple");


        System.out.println(empLinkedLIst);

















    }
}
