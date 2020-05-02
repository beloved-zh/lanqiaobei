import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main1102 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<Integer> set = new HashSet<Integer>(); 
		
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		
		Object[] arr = set.toArray();
		
		Arrays.sort(arr);
		
		System.out.println(set.size());
		for (Object o : arr) {
			System.out.print(o+" ");
		}
		
	}
	
}
