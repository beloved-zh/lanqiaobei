import java.util.Scanner;


public class Main1449 {

	/**
	 * 观察这个数列：
		1  3  0  2  -1  1  -2  ...
		
		这个数列中后一项总是比前一项增加2或者减少3。
		
		栋栋对这种数列很好奇，他想知道长度为  n  和为  s  而且后一项总是比前一项增加a或者减少b的整数数列可能有多少种呢？
		
		样例说明
		这两个数列分别是2  4  1  3和7  4  1  -2。
		数据规模和约定
		对于100%的数据，1< =n< =1000，-1,000,000,000< =s< =1,000,000,000，1< =a,  b< =1,000,000。
		
		输入
		输入的第一行包含四个整数  n  s  a  b，含义如前面说述。 
		输出
		输出一行，包含一个整数，表示满足条件的方案数。由于这个数很大，请输出方案数除以100000007的余数。 
		样例输入
		
		4  10  2  3 
		
		样例输出
		
		2
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int s = sc.nextInt(); 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		
		int num = 0;
		for (int i = 0; i < 10; i++) {
			int sum = f(--n, a, b, i,1);
			if (sum == s) {
				num++;
			}
		}
		System.out.println(num);
	}
	
	public static int f(int n,int a,int b,int i,int m){
		int sum = i;
		if (n==0) {
			return sum;
		}
		if (m % 2 == 0) {
			i -=  b;
		} else {
			i +=  a;
		}
		sum += i;
		return f(--n, a, b, i,++m);
	}
}
