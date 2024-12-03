package methodFReference;
import java.util.function.Function;
public class StaticReference {

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
    Function<Integer,Integer> square= StaticReference::cal;
    System.out.println(square.apply(5));
    //Non-Static method reference 
    StaticReference sr = new StaticReference();
    Function<Integer,Integer> twoTimes = sr::doubleNum;
    System.out.println(twoTimes.apply(5));
  }
    
}
