import java.util.Scanner;


public class demo06 {

	public static void main(String[] args) {
		/*
		 * 问题描述
			　　在数列 a_1, a_2, ..., a_n中，定义两个元素 a_i 和 a_j 的距离为 |i-j|+|a_i-a_j|，即元素下标的距离加上元素值的差的绝对值，其中 |x| 表示 x 的绝对值。
			　　给定一个数列，请问找出元素之间最大的元素距离。
			输入格式
			　　输入的第一行包含一个整数 n。
			　　第二行包含 n 个整数 a_1, a_2, ..., a_n，相邻的整数间用空格分隔，表示给定的数列。
			输出格式
			　　输出一行包含一个整数，表示答案。
			样例输入
			5
			9 4 2 4 7
			样例输出
			9
			样例说明
			　　a_1 和 a_3 的距离为 |1-3|+|9-2|=9
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = 0;
		if (n % 2 == 0) {
			m = n/2;
		}else {
			m = (n/2) + 1;
		}
		int max = 0;
		for (int i = 0; i < m; i++) {
			int s = f1(i,arr);
			if (s > max) {
				max = s;
			}
		}
		System.out.println(max);
	}
	
	public static int f1(int i,int[] arr) {
		int max = 0;
		for (int j = i; j < arr.length; j++) {
			int s = Math.abs(i-j)+Math.abs((arr[i]- arr[j]));
			if (s > max) {
				max = s;
			}
		}
		return max;
	}
}
