package methodFReference;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
public class MethodReferences {

  MethodReferences(){
    System.out.println("This is the MethodReference Constructor.");
  }
    public static Integer cal(int i){
        return i*i;
    }
    public Integer doubleNum(int i){
        return 2*i;
    }
}
 class Test {
  public static void main(String[] args) {
    //Static method reference
    Function<Integer,Integer> square= MethodReferences::cal;
    System.out.println(square.apply(5));
    //Non-Static method reference 
    MethodReferences sr = new MethodReferences();
    Function<Integer,Integer> twoTimes = sr::doubleNum;
    System.out.println(twoTimes.apply(5));
    //Reference to a arbitrary object of a particular type 
    List<String> l = Arrays.asList("vin","dsjs","ksjn");
    l.forEach(System.out::println);
    //Constructor Reference
    Supplier<MethodReferences> s = MethodReferences::new;
    System.out.println(s.get());

  }
    
}
