import java.util.Scanner;


public class Main1108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int s = sc.nextInt();
		
		int t = sc.nextInt();
		
		int s1 = 0,s2 = 0;
		int ts = 0;
		while (t-- > 0) {
			if (m >= 10) {
				s1 += 60;
				m -= 10;
			} else {
				m += 4;
			}
			
			s2 += 17;
			
			s2 = Math.max(s1, s2);
			
			ts++;
			
			if (s2 > s) {
				break;
			}
		}
		
		if (s2 >= s) {
			System.out.println("Yes");
			System.out.println(ts);
		}else {
			System.out.println("No");
			System.out.println(s2);
		}
	}
	
}
