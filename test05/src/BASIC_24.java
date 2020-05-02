import java.util.Scanner;

/**
 * πÍÕ√»¸≈‹‘§≤‚
 */
public class BASIC_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();
		
		int l1 = 0,l2 = 0,time = 0;
		
		while (l1 < l && l2 < l) {
			if (l1 - l2 >= t) {
				for (int i = 0; i < s; i++) {
					l2 += v2;
					time++;
					if (l2 >= l) {
						break;
					}
				}
			} else {
				l1 += v1;
				l2 += v2;
				time++;
			}
		}
		
		if (l1 > l2) {
			System.out.println("R");
		} else if (l2 > l1){
			System.out.println("T");
		} else {
			System.out.println("D");
		}
		System.out.println(time);
	}
	
}
