import java.util.Random;
public class Z_RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		//boolean x = random.nextBoolean();
		//double x = random.nextDouble();
		System.out.println(x);

	}

}
