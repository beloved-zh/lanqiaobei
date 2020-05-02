import java.util.Arrays;
import java.util.Scanner;


public class Main04 {

	/**
	 * 
		问题 1116: IP判断
		
		题目描述
		
		在基于Internet的程序中，我们常常需要判断一个IP字符串的合法性。
		合法的IP是这样的形式：
		A.B.C.D
		其中A、B、C、D均为位于[0, 255]中的整数。为了简单起见，我们规定这四个整数中不允许有前导零存在，如001这种情况。
		现在，请你来完成这个判断程序吧^_^
		输入
		
		输入由多行组成，每行是一个字符串，输入由“End of file”结束。
		字符串长度最大为30，且不含空格和不可见字符
		输出
		
		对于每一个输入，单独输出一行
		如果该字符串是合法的IP，输出Y，否则，输出N
		样例输入
		
		1.2.3.4
		a.b.c.d
		267.43.64.12
		12.34.56.bb
		210.43.64.129
		-123.4.5.6
		
		样例输出
		
		Y
		N
		N
		N
		Y
		N
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		//拆分字符串	.是特殊字符 加\\转义
		String[] s = str.split("\\.");
		
		boolean b = false;
		
		for (String s1 : s) {
			if (s1.charAt(0) == '0') {//判断是否是0开头
				System.out.println("N");
				return;
			}
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9' ) {//判断是纯数字
					if (Integer.parseInt(s1) > 0 && Integer.parseInt(s1) <= 255) {//判断范围
						b = true;
					}else {
						System.out.println("N");
						return;
					}
				}else {
					System.out.println("N");
					return;
				}
				
			}
		}
		
		if (b) {
			System.out.println("Y");
		} else {
			System.out.println("N");

		}
		
	}
	
}
