import java.math.BigInteger;
import java.util.Scanner;


public class Main03 {

	/**
	 * 
		��������
		��������L,R��ͳ��[L,R]�����ڵ��������ڶ������°����ġ�1���ĸ���֮�͡�
		������5�Ķ�����Ϊ101������2����1����
		�����ʽ
		������һ�а���2����L,R
		�����ʽ
		����һ����S����ʾ[L,R]�����ڵ��������ڶ������°����ġ�1���ĸ���֮�͡�
		��������
		2 3
		�������
		3
		���ݹ�ģ��Լ��
		����L<=R<=100000;
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
