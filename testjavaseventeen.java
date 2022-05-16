import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class testjavaseventeen {
	public static void main(String a[]) {
		RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);
		System.out.println(randomGenerator.getClass());
		int counter = 0;
        while(counter<=10){
           int result = randomGenerator.nextInt(11);
           System.out.println(result);
           counter++;
        }
	}
}