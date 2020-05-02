import java.util.Scanner;


public class Test01 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		test03();
	}
	
	/**
	 * 求以下三数的和,保留2位小数 1~a之和 1~b的平方和 1~c的倒数和
	 */
	public static void test01(){
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		float sumA = 0;
		float sumB = 0;
		float sumC = 0;
		
		for (int i = 1; i <= a; i++) {
			sumA += i;
		}
		for (int i = 1; i <= b; i++) {
			sumB += Math.pow(i, 2);
		}
		for (int i = 1; i <= c; i++) {
			sumC += (1/(double)i);
		}
		
		float sum = sumA+sumB+sumC;

		System.out.println(String.format("%.2f", sum));
	}

	/**
	 * 打印出所有"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该本身。 
	 * 例如：153是一个水仙花数，因为153=1^3+5^3+3^3。
	 */
	public static void test02(){
		for (int i = 100; i < 1000; i++) {
			int sum = 0;
			int n = i;
			while (n > 0) {
				int m = n % 10;
				n /= 10;
				sum += Math.pow(m, 3);
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * 有一分数序列： 2/1 3/2 5/3 8/5 13/8 21/13...... 
	 * 求出这个数列的前N项之和，保留两位小数
	 */
	public static void test03(){
		
		int n = sc.nextInt();
		int a1 = 2;
		int a2 = 3;
		int b1 = 1;
		int b2 = 2;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				sum = ((double)a1/b1);
			}else if (i==1) {
				sum = ((double)a1/b1) +((double)a2/b2);
			}else {
				int a = a1 + a2;
				int b = b1 + b2;
				sum += ((double)a/b);
				a1 = a2;
				a2 = a;
				b1 = b2;
				b2 = b;
			}
		}
		System.out.printf("%.2f", sum);
		
	}
}
