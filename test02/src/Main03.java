import java.math.BigInteger;
import java.util.Scanner;


public class Main03 {

	/**
	 * 
		问题描述
		　　给定L,R。统计[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
		　　如5的二进制为101，包含2个“1”。
		输入格式
		　　第一行包含2个数L,R
		输出格式
		　　一个数S，表示[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
		样例输入
		2 3
		样例输出
		3
		数据规模和约定
		　　L<=R<=100000;
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuffer s = new StringBuffer();
		for (int i = a; i <= b; i++) {
			String s1 = Integer.toBinaryString(i);
			s1 = s1.replaceAll("0", "");
			s = s.append(s1);
		}
		

		System.out.println(s.length());
	}
	
}
