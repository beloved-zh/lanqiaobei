import java.util.Scanner;


public class Main1117 {

	/**
	 * 
	 * 考虑包含N位数字的K-进制数. 定义一个数有效, 如果其K-进制表示不包含两连续的0.
		
		考虑包含N位数字的K-进制数. 定义一个数有效, 如果其K-进制表示不包含两连续的0.
		
		例:
		1010230 是有效的7位数
		1000198 无效
		0001235 不是7位数, 而是4位数.
		
		给定两个数N和K, 要求计算包含N位数字的有效K-进制数的总数.
		
		假设2 <= K <= 10; 2 <= N; 4 <= N+K <= 18.
		输入
		
		两个十进制整数N和K
		输出

		十进制表示的结果
		样例输入
		
		2
		10
		
		样例输出
		
		90
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(f(n,k));
	}
	
	public static int f(int n,int k){
		if (n == 1) {
			return k-1;
		} else if(n == 2){
			return (k-1)*k;
		} else {
			return (f(n-1,k)+f(n-2,k))*(k-1);
		}
	}
	
}
