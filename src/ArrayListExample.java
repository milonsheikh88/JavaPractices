import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // add elements in the arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList: " + animals);

        // get the element from the arraylist
        String str = animals.get(0);
        animals.add(0, "MMMM");
        System.out.print("Element at index 0: " + str);
        System.out.println("Modified ArrayList: " + animals);
        animals.set(0, "DDDDD");
        System.out.println("After set  ArrayList: " + animals);
    }
}
