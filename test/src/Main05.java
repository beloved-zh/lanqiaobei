import java.util.Scanner;


public class Main05 {

	/**
	 *  问题描述
		求1+2+3+...+n的值。
		输入格式
		1	1
		2	3	
		3	6	
		4	10
		
		输入包括一个整数n。
		输出格式
		输出一行，包括一个整数，表示1+2+3+...+n的值。
		样例输入
		4
		样例输出
		10
		样例输入
		100
		
		说明：有一些试题会给出多组样例输入输出以帮助你更好的做题。
		
		一般在提交之前所有这些样例都需要测试通过才行，但这不代表这几组样例数据都正确了你的程序就是完全正确的，潜在的错误可能仍然导致你的得分较低。
		样例输出
		5050
		数据规模与约定
		1 <= n <= 1,000,000,000。 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
		long sum = 0;
		
		if (n % 2 == 0) {//偶数
			
			sum = (1 + n) * (n / 2);
			
		} else {//奇数
			//先-1	算出偶数的值，在加上输入的数
			sum = (1 + (n-1)) * ((n-1) / 2);
			sum += n;
			
		}
		
		System.out.println(sum);
	}
	
}
