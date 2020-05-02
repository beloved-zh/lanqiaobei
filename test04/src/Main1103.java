import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main1103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] v = new int[m]; 
		int[] p = new int[m]; 
		
		for (int i = 0; i < m; i++) {
			v[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		List<Integer> x = new ArrayList<Integer>();
		
		for (int i = 0; i < p.length; i++) {
			x.add(f(n, i, 0, v, p));
		}
		
		Integer tem = 0;
		for (Integer i : x) {
			if (i > tem) {
				tem = i;
			}
		}
		System.out.println(tem);
	}
	
	public static int f(int n,int i,int max,int[] v,int[] p){
		if (n <= 0 || i >= v.length) {
			return max;
		}
		n -= v[i];
		max += v[i] * p[i];
		i++;
		return f(n, i, max, v, p);
	}
}
