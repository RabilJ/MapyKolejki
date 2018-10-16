import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args)throws IOException {


        File file = new File("numery.txt");
        BufferedReader bfr = new BufferedReader(new FileReader(file));
        String line = "";
        List<Integer> numery = new ArrayList<>();
        while((line=bfr.readLine())!=null){
            String[]values = line.split(" ");
            for (int i = 0; i < values.length; i++) {
                numery.add(Integer.parseInt(values[i]));
            }
        }
        Collections.sort(numery);
        System.out.println(numery);
        System.out.println("Najmniejsza liczba: "+Collections.min(numery));
        System.out.println("Największa liczba: "+Collections.max(numery));
        System.out.println("Index pierwszego wystąpienia liczby 15: "+ Collections.binarySearch(numery,15));
    }
}