import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListCollector {
 public static void main(String[] args) {
    List<String> l = Arrays.asList("Vinay","Varma","vin","var");

    List<String> nl = l.stream().filter(name->name.startsWith("V")).collect(Collectors.toList());
    Iterator i = nl.iterator();

    while (i.hasNext()) {
        System.out.println(i.next());
    }
    
 }
}
