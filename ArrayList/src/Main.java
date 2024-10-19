import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");


        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("Duyệt theo kiểu ArrayList:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Phần tử thứ " + i + ": " + names.get(i));
        }
    }
}
