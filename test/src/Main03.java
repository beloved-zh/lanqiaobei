import java.util.Scanner;


public class Main03 {

	public static void main(String[] args) {
		demo01();
	}
	
	static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 4. 字母图形
			问题描述
				利用字母可以组成一些美丽的图形，下面给出了一个例子：
				ABCDEFG
				BABCDEF
				CBABCDE
				DCBABCD
				EDCBABC
				这是一个 5 行 7 列的图形，请找出这个图形的规律，并输出一个 n 行 m列的图形。
			输入格式
				输入一行，包含两个整数 n 和 m，分别表示你要输出的图形的行数的列数。
			输出格式
				输出 n 行，每个 m个字符，为你的图形。
			样例输入
				5 7
			样例输出
				ABCDEFG
				BABCDEF
				CBABCDE
				DCBABCD
				EDCBABC
			数据规模与约定
			1 <= n, m <= 26
	 */
	public static void demo04(){
		int m,n;
		n = sc.nextInt();
		m = sc.nextInt();
		//A 65
		for (int i = 0; i < n; i++) {
			int num = 0;
			for (int j = 65+i; j >= 65 && num < m; j--) {
				System.out.print((char)j);
				num++;
			}
			for (int j = 66; j < 65+m && num < m; j++) {
				System.out.print((char)j);
				num++;
			}
			System.out.println();
		}
	}
	
	/**
	 * 3. 01 字串
			问题描述
				对于长度为 5 位的一个 01 串，每一位都可能是 0 或 1，一共有 32 种可能。 它们的前几
			个是：
			    00000
			    00001
			    00010
			    00011
			    00100
				请按从小到大的顺序输出这 32 种 01 串。
			输入格式
				本试题没有输入。
			输出格式
				输出 32 行，按从小到大的顺序每行一个长度为 5 的 01 串。
			样例输出
			    00000	0
			    00001	1
			    00010	2
			    00011	3
	 */
	public static void demo03(){
		
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				for (int c = 0; c < 2; c++) {
					for (int d = 0; d < 2; d++) {
						for (int e = 0; e < 2; e++) {
							System.out.println(a+""+b+""+c+""+d+""+e);
						}
					}
				}
			}
		}
		
	}
	
	public static void demo03_02(){
		for (int i = 0; i < 32; i++) {
			String s = Integer.toBinaryString(i);
			if (s.length() != 5) {
				for (int j = 0; j < 5-s.length(); j++) {
					System.out.print("0");
				}
			}
			System.out.println(s);
			
		}
	}
	
	
	
	/**
	 * 
		2. 实数输出
			问题描述
			给定圆的半径 r ，求圆的面积。
			输入格式
			  输入包含一个整数 r ，表示圆的半径。
			输出格式
			  输出一行，包含一个实数，四舍五入保留小数点后 7 位，表示圆的面积。
			说明：在本题中，输入是一个整数，但是输出是一个实数。
			     对于实数输出的问题， 请一定看清楚实数输出的要求， 比如本题中要求保留小数点后 7
			     位，则你的程序必须 严格的 输出 7 位小数， 输出过多或者过少的小数位数都是不行的， 都会
		             被认为错误。
		             实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。
			样例输入
			  4	
			样例输出
			  50.2654825
			数据规模与约定
			1 <= r <= 10000 。
			提示
			    本题对精度要求较高，请注意 π的值应该取较精确的值。你可以使用常量来表示 π，
			    比如 PI=3.14159265358979323 ，也可以使用数学公式来求 π，比如 PI=atan(1.0)*4
			    
	 */
	public static void demo02(){
		int r = sc.nextInt();
		
		//字符串格式化输出				  7代表小数点后7位	f表示是浮点类型
		String area = String.format("%.7f", (Math.PI * r * r));
		
		System.out.println(area);
		
	}
	
	public static void demo02_02(){
		int r = sc.nextInt();
		
		double d = (Math.PI * r * r);
		//先乘10000000 经过 四舍五入后在除10000000.0
		d = Math.round(d * 10000000) / 10000000.0;
		
		System.out.println(d);
	}
	
	
	/**
	 * 1. Fibonacci 数列
			问题描述
			Fibonacci 数列的递推公式为： Fn=Fn-1+Fn-2，其中 F1=F2=1。
			当 n 比较大时， Fn也非常大，现在我们想知道， Fn 除以 10007 的余数是多少。
			输入格式
			  输入包含一个整数 n。
			输出格式
			  输出一行，包含一个整数，表示 Fn除以 10007 的余数。
			说明：在本题中，答案是要求 Fn 除以 10007 的余数，因此我们只要能算出这个余数即
			     可，而不需要先计算出 Fn的准确值，再将计算的结果除以 10007 取余数，直接计算余数往
			     往比先算出原数再取余简单。
			样例输入
			  10
			样例输出
			  55
			样例输入
			  22
			样例输出
			  7704
			数据规模与约定
			  1 <= n <= 1,000,000 
	 */
	public static void demo01(){
		int n = sc.nextInt();
		int f1 = 1;
		int f2 = 1;
		int fn = 0;
		if (n == 1 || n== 2) {
			System.out.println(1%10007);
		} else {
			for (int i = 3; i <= n; i++) {
				if (f1 > 10007) {
					f1 %=  10007;
				}
				if (f2 > 10007) {
					f2 %=  10007;
				}
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
			}
			System.out.println(fn%10007);
		}
	}
}
