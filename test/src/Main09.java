import java.util.Scanner;


public class Main09 {

	/**
	 * 
		题目描述
		
		输入一个华氏温度，要求输出摄氏温度。公式为 c=5(F-32)/9，取位2小数。
		输入
		
		一个华氏温度，浮点数
		输出
		
		摄氏温度，浮点两位小数
		样例输入
		
		-40
		
		样例输出
		
		c=-40.00


	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double f = sc.nextDouble();
		
		double c = 5*(f-32)/9;
		
		System.out.println("c="+String.format("%.2f", c));
		
	}
	
}
