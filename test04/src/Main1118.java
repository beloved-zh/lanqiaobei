import java.util.Scanner;


public class Main1118 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String n = sc.nextLine();
			int sum = 0;
			for (int i = 0; i < n.length(); i++) {
				sum += Integer.parseInt(n.charAt(i)+"");
			}
			System.out.println(sum);
		}
		
	}
}
