import java.util.Arrays;
import java.util.Scanner;


public class Main1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr[9] = sc.nextInt();
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
}
