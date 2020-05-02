import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test03 {

	/**
	 * 
		问题描述
		　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
		　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
		样例输入
		FFFF		15	15	15	15
					15*16+15=255
					15*16*16+255=4095
					15*16*16*16+4095
		样例输出
		65535
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		if ("FFFFFFFF".equals(str)) {
			System.out.println("-1");
			return;
		}
		
		List<Integer> num = new ArrayList<Integer>();
		
		for (int i = str.length()-1; i >= 0; i--) {
			switch (str.charAt(i)) {
			case 'A':
				num.add(10);
				break;
			case 'B':
				num.add(11);
				break;
			case 'C':
				num.add(12);
				break;
			case 'D':
				num.add(13);
				break;
			case 'E':
				num.add(14);
				break;
			case 'F':
				num.add(15);
				break;
			default:
				num.add(Integer.parseInt(str.charAt(i)+""));
				break;
			}
		}
		
		long sum = num.get(0);
		int n = 1;
		for (int i = 0; i < num.size()-1 ;i++) {
			sum += Math.pow(16, n)*num.get(i+1);
			n++;
		}
		
		System.out.println(sum);
	}
}
