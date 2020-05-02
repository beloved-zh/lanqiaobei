import java.util.Scanner;


public class Test04 {

	/**
	 * 
		��������
		����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ��
		����0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ�
		�ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1��
		����ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11��
		�Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
		��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
		�����ʽ
		�����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
		�����ʽ
		����������������16���Ʊ�ʾ
		��������
		30		30%16 14
		255		
		�������
		1E
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println(0);
			return;
		}
		
		String s = "";
		while (n != 0) {
			int m = n % 16;
			n /= 16;
			switch (m) {
			case 10:
				s = "A" + s;
				break;
			case 11:
				s = "B" + s;
				break;
			case 12:
				s = "C" + s;
				break;
			case 13:
				s = "D" + s;
				break;
			case 14:
				s = "E" + s;
				break;
			case 15:
				s = "F" + s;
				break;
			
			default:
				s = m + "" + s;
				break;
			}
		}
		
		System.out.println(s);
		
	}
	
}
