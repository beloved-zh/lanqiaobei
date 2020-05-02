import java.util.Scanner;


public class demo09 {

	public static void main(String[] args) {
		/*
		 * 问题描述
		　　小明每天都要练功，练功中的重要一项是梅花桩。
		　　小明练功的梅花桩排列成 n 行 m 列，相邻两行的距离为 1，相邻两列的距离也为 1。
		　　小明站在第 1 行第 1 列上，他要走到第 n 行第 m 列上。小明已经练了一段时间，他现在可以一步移动不超过 d 的距离（直线距离）。
		　　小明想知道，在不掉下梅花桩的情况下，自己最少要多少步可以移动到目标。
			输入格式
			　　输入的第一行包含两个整数 n, m，分别表示梅花桩的行数和列数。
			　　第二行包含一个实数 d（最多包含一位小数），表示小明一步可以移动的距离。
			输出格式
			　　输出一个整数，表示小明最少多少步可以到达目标。
			样例输入
			3 4
			1.5
			样例输出
			3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		double d;
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextDouble();
		
		int s = (int)(d/Math.sqrt(2));
		
		int min = Math.min(n, m);
		
		int a = (min-1)/s;
		
		int num = 0;
		for (int i = ((a*s)+1); i < n; i+=(int)d) {
			num++;
		}
		 
		for (int i = ((a*s)+1); i < m; i+=(int)d) {
			num++;
		}
		
		System.out.println(num+a);
	}
}
