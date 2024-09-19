package assignmentOnMethods;

public class GroceryTest {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addItem("Milk");
        groceryList.addItem("Eggs");
        groceryList.addItem("Bread");

        groceryList.viewList();

        groceryList.removeItem("Eggs");

        groceryList.viewList();
    }
}