import java.util.Arrays;
import java.util.Scanner;


public class Main04 {

	/**
	 * 
		���� 1116: IP�ж�
		
		��Ŀ����
		
		�ڻ���Internet�ĳ����У����ǳ�����Ҫ�ж�һ��IP�ַ����ĺϷ��ԡ�
		�Ϸ���IP����������ʽ��
		A.B.C.D
		����A��B��C��D��Ϊλ��[0, 255]�е�������Ϊ�˼���������ǹ涨���ĸ������в�������ǰ������ڣ���001���������
		���ڣ��������������жϳ����^_^
		����
		
		�����ɶ�����ɣ�ÿ����һ���ַ����������ɡ�End of file��������
		�ַ����������Ϊ30���Ҳ����ո�Ͳ��ɼ��ַ�
		���
		
		����ÿһ�����룬�������һ��
		������ַ����ǺϷ���IP�����Y���������N
		��������
		
		1.2.3.4
		a.b.c.d
		267.43.64.12
		12.34.56.bb
		210.43.64.129
		-123.4.5.6
		
		�������
		
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
		
		//����ַ���	.�������ַ� ��\\ת��
		String[] s = str.split("\\.");
		
		boolean b = false;
		
		for (String s1 : s) {
			if (s1.charAt(0) == '0') {//�ж��Ƿ���0��ͷ
				System.out.println("N");
				return;
			}
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9' ) {//�ж��Ǵ�����
					if (Integer.parseInt(s1) > 0 && Integer.parseInt(s1) <= 255) {//�жϷ�Χ
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
