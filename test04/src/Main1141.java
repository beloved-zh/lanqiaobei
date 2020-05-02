
public class Main1141 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 33; j++) {
				int k = 100-i-j;
				if ((i*5) + (j*3) + (k/3.0) == 100) {
					System.out.printf("cock=%d,hen=%d,chicken=%d\n", i, j, k);
				}
			}
		}
		
	}
	
}
