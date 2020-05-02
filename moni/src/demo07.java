import java.util.Scanner;


public class demo07 {

	public static void main(String[] args) {
		/*
		 * 问题描述
			　　小明非常不喜欢数字 2，包括那些数位上包含数字 2 的数。如果一个数的数位不包含数字 2，小明将它称为洁净数。
			　　请问在整数 1 至 n 中，洁净数有多少个？
			输入格式
			　　输入的第一行包含一个整数 n。
			输出格式
			　　输出一行包含一个整数，表示答案。
			样例输入
			30
			样例输出
			18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if ((i+"").indexOf('2') < 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
}
