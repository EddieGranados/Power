import java.util.*;

public class power {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		double x = a.nextInt();
		double y = b.nextInt();
		double z = c.nextInt();
				
		System.out.println("Math.pow(" + x + "," + z + ")=" + Math.pow(x, y));
		System.out.println("Math.pow(" + y + "," + z + ")=" + Math.pow(y, x));
		
		
		
	}

}
