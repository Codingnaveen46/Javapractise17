package collectionsAssignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionsAssignment {

    public static void main(String[] args) {

        Map<String, String> Student1 = new LinkedHashMap<String, String>();
        Map<String, String> Student2 = new LinkedHashMap<String, String>();
        Map<String, String> Student3 = new LinkedHashMap<String, String>();

        // storing all the data of student1
        Student1.put("Name", "John Doe");
        Student1.put("Age", "20");
        Student1.put("Gender", "Male");
        Student1.put("Grade", "A");
        Student1.put("Major", "Computer Science");
        Student1.put("GPA", "3.8F");
        Student1.put("Email", "john@example.com");
        Student1.put("Contact Number", "9876543210");
        Student1.put("Address", "123 Elm St");

        Student2.put("Name", "Jane Smith");
        Student2.put("Age", "21");
        Student2.put("Gender", "Female");
        Student2.put("Grade", "B");
        Student2.put("Major", "Mathematics");
        Student2.put("GPA", "3.5F");
        Student2.put("Email", "Jane@example.com");
        Student2.put("Contact Number", "9876543211");
        Student2.put("Address", "456 Oak St");

        Student3.put("Name", "Mike Brown");
        Student3.put("Age", "22");
        Student3.put("Gender", "Male");
        Student3.put("Grade", "A");
        Student3.put("Major", "Physics");
        Student3.put("GPA", "3.9F");
        Student3.put("Email", "Mike@example.com");
        Student3.put("Contact Number", "9876543212");
        Student3.put("Address", "456 Oak St");

        List<Map<String, String>> studentList = new ArrayList<>();
        studentList.add(Student1);
        studentList.add(Student2);
        studentList.add(Student3);

        Map<String, String> Employee1 = new LinkedHashMap<String, String>();
        Map<String, String> Employee2 = new LinkedHashMap<String, String>();
        Map<String, String> Employee3 = new LinkedHashMap<String, String>();

        Employee1.put("Employee ID", "E001");
        Employee1.put("Name", "Alice Green");
        Employee1.put("Age", "30");
        Employee1.put("Gender", "Female");
        Employee1.put("Department", "Engineering");
        Employee1.put("Position", "Software Engineer");
        Employee1.put("Salary", "75,000");
        Employee1.put("Email", "alice@example.com");
        Employee1.put("Contact Number", "9876543213");

        Employee2.put("Employee ID", "E002");
        Employee2.put("Name", "Bob Johnson");
        Employee2.put("Age", "35");
        Employee2.put("Gender", "Male");
        Employee2.put("Department", "Marketing");
        Employee2.put("Position", "Marketing Manager");
        Employee2.put("Salary", "85,000");
        Employee2.put("Email", "bob@example.com");
        Employee2.put("Contact Number", "9876543214");

        Employee3.put("Employee ID", "E003");
        Employee3.put("Name", "Carol White");
        Employee3.put("Age", "28");
        Employee3.put("Gender", "Female");
        Employee3.put("Department", "Sales");
        Employee3.put("Position", "Sales Executive");
        Employee3.put("Salary", "65,000");
        Employee3.put("Email", "carol@example.com");
        Employee3.put("Contact Number", "9876543215");

        List<Map<String, String>> employeeList = new ArrayList<>();
        employeeList.add(Employee1);
        employeeList.add(Employee2);
        employeeList.add(Employee3);

        Map<String, String> Product1 = new LinkedHashMap<String, String>();
        Map<String, String> Product2 = new LinkedHashMap<String, String>();
        Map<String, String> Product3 = new LinkedHashMap<String, String>();

        Product1.put("Product ID", "P001");
        Product1.put("Name", "Laptop");
        Product1.put("Category", "Electronics");
        Product1.put("Price", "$1,200");
        Product1.put("Stock Quantity", "50");
        Product1.put("Supplier", "Tech Supplies");
        Product1.put("Warranty", "2 years");
        Product1.put("Rating", "4.5");
        Product1.put("Manufacturing Date", "15/1/2023");
        Product1.put("Expiry Date", "15/1/2025");

        Product2.put("Product ID", "P002");
        Product2.put("Name", "Desk Chair");
        Product2.put("Category", "Furniture");
        Product2.put("Price", "$150");
        Product2.put("Stock Quantity", "200");
        Product2.put("Supplier", "Office Depot");
        Product2.put("Warranty", "1 year");
        Product2.put("Rating", "4");
        Product2.put("Manufacturing Date", "10/2/2023");
        Product2.put("Expiry Date", "N/A");

        Product3.put("Product ID", "P003");
        Product3.put("Name", "Coffee Maker");
        Product3.put("Category", "Kitchen");
        Product3.put("Price", "$75");
        Product3.put("Stock Quantity", "100");
        Product3.put("Supplier", "KitchenWorld");
        Product3.put("Warranty", "6 months");
        Product3.put("Rating", "4.2");
        Product3.put("Manufacturing Date", "20/3/2023");
        Product3.put("Expiry Date", "20/3/2024");

        List<Map<String, String>> productList = new ArrayList<>();
        productList.add(Product1);
        productList.add(Product2);
        productList.add(Product3);

        // Using List of Lists to store all data
        List<List<Map<String, String>>> Total = new ArrayList<>();
        Total.add(studentList);
        Total.add(employeeList);
        Total.add(productList);

        // Accessing the supplier of Product2 (Desk Chair)
        String supplier = Total.get(2).get(1).get("Supplier");
        System.out.println("Supplier of Product2: " + supplier);
    }
}
