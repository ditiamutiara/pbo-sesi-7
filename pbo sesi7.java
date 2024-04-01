import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Generic class
class MyGenericClass<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

// Generic method
class MyCollectionClass {

    public static <K, V> void addToMap(Map<K, V> map, K key, V value) {
        map.put(key, value);
    }

    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Creating a new generic class
        MyGenericClass<Integer> myIntClass = new MyGenericClass<Integer>();
        myIntClass.setData(10);
        System.out.println("Data: " + myIntClass.getData());

        // Using List and Map collections
        List<String> myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("World");

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        addToMap(myMap, "One", 1);
        addToMap(myMap, "Two", 2);

        System.out.println("List: ");
        printList(myList);

        System.out.println("Map: ");
        System.out.println(myMap.get("One"));
        System.out.println(myMap.get("Two"));
    }
}