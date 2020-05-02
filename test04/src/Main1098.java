import java.util.Scanner;


public class Main1098 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int h = sc.nextInt();
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((h+30) >= arr[i]) {
				num++;
			}
		}
		System.out.println(num);
		
	}
	
}
