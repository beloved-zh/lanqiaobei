import java.util.Scanner;


public class Test11 {

	/**
	 * 
		��������
		
		������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
		
		ABCDEFG
		
		BABCDEF
		
		CBABCDE
		
		DCBABCD
		
		EDCBABC
		
		����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
		�����ʽ
		����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
		�����ʽ
		���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
		��������
		5 7
		�������
		ABCDEFG
		BABCDEF
		CBABCDE
		DCBABCD
		EDCBABC
		���ݹ�ģ��Լ��
		1 <= n, m <= 26��

	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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
}
