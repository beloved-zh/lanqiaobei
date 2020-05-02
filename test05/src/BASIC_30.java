import java.math.BigInteger;
import java.util.Scanner;

/**
 * ½×³Ë¼ÆËã
 */
public class BASIC_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger sum = new BigInteger("1");
		
		for (int i = 1; i <= n; i++) {
			BigInteger b1 = new BigInteger(i+"");
			
			sum = sum.multiply(b1);
			
		}
		
		System.out.println(sum);
	}
}
