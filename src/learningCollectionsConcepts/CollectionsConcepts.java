package learningCollectionsConcepts;

import java.util.*;

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
        empLinkedLIst.add("Apple");


        System.out.println(empLinkedLIst);


        System.out.println(" **************************Set******************************");

        //HashSet to create Hashset: Set<String> variable = new Hashset<String>();
        //syntax to add value : variable .add(value);
        //syntax to get total values : variable.size();
        //syntax to remove value : variable .remove(value );

        System.out.println(" **************************HashSet******************************");
        //order : Random order
        //NUll values : ALLOWED

        Set<String> EMPNAMESET = new HashSet<String>();
        EMPNAMESET.add("Naveen");
        EMPNAMESET.add("Naveen2");
        EMPNAMESET.add("Naveen3");
        EMPNAMESET.add("Naveen");
        EMPNAMESET.add("Naveen");
        EMPNAMESET.add("Naveen4");
        EMPNAMESET.add("Apple");
        EMPNAMESET.add(null);



        System.out.println(EMPNAMESET);


        System.out.println(" **************************LinkedHashSet******************************");
        //order : Random order
        //NUll values : ALLOWED

        Set<String> EMPNAMELinkedHashset = new HashSet<String>();
        EMPNAMELinkedHashset.add("Naveen");
        EMPNAMELinkedHashset.add("NEW NAVEEN");
        EMPNAMELinkedHashset.add("NAVEEN2");
        EMPNAMELinkedHashset.add("TIHIS IS THE INSERTION");


        List<String> EMPDETAILS = new ArrayList<>(EMPNAMELinkedHashset);
        //converting anyconcept to arraylist

        System.out.println(EMPDETAILS.get(2));



        System.out.println(EMPNAMELinkedHashset);



        System.out.println(" **************************TreeSet******************************");
        //order : Ascending order
        //NUll values :  not ALLOWED

        Set<Integer> EMPNAMETREESET = new TreeSet<>();
        // EMPNAMETREESET.add("Naveen");
        //   EMPNAMETREESET.add("NEW NAVEEN");
        //  EMPNAMETREESET.add("NAVEEN2");
        // EMPNAMETREESET.add("TIHIS IS THE INSERTION");
        //  EMPNAMETREESET.add(null); treeset is not going to allow the null values.
        //EMPNAMETREESET.add(34);
        //    EMPNAMETREESET.add(32);
        // EMPNAMETREESET.add(24);
        //EMPNAMETREESET.add(12);


        System.out.println(EMPNAMETREESET);

        //In collections primitive data types are not allowed,we came up with concept called "wrapper classes";

        //byte ==> Byte
        //short ==> Short
        //int ==> Integer
        //long ==> Long
        //double ==> Double
        //boolean ==> Boolean
        //char ==> Character


        System.out.println(" **************************HashMap******************************");

        //synatax to create Hashmap: Map<Data type, data type> variable new HashMap<datatype,data type> ();
        //synatx to add values : variable.put(key,value);
        //synatx to get total value : variable.size();
        //synatax to remove the value : variable.remove();
        //null keys are allowed
        //null values are allowed



        Map<String,Integer> empdeHashmap = new HashMap<>();

        empdeHashmap.put("Naveen",1234);
        empdeHashmap.put("mamatha",34556);
        empdeHashmap.put("sadam",3453);
        empdeHashmap.remove("sadam");

        System.out.println(empdeHashmap.get("Naveen"));
        System.out.println(empdeHashmap);


        System.out.println(" **************************LinkedHashMap******************************");


        Map<String,Integer> empdelinkedhashmap = new LinkedHashMap<>();

        empdelinkedhashmap.put("Naveen",1234);
        empdelinkedhashmap.put("mamatha",34556);
        empdelinkedhashmap.put("sadam",3453);
        empdelinkedhashmap.remove("sadam");

        
        System.out.println(empdelinkedhashmap);


        System.out.println(" **************************LinkedHashMap******************************");


        Map<String,Integer> empdeTReemap = new TreeMap<>();

        empdeTReemap.put("Naveen",1234);
        empdeTReemap.put("mamatha",34556);
        empdeTReemap.put("sadam",3453);
        empdeTReemap.remove("sadam");
        empdeTReemap.put("null",234);
        //empdeTReemap.put(null,223);


        System.out.println(empdeTReemap);



        System.out.println(" *************************HashTable******************************");


        Map<String,Integer> empdehashtable = new TreeMap<>();

        empdehashtable.put("Naveen",1234);
        empdehashtable.put("mamatha",34556);
        empdehashtable.put("sadam",3453);
        empdehashtable.remove("sadam");
      //  empdehashtable.put("null",null);
       // empdehashtable.put(null,223);


        System.out.println(empdehashtable);















    }
}
