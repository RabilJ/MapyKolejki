import java.io.*;
import java.util.*;

public class MapaTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Customer> people = new HashMap<>();
        File file = new File("customers.csv");
        BufferedReader bfr = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bfr.readLine()) != null) {
            String[] values = line.split(",");
            if (values.length == 4) {
                String id = values[0];
                String name = values[1];
                String surname = values[2];
                String tel = values[3];
                int idAsInt = Integer.parseInt(id);
                Customer cust = new Customer(idAsInt, name, surname, tel);
                people.put(cust.getId(), cust);
            }
        }
//        Set<Integer> keySet = people.keySet();
//        Collection<Customer> values = people.values();
//        System.out.println(keySet);
//        for (Customer value : values) {
//            System.out.println(value);
//
//        }

        findById(people);
    }

    public static void findById(HashMap<Integer, Customer> map) {
        boolean check = true;
        while (check) {
            System.out.println("Podaj id klienta: ");
            try {
                int id = sc.nextInt();
                Set<Integer> keySet = map.keySet();
                Customer customer = map.get(id);
                if (customer != null) {
                    System.out.println("Znaleziono klienta!");
                    System.out.println(customer);
                    check = false;
                } else {
                    System.out.println("Nie ma takiego klienta, spróbuj ponownie");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Podałeś nieprawidłową wartość spróbuj ponownie");
                sc.next();
            }
        }
    }
}
//Tablice zachowana kolejnosc, latwo wyciagnac konkretny element i wstawic
//Zbiory, nieuporzadkowane, bez duplikatow
//Kolejki
//Mapy - klucze i wartości nasze !go to!