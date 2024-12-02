import java.util.function.UnaryOperator;

interface Calculate{
  
    int cal(int n);
}
public class FunctionalInterfaces {
  public static void main(String[] args) {
    UnaryOperator<Integer> square = x-> x*x;

    System.out.println(square.apply(5));

    Calculate multiply = x-> x*2;

    System.out.println(multiply.cal(5));

  }
}
