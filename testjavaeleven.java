import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class testjavaeleven {
	public static void main(String a[]) {
	  List<String> list = Arrays.asList("a", "b", "c");
	  String result = list.stream()
        .map((var x) -> x.toUpperCase())
        .collect(Collectors.joining(","));
      System.out.println(result);
	}
}