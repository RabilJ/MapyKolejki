import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Person> kolejka = new LinkedList<>();
        kolejka.offer(new Person("Jan","Nowak","897438274"));
        kolejka.offer(new Person("Marian","Paździoch","456545747"));
        kolejka.offer(new Person("Karolina","Przyczułek","456646456687"));
        kolejka.offer(new Person("Marzena","Kosa","8943967574"));

        for (Person person : kolejka) {
            System.out.println(person);
        }
    }
}
