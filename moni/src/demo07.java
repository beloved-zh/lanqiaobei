import java.util.Scanner;


public class demo07 {

	public static void main(String[] args) {
		/*
		 * ��������
			����С���ǳ���ϲ������ 2��������Щ��λ�ϰ������� 2 ���������һ��������λ���������� 2��С��������Ϊ�ྻ����
			�������������� 1 �� n �У��ྻ���ж��ٸ���
			�����ʽ
			��������ĵ�һ�а���һ������ n��
			�����ʽ
			�������һ�а���һ����������ʾ�𰸡�
			��������
			30
			�������
			18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if ((i+"").indexOf('2') < 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
}
