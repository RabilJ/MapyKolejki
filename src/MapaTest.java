import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapaTest {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Customer> people = new HashMap<>();
        File file = new File("customers.csv");
        file.createNewFile();
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
        Set<Integer> keySet = people.keySet();
        Collection<Customer> values = people.values();
        System.out.println(keySet);
        for (Customer value : values) {
            System.out.println(value);

        }

        findById(people,433);
    }
    public static void findById (HashMap<Integer, Customer>map, int id){
        try {
            Set<Integer>keySet = map.keySet();
            Customer customer = map.get(id);
            if (customer!=null)
                    System.out.println("Znaleziono klienta!");
                    System.out.println(map.get(id));
        } catch (NullPointerException ex) {
            System.out.println("Nie ma takiego klienta w naszej bazie danych..");
        }
    }
}