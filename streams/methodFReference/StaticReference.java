package methodFReference;
import java.util.function.Function;
public class StaticReference {

    public static Integer cal(int i){
        return i*i;
    }
}
 class Test {
  public static void main(String[] args) {
    Function<Integer,Integer> square= StaticReference::cal;
    System.out.println(square.apply(5));
  }
    
}
