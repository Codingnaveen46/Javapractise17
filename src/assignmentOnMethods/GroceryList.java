package assignmentOnMethods;


import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<String> items;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void viewList() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
