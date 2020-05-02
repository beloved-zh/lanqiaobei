import java.util.Scanner;


public class Main1397 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			
			int num = 0;
			while (n >= 1) {
				
				n /= 2;
				num++;
			}
			System.out.println(num);
		}
		
	}
	
}
