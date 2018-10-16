import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Janek");
        names.add("Kuba");
        names.add("Ania");
        names.add("Maria");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}