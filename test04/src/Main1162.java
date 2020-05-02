import java.util.Scanner;


public class Main1162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		String[] arr = new String[m];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		
		for (String s : arr) {
			int num = 0;
			if (s.length() >= 8 && s.length() < 16) {
				if (s.matches(".*[a-z]+.*")) {
					num++;
				}
				if (s.matches(".*[A-Z]+.*")) {
					num++;
				}
				if (s.matches(".*[0-9]+.*")) {
					num++;
				}
				if (s.matches(".*[\\~\\!\\@\\#\\$\\%\\^]+.*")) {
					num++;
				}
				if (num >= 3) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
				continue;
			}
		}
	}
	
}
